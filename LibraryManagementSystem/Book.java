import java.util.ArrayList;
import java.util.List;

public abstract class Book {
    protected String bookId;
    protected String title;
    protected List<BookCopy> copies;

    public Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.copies = new ArrayList<>();
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public List<BookCopy> getCopies() {
        return copies;
    }

    public void addCopy(BookCopy copy) {
        copies.add(copy);
    }

    public BookCopy getAvailableCopy() {
        for (BookCopy copy : copies) {
            if (!copy.isIssued()) {
                return copy;
            }
        }
        return null;
    }

    public abstract String getCategory();
}
