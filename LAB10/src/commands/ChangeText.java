package commands;

import diagram.DiagramCanvas;

public class ChangeText implements DrawCommand{

    DiagramCanvas canvas;
    String text;

    private int index;
    private String oldText;


    public ChangeText( DiagramCanvas canvas, int index ,String text) {
        this.canvas = canvas;
        this.index = index;
        this.text=text;
        this.oldText = canvas.getComponent(index).getText();
    }

    @Override
    public void execute() {
        canvas.getComponent(index).setText(text);
    }

    @Override
    public void undo() {
        canvas.getComponent(index).setText(oldText);
    }
}
