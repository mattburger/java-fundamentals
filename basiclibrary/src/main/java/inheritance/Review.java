package inheritance;

public class Review {
    String user;
    String body;
    Restaurant restaurant;
    Shop shop;
    Theater theater;
    int stars;

    //constructor for Restaurant reviews
    public Review(String user, String body, int stars, Restaurant restaurant){
        this.user = user;
        this.body = body;
        this.stars = stars;
        this.restaurant = restaurant;
    }

    //constructor for Shop reviews
    public Review(String user, String body, int stars, Shop shop){
        this.user = user;
        this.body = body;
        this.stars = stars;
        this.shop = shop;
    }

    //constructor for Theater reviews
    public Review(String user, String body, int stars, Theater theater){
        this.user = user;
        this.body = body;
        this.stars = stars;
        this.theater = theater;
    }

    public String getUser(){
        return this.user;
    }

    public String getReview(){
        return this.body;
    }

    public String getRestaurantName(){
        return this.restaurant.getName();
    }

    public int getStars(){
        return this.stars;
    }

    public String toString(){
        return String.format("%s posted the following review about %s:\n%s",
                this.user, this.restaurant.getName(), this.body);
    }

}
