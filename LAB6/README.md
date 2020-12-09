# Laboratory 6

### Task 0

Copy the classes from the example snippets in your project and run them.

### Task 1

**Car**

Create a *Car* class with the following properties: price,type and manufacturing date.

The type is represented through an *Enum* declared in *Car*. This should have 3 values of your choice.

Price and year should be integers.

**Offer**

Create the *Offer* interface and should contain the method: *getDiscount(Car car)*

**Dealership**

Create a *Dealership* class that should handle car offers.

### Task 2

In the *Dealership* class create 3 private inner classes that implement *Offer*
  * *BrandOffer* - calculates a discount with respect to the type of the car (e.g for a Dacia, the discount is 5% of its price)
  * *DealerOffer* - calculates a discount with respect to the car's age (e.g 100 for each year since its production year)
  * *SpecialOffer* - calculates a random discount(e.g random number [0,300])
  
Add a method in the *DealerShip* class that shows the price of the car after all the discounts have been applied. *getFinalPrice(Car car)*

### Task 3

Create a class *Test* with a *main* method to test your code.
* At least one *Car* object for each car type
* A *DealerShip* object
* Print the price obtained from *Dealership* for every object

### Task 4

Add *void negotiate(Car car, Offer offer)* in the *DealerShip* class. This should allow the client to propose a discount. The dealership may or may not apply this discount.
(use a random function).

**Example Output**
```
Initial price: 10000 euros
Applying Brand discount: 1000 euros
Applying Dealer discount: 100 euros
Applying Special discount: 957 euros
Final price: 7943
Applying Client discount: 600 euros
Final price after negotiation: 7343 euros
```

### Task 5

Use lambda expressions on a list of *Car* objects with different prices. Remove all cars that are priced over a certain amount. Display the list before and after the change.
