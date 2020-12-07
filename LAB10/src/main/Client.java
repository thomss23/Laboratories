package main;

import commands.*;
import diagram.DiagramCanvas;
import diagram.DiagramComponent;

/**
 * Receives commands in clear text from the user and transforms them in DrawCommand objects. It uses the Invoker to
 * execute the given commands.
 */
public class Client {

    private Invoker invoker;
    private DiagramCanvas diagramCanvas;

    Client() {
        invoker = new Invoker();
        diagramCanvas = new DiagramCanvas();
    }

    public void showDiagram() {
        // TODO
        diagramCanvas.show();
    }

    public void newDiagram() {
        // TODO
        diagramCanvas = new DiagramCanvas();
        invoker.restart();
    }

    public void executeAction(String commandName, String ...args) {
        // TODO - uncomment:
        DrawCommand command;
        try {
            CommandType commandType = CommandType.fromString(commandName);
            command = getCommand(commandType, args);
            if (command == null) {
                throw new IllegalArgumentException();
            }

        } catch(IllegalArgumentException ex) {
            System.out.println("Invalid command: " + commandName);
            System.out.println("Available commands:");
            for (CommandType type : CommandType.values()) {
                System.out.println("\t- " + type.text);
            }
            return;
        }

        // TODO - Execute the action

        invoker.execute(command);

    }

    private DrawCommand getCommand(CommandType type, String ...args) throws IllegalArgumentException {
        // TODO factory method to create DrawCommand subclasses.

        if(type.text.equals(CommandType.DRAW_RECTANGLE.text)){
            return new DrawRectangle(new DiagramComponent(), diagramCanvas);
        }

        if(type.text.equals(CommandType.CHANGE_COLOR.text)){
            return new ChangeColor(diagramCanvas,Integer.parseInt(args[0]),args[1]);
        }

        if(type.text.equals(CommandType.CHANGE_TEXT.text)){
            return new ChangeText(diagramCanvas,Integer.parseInt(args[0]),args[1]);
        }

        if(type.text.equals(CommandType.RESIZE.text)){
            return new Resize(diagramCanvas,Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
        }

        if(type.text.equals(CommandType.CONNECT.text)){
            return new ConnectComponents(diagramCanvas,Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        }



        // If there is an exception when parsing the string arguments (NumberFormatException) catch it and
        // throw an IllegalArgumentException



        return null;
    }

    public void undo(){
        // TODO
        invoker.undo();
    }

    public void redo() {
        // TODO

        invoker.redo();
    }
}
