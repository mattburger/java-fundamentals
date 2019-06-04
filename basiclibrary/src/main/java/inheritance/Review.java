package inheritance;

public class Review {
    String user;
    String userReview;
    String restaurantName;
    int stars;

    public Review(String user, String userReview, int stars){
        this.user = user;
        this.userReview = userReview;
        this.stars = stars;
    }

    public String getUser(){
        return this.user;
    }

    public String getReview(){
        return this.userReview;
    }

    public String getRestaurantName(){
        return this.restaurantName;
    }

    public int getStars(){
        return this.stars;
    }

    public void setRestaurantName(String n){
        this.restaurantName = n;
    }

    public String toString(){
        return String.format("%s posted the following review about %s:\n%s",
                this.user, this.restaurantName, this.userReview);
    }

}
