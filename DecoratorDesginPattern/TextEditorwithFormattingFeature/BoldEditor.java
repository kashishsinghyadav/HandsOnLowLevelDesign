package TextDecorator;

public class BoldEditor extends   EditorTextDecorator{
    public BoldEditor(Editor editor){
        super(editor);
    }
    @Override
    public void styleText() {
        editor.styleText();
        System.out.println("Bold Text Styple is applied");
    }
}
