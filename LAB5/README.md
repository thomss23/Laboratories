# Laboratory 5

### Task 1

Implement the *Task* interface (from package *first*) as follows:
  * a task that prints a message. The message is specified in he constructor (*OutTask.java*)
  * a task that generates a random number and prints a message containing this number. The random generation is done in the constructor ("RandomOutTask.java)
  * a task that increments a globat counter and prints its value after each incrementation (*CounterOutTask.java*)
  ![task1](https://ocw.cs.pub.ro/courses/_media/poo-ca-cd/laboratoare/clase-abstracte-interfete/ex1.png?cache=)

### Task 2
*Container* interface (from package *second*) specifies the common interface for Task object collections, in which items can be added and removed. 
Create two types of containers that implement this class:
  * Stack 
  * Queue
  ![task2](https://ocw.cs.pub.ro/courses/_media/poo-ca-cd/laboratoare/clase-abstracte-interfete/ex2.png?cache=)
  
### Task 3

In the third package, create 4 interfaces: Minus, Plus, Much, Div, which contain a method related to the name that has a float number as an argument. 
Write the Operation class that implements all these interfaces and has a float field that will be modified by each method you implement.

### Task 4

In the fourth package write the Song class which has as attributes: name (String), id (int), composer (String) and the abstract class Album which has a list of songs 
(you can use ArrayList) the abstract method addSong and the non-abstract methods removeSong, toString. Then, create the DangerousAlbum, ThrillerAlbum, BadAlbum classes 
to inherit the Album class. DangerousAlbum contains only songs so that their id is a prime number, ThrillerAlbum contains songs written only by Michael Jackson and their id is
an even number and the BadAlbum class contains only songs that have 3 letter names and their id is a palindrome.

