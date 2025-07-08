import java.util.List;

public class CanvasMemento {
    private final List<String> shapeList;

    public CanvasMemento(List<String>shapeList) {
        this.shapeList=shapeList;

    }
    public List<String> getShapeList(){
        return shapeList;
    }
}
