public abstract class Book {
    private String bookId;
    private String bookName;
    private int bookQuantity;

    public Book(String bookId, String bookName, int bookQuantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookQuantity = bookQuantity;
    }

    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    

}
