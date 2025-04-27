public class NonFictionBook extends Book {
    public NonFictionBook(String bookId, String title) {
        super(bookId, title);
    }

    @Override
    public String getCategory() {
        return "Non-Fiction";
    }
}
