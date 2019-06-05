package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    String name;
    String location;
    int totalStars;
//    int dollarSigns; //needs to be implemented in this class
    float avgStars;
    List<Employee> restaurantEmployees;

    //refactor to linked list
    List<Review> reviewList = new ArrayList<>();

    public Restaurant(String name, String location, List<Employee> restaurantEmployees){
        this.name = name;
        this.location = location;
        this.restaurantEmployees = restaurantEmployees;
        this.totalStars = 0;
        this.avgStars = 0;
    }
//    public Restaurant(String name, String location, List<Employee> restaurantEmployees, Review userReview){
//        this.name = name;
//        this.location = location;
//        this.restaurantEmployees = restaurantEmployees;
//        reviewList.add(userReview);
//    }

    public String getName(){
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public float getAvgStars(){
        return totalStars/reviewList.size();
    }
    public List<Employee> getEmployees(){
        return restaurantEmployees;
    }

    public void addEmployee(Employee e){
        this.restaurantEmployees.add(e);
    }

    //refactor for linked list
    public void addReview(Review r){
        if( !this.reviewList.contains(r) ) {
            this.reviewList.add(r);
            this.totalStars += r.stars;
        }
    }
    public String toString(){
        return String.format( "This restaurant's name is %s.\nThey are located in %s,\n" +
                        "and currently have %d employee(s).\nThere are %d reviews.",
                this.name, this.location, this.restaurantEmployees.size(), this.reviewList.size() );
    }
}
