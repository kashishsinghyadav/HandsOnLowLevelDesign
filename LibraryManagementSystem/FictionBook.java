public class FictionBook extends Book {
    public FictionBook(String bookId, String title) {
        super(bookId, title);
    }

    @Override
    public String getCategory() {
        return "Fiction";
    }
}
