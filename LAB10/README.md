# Design Patterns lab part 2: Command

Design a mock application for creating and editing diagrams, using the Command pattern.

The pattern is used to encapsulate actions related to editing diagram components into objects. The drawing commands
will be executed by an Invoker, a middleware between the Client that gives the commands and their receiver, diagram
objects.


### Components

DiagramCanvas
- represents the diagram
- consists of DiagramComponents
- is the receiver in the CommandPattern

DiagramComponent
- represents a component such as a square in a diagram
- for simplicity we will not have subtypes for it
- the commands modify it

DrawCommand
- it is an interface implemented by all the commands
- the commands represent actions that can be performed on the canvas or its components

Invoker
- receives commands and executes them, it decoupled from the implementations of the commands
- supports an undo/redo mechanism

Client
- creates commands and passes them to the Invoker

Test
- entry-point
- contains several scenarios for testing commands
- uses the Client


### Task 1

Implement the following commands :
* Draw rectangle - creates a DiagramComponent and adds it to DiagramCanvas
* Resize - changes the width and height of a DiagramComponent
* Change color - changes the color of a DiagramComponent
* Change text - changes the text of a DiagramComponent
* Connect component - conntects 2 DiagramComponents

The commands receive in the constructor a reference to DiagramCanvas and other necessary parameters.
For example, the color change command must receive the new color and the index of the component.

### Task 2 

The *Test* class has methods to test the behaviour of the commands. Some are already implemented and some are not.

### Task 3

Implement the undo/redo mechanism in the *Invoker* class as well.
Use 2 data structures to keep track of the done and undone commands.

### Task 4

Run your code to test if the application works in the *Test* class.
