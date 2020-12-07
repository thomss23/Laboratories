package commands;

import diagram.DiagramCanvas;

public class ChangeColor implements DrawCommand{

    DiagramCanvas canvas;
    private String color;
    private int index;
    private String text;
    private String firstColor;

    public ChangeColor(DiagramCanvas canvas,int index, String color) {
        this.canvas = canvas;
        this.color = color;
        this.index = index;
        this.firstColor=canvas.getComponent(index).getColor();

    }

    @Override
    public void execute() {

        canvas.getComponent(index).setColor(color);

    }

    @Override
    public void undo() {
        canvas.getComponent(index).setColor(firstColor);

    }
}
