# Laboratory 2

### Task 1

Create a class named *Complex* that has 2 fields of type *private int* - *real* and *imaginary*. Solve the following subtasks:
  * Create 3 constructors: the first one takes 2 parameters of type *int* (first relates to the real part of a complex number, and the second relates to its imaginary part).
  The second constructor doesn't receive any paramaters and calls the first constructor with the values 0 and 0. The third represents a copy constructor which receives and object
  of type Complex.
  * Write the getter and setter methods for this class.
  * Write a void method *addWithComplex* which receives as a parameter an object of type Complex, which adds the complex number given as a parameter to the number calling 
  the function
  * Write a void method *showNumber* which prints the complex number.
  
  
### Task 2

Implement a class named *Point* which should contain:
  * 2 fields of type float which represent a point's coordinates.
  * A method *changeCoords* which takes 2 float numbers and changes the point's coordinates.
  * Override the *toString()* method so that it prints a points as follows: (x,y).
  
Implement a class named *Polygon* that should contain:
  * A constructor that takes a single parameter n (representing the number of corners of the polygon) and allocates space for its points (a point represents an instance of the Point class)
  * A constructor that takes as a paramater an array containing 2n real numbers that represent the corners. This constructor calls the constructor defined above and populates the array
  with n instances of class Point.
  
### Task 3

In the code snippet provided by the lab's staff you should find a class *Book* and you should implement the *toString()* method, a *Main* class, where you should test the *toString() method.
