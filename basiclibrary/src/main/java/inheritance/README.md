# Lab 6
Create a Restaurant class and Review class and associate them

## Tasks
- Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).
    - Implement a Restaurant constructor.
    - Test that your Restaurant constructor is behaving reasonably.
    - Implement a reasonable toString method for Restaurants.
    - Write a test to create an instance of Restaurant and ensure that its toString is working properly.
- Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
    - Write a Review constructor.
    - Test that your constructor is working reasonably.
    - Implement a reasonable toString method for Reviews.
    - Write a test to create an instance of Review and ensure that its toString is working properly.
- A Review should be about a single Restaurant. Choose an implementation for this, and implement it. Some considerations:
    - Should a Review know which Restaurant it is about?
    - Should a Restaurant know which Reviews are about it?
    - Is a Restaurant a special type of Review? Is a Review a special type of Restaurant? Is there common functionality that unites them?
    - Update your toString and constructor methods appropriately, and also update your testing code to test this new functionality.
- Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant. The specific methodology for this will vary, depending on the implementation you chose above.
    - Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.
- When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)

## Library Architecture
- Class Restaurant
    - constuctor (name, location, Employee list, Review list)
    - getters
        - getName
        - getLocation
        - getAvgStars
        - getEmployees
    - addReview
    - toString
- Class Review
    - constructor(user, userReview, stars)
    - getters
        - getUser
        - getReview
        - getRestaurantName
        - getStars
    - setters
        - setRestaurantName
    - toString
# Test
* [Test code](https://github.com/mattburger/java-fundamentals/blob/master/basiclibrary/src/test/java/inheritance/TestRestaurant.java)