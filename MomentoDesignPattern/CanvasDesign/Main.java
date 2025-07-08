public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        HistoryManager history = new HistoryManager();

        canvas.addShape("Circle");
        history.save(canvas.saveShape());

        canvas.addShape("Rectangle");
        history.save(canvas.saveShape());

        canvas.addShape("Triangle");
        history.save(canvas.saveShape());

        canvas.printShapes();
        canvas.restore(history.undo(canvas));
        canvas.printShapes();


        canvas.restore(history.undo(canvas));
        canvas.printShapes(); 


        canvas.restore(history.redo(canvas));
        canvas.printShapes();
    }
}
