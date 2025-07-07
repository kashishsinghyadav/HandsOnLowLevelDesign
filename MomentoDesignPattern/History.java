class History {
    private Stack<EditorMemento> mementoStack = new Stack<>();

    public void save(EditorMemento memento) {
        mementoStack.push(memento);
    }

    public EditorMemento undo() {
        return mementoStack.pop();
    }
}
