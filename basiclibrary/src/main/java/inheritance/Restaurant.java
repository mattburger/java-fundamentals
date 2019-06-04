package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    String name;
    String location;
    int totalStars;
    float avgStars;
    List<Employee> restaurantEmployees;
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
        return this.avgStars;
    }
    public List<Employee> getEmployees(){
        return restaurantEmployees;
    }

    public void addEmployee(Employee e){
        this.restaurantEmployees.add(e);
    }

    public void addReview(Review r){
        if( !this.reviewList.contains(r) ) {
            r.setRestaurantName(this.name);
            this.reviewList.add(r);
            totalStars += r.stars;
            avgStars = totalStars / reviewList.size();
        }
    }
    public String toString(){
        return String.format( "This restaurant's name is %s.\nThey are located in %s,\n" +
                        "and currently have %d employee(s).\nThere are %d reviews.",
                this.name, this.location, this.restaurantEmployees.size(), this.reviewList.size() );
    }
}
