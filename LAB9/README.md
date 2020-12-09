
# Laboratory 9

In this lab you will implement a mock application that receives data and processes it.
Its architecture will include the Observer, Strategy and Factory patterns and is described in the README file which can be found in the */src* folder.

### Task 1 - Observer Pattern


DataRepository is the observable object, which will receive new data from MainApp. When it receives new data it will notify
its observers: ConsoleLogger, ServerCommunicationController and DataAggregator.

We will use the Observer interface and the Observable class from java.util. If you want and have time you can implement your own Oberver-Observable interfaces.
Observer-Observable from java.util are deprecated since java 9 because they are too simple, but that makes them suitable for this lab. In a real application 
you can use other apis that are much more complex and offer many types of objects and mechanisms (the term used is reactive programming).

### Task 2 - Strategy Pattern


The StepCountStrategy interface that will be implemented by the "algorithms" of data processing:
BasicStepCountStrategy and FilteredStepCountStrategy. The first uses all the values received, and the second uses only those that meet certain conditions
(to be a positive number and not to be too high a value (more than 1000 steps) coming too soon from the last update received (in less than 1 minute).

### Task 3 - Factory Pattern


Create the StepCountStrategyFactory class that builds subclass instances of StepCountStrategy.

The factory class will contain a method to return a strategy. For example: ```public StepCountStrategy createStrategy (String strategyType, DataRepository dataRepository)```.
StrategyType can be a string indicating the type of strategy, see in Utils the strings already defined.

### Task 4 - Putting it all together

Run the code in MainApp.
