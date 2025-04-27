public class BookFactory {
    public static Book createBook(String type, String bookId, String title) {
        switch (type.toLowerCase()) {
            case "science":
                return new ScienceBook(bookId, title);
            case "fiction":
                return new FictionBook(bookId, title);
            case "nonfiction":
                return new NonFictionBook(bookId, title);
            default:
                throw new IllegalArgumentException("Invalid book type: " + type);
        }
    }
}
