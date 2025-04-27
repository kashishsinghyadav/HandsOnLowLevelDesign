public class BookCopy {
    private String copyId;
    private boolean isIssued;

    public BookCopy(String copyId) {
        this.copyId = copyId;
        this.isIssued = false;
    }

    public String getCopyId() {
        return copyId;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }
}
