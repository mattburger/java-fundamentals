package inheritance;

public class Review {
    String user;
    String body;
    String movie;
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
    public Review(String user, String body, int stars, Theater theater, String movie){
        this.user = user;
        this.body = body;
        this.stars = stars;
        this.theater = theater;
        this.movie = movie;
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
        if(this.restaurant != null) {
            return String.format("%s posted the following review about %s:\n%s",
                    this.user, this.restaurant.getName(), this.body);
        }

        else if(this.shop != null ){
            return String.format("%s posted the following review about %s:\n%s",
                    this.user, this.shop.getName(), this.body);
        }

        else{
            return String.format("%s posted the following review about %s (movie viewed - %s):\n%s",
                    this.user, this.theater.getName(),this.movie, this.body);
        }
    }

}
