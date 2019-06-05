package inheritance;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Shop {
    private String name;
    private String description;
    private int dollarSigns;
    private int totalStars;
    private LinkedList reviewList;

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
        if(!checkList(this.reviewList, r.toString())){
            this.reviewList.add(r);
            this.totalStars += r.stars;
        }
        else{
            throw new IllegalArgumentException("review already exists!");
        }
    }

    public boolean checkList(LinkedList list, String reviewPost){
        if(list.getFirst() == null){
            return false;
        }
        else{
            Iterator it = list.iterator();
            while(it.hasNext()){
                if(it.next().equals(reviewPost)){
                    return true;
                }
            }
            return false;
        }
    }

    public String toString(){
        return String.format("%s: %s", this.name, this.description);
    }
}
