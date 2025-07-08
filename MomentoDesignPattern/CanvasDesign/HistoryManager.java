import java.util.Stack;

public class HistoryManager {
    private final Stack<CanvasMemento> undoStack = new Stack<>();
    private final Stack<CanvasMemento> redoStack = new Stack<>();

    public void save(CanvasMemento memento) {
        undoStack.push(memento);
        redoStack.clear();
    }

    public CanvasMemento undo(Canvas canvas) {
        if (!undoStack.isEmpty()) {
            redoStack.push(canvas.saveShape());
            return undoStack.pop();
        }
        return null;
    }

    public CanvasMemento redo(Canvas canvas) {
        if (!redoStack.isEmpty()) {
            undoStack.push(canvas.saveShape());
            return redoStack.pop();
        }
        return null;
    }
}
