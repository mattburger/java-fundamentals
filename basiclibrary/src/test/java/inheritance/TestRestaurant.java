package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class TestRestaurant {
    private final double DELTA = 1e-15;

    @Test
    public void TestConstructor(){
        List<Employee> inputEmployees = new ArrayList<>();
        inputEmployees.add(new Employee("Dwight") );
        inputEmployees.add(new Employee("Jim") );
        inputEmployees.add(new Employee("Michael") );
        inputEmployees.add(new Employee( "Jane"));
        Restaurant classForTesting = new Restaurant("The Office Hour", "Scranton, PA", inputEmployees );

        assertEquals("name should match", "The Office Hour", classForTesting.getName());
        assertEquals("location should match", "Scranton, PA", classForTesting.getLocation() );
        assertEquals("employee list should match", inputEmployees, classForTesting.getEmployees());
    }

    @Test
    public void TestRestaurantToString(){
        List<Employee> inputEmployees = new ArrayList<>();
        inputEmployees.add(new Employee("Dwight") );
        inputEmployees.add(new Employee("Jim") );
        inputEmployees.add(new Employee("Michael") );
        inputEmployees.add(new Employee( "Jane"));
        Restaurant classForTesting = new Restaurant("The Office Hour", "Scranton, PA", inputEmployees );
        String actualOutput = classForTesting.toString();
        String expectedOutput = "This restaurant's name is The Office Hour.\n" +
                "They are located in Scranton, PA,\n" +
                "and currently have 4 employee(s).\n" +
                "There are 0 reviews.";

        assertEquals("toString() should output", expectedOutput, actualOutput);
    }

    @Test
    public void TestReview(){
        List<Employee> inputEmployees = new ArrayList<>();
        inputEmployees.add(new Employee("Dwight") );
        inputEmployees.add(new Employee("Jim") );
        inputEmployees.add(new Employee("Michael") );
        inputEmployees.add(new Employee( "Jane"));
        Restaurant restaurant1 = new Restaurant("The Office Hour", "Scranton, PA", inputEmployees );

        String userName = "clu";
        String userReview = "\"Nothing but perfection!\"";
        int starRating = 5;
        Review review1 = new Review(userName, userReview, starRating);
        restaurant1.addReview(review1);
        String expectedOutput = "clu posted the following review about The Office Hour:\n" +
                "\"Nothing but perfection!\"";
        String actualOutput = review1.toString();

        assertEquals("toString() should output", expectedOutput, actualOutput);
    }

    @Test
    public void TestRestaurantAndReviewAssociation(){
        List<Employee> inputEmployees = new ArrayList<>();
        inputEmployees.add(new Employee("Dwight") );
        inputEmployees.add(new Employee("Jim") );
        inputEmployees.add(new Employee("Michael") );
        inputEmployees.add(new Employee( "Jane"));
        Restaurant restaurant1 = new Restaurant("The Office Hour", "Scranton, PA", inputEmployees );

        String userName = "clu";
        String userReview = "\"Nothing but perfection!\"";
        int starRating = 5;
        Review review1 = new Review(userName, userReview, starRating);
        restaurant1.addReview(review1);

        assertEquals("restaurant names should be the same", restaurant1.getName(), review1.getRestaurantName());
        assertEquals((float) review1.getStars(), restaurant1.getAvgStars(), DELTA);

    }
}
