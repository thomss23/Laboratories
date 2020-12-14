# Laboratory 13

### Task 1
Read from System.in and print out using a BufferedReader defined in the given code. Use a suggestive message when encountering an error and close the reader afterwards.
Use either try-with-resources or try-catch-finally.

### Task 2

Define a class that implements operations on double numbers. Operations will throw exceptions. 
The class will need to implement the ```Calculator``` interface, which contains three methods:

* ```add``` - receives 2 numbers and return a ```double```
* ```divide``` - takes 2 numbers and returns a ```double```
* ```average``` - takes a collection of objects of type ```double``` and returns their average as a ```double``` number. Use the add and divide methods here.

* The methods throw the following exceptions (defined in the ```Calculator``` interface)
 * ```NullParameterException``` - if any of the parameters is ```null```
 * ```OverflowException``` - if the sum of 2 numbers is equal to ```Double.POSITIVE_INFINITY```
 * ```UnderflowException``` - if the sum of 2 numbers is equal to ```Double.NEGATIVE_INFINITY```
* Complete the main method in ```MainEx2```

### Task 3

We want to implement a Logger based on the Chain-of-responsibility pattern, which we will use to keep an event log of a program.
 * a) Create enum ```LogLevel```, which will act as a bitwise flag, containing the values - ```Info```, ```Debug```, ```Warning```, ```Error```, ```FunctionalMessage```, ```FunctionalError```. This enumeration will also expose a static method ```all ()```  that will return a collection ```EnumSet <LogLevel>```  in which all of the above values will be stored.
  * b) Create an abstract class ```LoggerBase```:
    * will receive an EnumSet <LogLevel> object in the constructor that will define for the log levels where the message will be displayed
    * will keep a reference to the next ```LoggerBase``` object where the message will be sent
    * will expose a public method ```setNext```  that will receive a LoggerBase object and set the next delegate from the responsibility list
    * will define an abstract protected method ```writeMessage``` that will receive the message to be displayed
    * will expose a public method ```message```  that will receive the message to be displayed and a LogLevel object. If the logger instance contains this object in the collection received in the constructor, then the ```writeMessage``` method will be called. Then pass the message and the object to the next delegate on the responsibility list (if there is one)
  * c) Define the classes below that will extend``` LoggerBase``` and implement the ```writeMessage``` method:
    * I) ConsoleLogger - which will write all types of ```LogLevel``` objects (Hint: all ()) and prefix messages with [Console]
    * II) EmailLogger - which will write only ```FunctionalMessage``` and ```FunctionalError``` type objects and prefix messages with [Email]
    * III) FileLogger - which will only write ```Warning``` and ```Error``` types and prefix messages with [File]
    * IV) Complete the 2 remaining TODOs in the main method from class ```MainEx4```





