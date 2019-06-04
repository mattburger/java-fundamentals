package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class TestRestaurant {
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

        System.out.println(classForTesting);
    }

    @Test
    public void TestReview(){
        List<Employee> inputEmployees = new ArrayList<>();
        inputEmployees.add(new Employee("Dwight") );
        inputEmployees.add(new Employee("Jim") );
        inputEmployees.add(new Employee("Michael") );
        inputEmployees.add(new Employee( "Jane"));
        Restaurant classForTesting = new Restaurant("The Office Hour", "Scranton, PA", inputEmployees );

        String userName = "clu";
        String userReview = "\"Nothing but perfection!\"";
        String restaurant =
        Review classForTesting = new Review(userName, userReview);

        System.out.println(classForTesting);
    }
}
