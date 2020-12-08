# Laboratory 4

### Task 1

Implement a *PasswordMaker* class that generates, using *RandomStringGenerator* a password using a person's information. This class should contain:
* A constant MAGIC_NUMBER of any type
* A constant string MAGIC_STRING, with at least 20 characters, generated randomly
* A constructor with a string parameter *name*
* A method *getPassword()* which should return the password
  * The password is created by concatenating the 2 following strings:
    * a random string of length MAGIC_NUMBER, generated using *RandomStringGenerator* with an alphabet of 10 characters obtained randomly from MAGIC_STRING
    * the converted string of *name*'s length + an random integer from [0,100]
    
 ### Task 2
 
 Change the implementation of the class *PasswordMaker* so that it follows the **Singleton pattern** principle (instantiation of a single object)
  * Eager Instatiation
  * Implement a version so that the variable *instance* is instantiated in a static block
  * Add a counter so that it counts how many times the method *getInstance* was accessed.
  
### Task 3

Implement a *MyImmutableArray* class that contains:
  * a field *ArrayList<Integer> immutableArray; uninstantiated in the first phase
  * a constructor that takes an ArrayList<Integer> and copies all elements from that array in immutableArray
  * a method *getArray()* that makes sure the field *immutableArray* remains immutable

### Task 4
Test the *MyImmutableArray* class to prove that its instantiations are immutable
  
