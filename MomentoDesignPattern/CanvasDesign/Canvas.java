import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private  List<String> shapeList = new ArrayList<>();

    public  void addShape(String shape){

        shapeList.add(shape);

    }
    public CanvasMemento saveShape(){
        return new CanvasMemento(new ArrayList<>(shapeList));

    }

    public void restore(CanvasMemento memento) {
        this.shapeList = new ArrayList<>(memento.getShapeList());
    }
    public void printShapes() {
        System.out.println("Current shapes: " + shapeList);
    }


}
