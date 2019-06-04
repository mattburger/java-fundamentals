package inheritance;

public class Review {
    String user;
    String userReview;
    String restaurantName;

    public Review(String user, String userReview, String restaurantName){
        this.user = user;
        this.userReview = userReview;
        this.restaurantName = restaurantName;
    }

    public String getUser(){
        return this.user;
    }

    public String getReview(){
        return this.userReview;
    }

    public String toString(){
        return String.format("%s posted the following review about %s:\n%s",
                this.user, this.restaurantName, this.userReview);
    }

}
