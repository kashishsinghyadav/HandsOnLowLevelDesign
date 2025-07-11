package TextDecorator;

public class ItalicEditor extends EditorTextDecorator{

    public ItalicEditor(Editor editor){
        super(editor);
    }

    @Override
    public void styleText() {
        editor.styleText();
        System.out.println("Italic Text Styple is applied");
    }
}
