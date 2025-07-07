class Editor {
    private String content = "";

    public void write(String text) {
        content += text;
    }

    public EditorMemento save() {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
    }

    public String getContent() {
        return content;
    }
}
