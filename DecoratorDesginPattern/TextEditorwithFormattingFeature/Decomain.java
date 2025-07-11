package TextDecorator;

public class Decomain {
    public static void main(String[] args) {
        BaseEditor editor = new BaseEditor();
        BoldEditor bold = new BoldEditor(editor);
        bold.styleText();
        ItalicEditor italic = new ItalicEditor(editor);
        italic.styleText();
        UnderlineTextEditor underline = new UnderlineTextEditor(editor);
        underline.styleText();






    }
}
