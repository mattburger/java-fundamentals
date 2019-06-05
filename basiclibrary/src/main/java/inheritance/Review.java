package inheritance;

public class Review {
    String user;
    String userReview;
//    String restaurantName;
    Restaurant restaurant;
    int stars;

    public Review(String user, String userReview, int stars, Restaurant restaurant){
        this.user = user;
        this.userReview = userReview;
        this.stars = stars;
        this.restaurant = restaurant;
    }

    public String getUser(){
        return this.user;
    }

    public String getReview(){
        return this.userReview;
    }

    public String getRestaurantName(){
        return this.restaurant.getName();
    }

    public int getStars(){
        return this.stars;
    }

    public String toString(){
        return String.format("%s posted the following review about %s:\n%s",
                this.user, this.restaurant.getName(), this.userReview);
    }

}
