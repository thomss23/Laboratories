package commands;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class ConnectComponents implements DrawCommand {

    DiagramCanvas canvas;
    private int id1;
    private int id2;

    public ConnectComponents(DiagramCanvas canvas, int id1, int id2) {
        this.canvas = canvas;
        this.id1 = id1;
        this.id2 = id2;
    }

    @Override
    public void execute() {
        canvas.getComponent(id1).connectTo(Integer.toString(id2));
        canvas.getComponent(id2).connectTo(Integer.toString(id1));
    }

    @Override
    public void undo() {
        canvas.getComponent(id1).removeConnection(Integer.toString(id2));
        canvas.getComponent(id2).removeConnection(Integer.toString(id1));
    }
}
