package main;

import commands.*;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Stack;

/**
 * The layer between the client and the commands that need to be executed on the receivers (DiagramCanvas and DiagramComponent).
 * <br>
 * It is independent of the subtypes of commands, it just receives a command, runs it and implements a redo/undo mechanism.
 */
public class Invoker {


    Stack<DrawCommand> undo = new Stack<>();
    Stack<DrawCommand> redo = new Stack<>();
    /**
     * Clear up all the used resources, start fresh :D
     */
    public void restart() {
      // TODO
        undo =new Stack<>();
        redo = new Stack<>();

    }

    /**
     * Executes a given command
     * @param command
     */
    public void execute(DrawCommand command) {
        command.execute();
        undo.add(command);

    }

    /**
     * Undo the latest command
     */
    public void undo() {
        // TODO
        // Hint: use data structures to keep track of commands
        if(!undo.isEmpty()){
            DrawCommand command = undo.peek();
            command.undo();
            undo.pop();
            redo.add(command);
        } else {
            System.out.println("Can't undo!");
        }


    }

    /**
     * Redo command previously undone. Cannot perform a redo after an execute, only after at least one undo.
     */
    public void redo() {
        // TODO
            if(!redo.isEmpty()){
                execute(redo.peek());
                undo.add(redo.peek());
                redo.pop();
            } else {
                System.out.println("Can't redo");
            }




    }
}
