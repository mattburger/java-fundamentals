package inheritance;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Shop {
    private String name;
    private String description;
    private int dollarSigns;
    private int totalStars;
    private LinkedList reviewList = new LinkedList();

    public Shop(String name, String description, int dollarSigns){
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
        this.totalStars = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public int getDollarSigns(){
        return this.dollarSigns;
    }

    public void addReview(Review r){
        if(this.reviewList == null){
            this.reviewList.add(r);
        }
        else if(!checkList(r.toString() ) ){
            this.reviewList.add(r);
            this.totalStars += r.stars;
        }
        else{
            throw new IllegalArgumentException("review already exists!");
        }
    }

    public boolean checkList(String review){
        if(this.reviewList == null){
            return false;
        }
        else if (this.reviewList.size() == 1){
            //System.out.println(this.reviewList.getFirst());
            String tmp = this.reviewList.getFirst().toString();
            if(tmp.equals(review) ){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            Iterator it = this.reviewList.iterator();
            while(it.hasNext()){
                if(it.next().toString().equals(review)){
                    return true;
                }
            }
            return false;
        }
    }

    public int getReviewListSize(){
        return this.reviewList.size();
    }

    public int getTotalStars(){
        return totalStars;
    }

    public String toString(){
        return String.format("%s: %s", this.name, this.description);
    }
}
