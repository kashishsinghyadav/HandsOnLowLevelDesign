package TextDecorator;

public class UnderlineTextEditor extends EditorTextDecorator{
    public UnderlineTextEditor(Editor editor){
        super(editor);
    }
    @Override
    public void styleText() {
        editor.styleText();
        System.out.println("Underline Text Styple is applied");
    }

}
