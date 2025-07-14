public class Momentomain {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.write("Hello, "); 
        history.save(editor.save()); // Save snapshot

        editor.write("World!");
        history.save(editor.save()); // Save again

        System.out.println(editor.getContent()); // Hello, World!

        editor.restore(history.undo()); // Undo last write
        System.out.println(editor.getContent()); // Hello, 

        editor.restore(history.undo()); // Undo again
        System.out.println(editor.getContent()); // (empty)
    }
}
