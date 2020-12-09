# Laboratory 8 

### Task 1

Implement a *Student* class with 4 fileds:
* name (String)
* surname (String)
* id (long)
* averageGrade(double) - average grade of a student

The *Student* class will implement the Comparable interface and override the *compareTo()* method.
Students will be compared first by their average grade, then by their last name, then by their surname (meaning that if two students have the same average, they will be compared by their last name and if they 
have the same last name, then they will be compared by surname) .

### Task 2

Create 5 objects of type *Student* and add them into an ArrayList and sort it(hint: Collections.sort) and print it.

### Task 3

Sort the ArrayList from Task 2 using *sort()* from the *List* interface or Collections.sort(), but this time using a lambda expression in a descending order by their average.

### Task 4

Add the ArrayList previously defined into a PriorityQueue(hint: Collections.addAll), using a *Comparator* or an anonymous function. The elements should be sorted in an ascending order
by their id ( you could use Long.compare to compare two numbers of type long).

### Task 5

Override *equals()* and *hashcode()* in the *Student* class (use Intellij's code generator)

### Task 6

Use a ```Hashmap<Student,LinkedList<String>>``` where you will add elements of type (Student, list of all the courses the student is attending), then print it.
(hint: Map.Entry and entrySet()).

### Task 7

Create a class that should extend ```LinkedHashSet<Integer>``` that will only add even numbers. Override the *add* method so that will only allow even numbers to be added in
the collection. For testing purposes, add even and odd numbers and iterate over the collection using *Iterator* or *forEach* and print all the elements.
