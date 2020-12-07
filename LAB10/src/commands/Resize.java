package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class Resize implements DrawCommand{

    DiagramCanvas canvas;
    private int width;
    private int height;
    private int index;
    private int oldWidth;
    private int oldHeight;

    public Resize( DiagramCanvas canvas, int index, int width, int height) {
        this.canvas = canvas;
        this.width = width;
        this.height = height;
        this.index = index;
        this.oldHeight = canvas.getComponent(index).getHeight();
        this.oldWidth = canvas.getComponent(index).getWeight();
    }

    @Override
    public void execute() {
        canvas.getComponent(index).setHeight(height);
        canvas.getComponent(index).setWeight(width);
    }

    @Override
    public void undo() {
        canvas.getComponent(index).setHeight(oldHeight);
        canvas.getComponent(index).setWeight(oldWidth);
    }
}
