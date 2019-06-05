# Lab 7
Create a Shop class and Theater class.

## Summary
Our website, Zelp, is growing like crazy! Users are no longer satisfied with only reviewing restaurants: they also want to review shops, movie theaters, and museums. In today’s lab, you’ll create classes and interfaces to allow reviewing non-restaurant things, while ensuring some common functionality.
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
  - Class Shop
    - getters
      - getName
      - getDescription
      - getDollarSigns
      - getReviewedList
      - getTotalStars
    - addReview
    - checkList
  - Class Theater
    - getters
      - getName
      - getReviewedList
      - getMovieList
      - getTotalStars
    - addReview
    - checkList
  - addMovie
  - removeMovie
# Test
* [Test code](https://github.com/mattburger/java-fundamentals/blob/master/basiclibrary/src/test/java/inheritance/TestRestaurant.java)
- You can add parameters to the test code to further test other bounds and cases.

