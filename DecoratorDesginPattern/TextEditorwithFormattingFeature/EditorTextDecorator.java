package TextDecorator;

public class EditorTextDecorator implements Editor{
    protected Editor editor;
    public EditorTextDecorator(Editor editor){
        this.editor=editor;
    }
    public void styleText(){
        editor.styleText();
    }
}
