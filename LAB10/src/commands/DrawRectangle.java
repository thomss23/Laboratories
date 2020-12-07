package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class DrawRectangle implements  DrawCommand{

    DiagramComponent component;
    DiagramCanvas canvas;

    public DrawRectangle( DiagramComponent component, DiagramCanvas canvas) {
        this.component = component;
        this.canvas = canvas;
    }

    @Override
    public void execute() {
            this.canvas.addComponent(component);
    }

    @Override
    public void undo() {
        this.canvas.removeComponent(component);
    }
}
