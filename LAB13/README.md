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

*The methods throw the following exceptions (defined in the ```Calculator``` interface)
 * ```NullParameterException``` - if any of the parameters is ```null```
 * ```OverflowException``` - if the sum of 2 numbers is equal to ```Double.POSITIVE_INFINITY```
 * ```UnderflowException``` - if the sum of 2 numbers is equal to ```Double.NEGATIVE_INFINITY```
* Complete the main method in ```MainEx2```



