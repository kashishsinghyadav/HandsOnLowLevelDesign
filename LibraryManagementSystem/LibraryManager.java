import java.util.*;

public class LibraryManager {
    private Map<String, Book> books = new HashMap<>();
    private Map<Integer, Student> students = new HashMap<>();
    private Map<String, Long> issuedTime = new HashMap<>();
    private static final long THREE_DAYS_MILLIS = 3 * 24 * 60 * 60 * 1000L;
    private static final int FINE_PER_DAY = 10;

    public void addBook(Book book) {
        books.put(book.getBookId(), book); 
    }

    public void addStudent(Student student) {
        students.put(student.getStuId(), student);
    }

    public void issueBook(String bookId, int studentId) {
        Book book = books.get(bookId);
        Student student = students.get(studentId);

        if (book == null || student == null) {
            throw new RuntimeException("Book or Student not found");
        }

        if (!student.canIssue()) {
            throw new RuntimeException("Student has already issued max number of books.");
        }

        BookCopy copy = book.getAvailableCopy();
        if (copy == null) {
            throw new RuntimeException("No copies available");
        }

        copy.setIssued(true);
        student.getIssuedBooks().put(copy.getCopyId(), copy);
        issuedTime.put(copy.getCopyId(), System.currentTimeMillis());

        System.out.println("Book issued successfully to " + student.getStuName());
    }

    public void returnBook(String copyId, int studentId) {
        Student student = students.get(studentId);
        if (student == null || !student.getIssuedBooks().containsKey(copyId)) {
            throw new RuntimeException("Invalid Return Attempt");
        }

        BookCopy copy = student.getIssuedBooks().remove(copyId);
        copy.setIssued(false);

        long issueTime = issuedTime.remove(copyId);
        long returnTime = System.currentTimeMillis();

        long diffDays = (returnTime - issueTime) / (24 * 60 * 60 * 1000L);

        if (diffDays > 3) {
            int fine = (int)(diffDays - 3) * FINE_PER_DAY;
            System.out.println("Fine to be paid: ₹" + fine);
        } else {
            System.out.println("Book returned successfully with no fine.");
        }
    }
}
