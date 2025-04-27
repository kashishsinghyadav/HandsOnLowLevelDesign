import java.util.HashMap;
import java.util.Map;

public class Student {
    private int stuId;
    private String stuName;
    private Map<String, BookCopy> issuedBooks;

    public Student(int stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.issuedBooks = new HashMap<>();
    }

    public int getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public Map<String, BookCopy> getIssuedBooks() {
        return issuedBooks;
    }

    public boolean canIssue() {
        return issuedBooks.size() < 3;
    }
}
