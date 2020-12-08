# Laboratory 3 

### Task 1
Create a class *CandyBox* which should contain the following private fields: *flavor* (String) and *origin* (String). The class should also contain: 
  * a constructor with no paramaters
  * a constructor that should instantiate all the fields
  * a method of type float *getVolume()*, that should return 0
  * Add a *toString()* method that should return the flavor and origin of the candybox
  
### Task 2

Create the classes *Lindt* , *Bravelli*, *ChocAmor* that should extend *CandyBox*.
  * *Lindt* should contain *length*,*width*,*height* (float)
  * *Bravelli* will be a cylinder. It should contain a field *radius* and *height* (float)
  * *ChocAmor* will be a cube. It should contain a field *length* (float)
  
Classes should also contain:
  * a constructor with no paramaters
  * a constructor that should instantiate all the fields 
  * Override the *getVolume()* method so that it returns the volume for each type of candybox
  * Override *toString()* method in CandyBox
  
  
### Task 3

Add an *equals()* method in *CandyBox*. Justify the chosen equivalence criterion
  
### Task 4

Now that we have established the type of candyboxes, we can design the gift. Create a class *CandyBag*, that should contain an array with multiple candyboxes of each type.

### Task 5

Create a *printDimensions()* in CandyBox and override it in each of its children classes so that it prints out the dimensions of each type of candybox.

### Task 6

Alex will want to send the gift by courier, so his mother won't find it sooner. Help him determine the location by creating the *Area* class, which will contain
a CandyBag object, a "number" (int) field, and a "street" (String) field. The class will also have:
  * a constructor with no paramaters
  * a constructor that should instantiate all the fields 
  * create a method *getBirthdayCard()* , which will first display the full address and then a happy birthday message.
  * iterate over the array and write a *printBag()* function that displays all its items.
