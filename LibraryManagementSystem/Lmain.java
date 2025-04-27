public class Lmain {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();

        Book scienceBook = BookFactory.createBook("science", "S1", "Physics for Beginners");
        scienceBook.addCopy(new BookCopy("S1-C1"));
        scienceBook.addCopy(new BookCopy("S1-C2"));
        library.addBook(scienceBook);

        Book fictionBook = BookFactory.createBook("fiction", "F1", "Harry Potter");
        fictionBook.addCopy(new BookCopy("F1-C1"));
        library.addBook(fictionBook);

        Student student1 = new Student(1, "Kashish");
        library.addStudent(student1);

        library.issueBook("S1", 1);
        library.issueBook("F1", 1);

        
        library.returnBook("S1-C1", 1);
    }
}
