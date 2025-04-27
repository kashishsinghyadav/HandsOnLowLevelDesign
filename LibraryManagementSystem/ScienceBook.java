public class ScienceBook extends Book {
    public ScienceBook(String bookId, String title) {
        super(bookId, title);
    }

    @Override
    public String getCategory() {
        return "Science";
    }
}
