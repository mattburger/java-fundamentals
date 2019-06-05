package inheritance;

import java.util.*;

public class Theater {
    private String name;
    private HashSet<String> movieList = new HashSet<>();
    private LinkedList reviewList = new LinkedList();
    private int totalStars;

    public Theater(String name){
        this.name = name;
        this.totalStars = 0;
    }

    public Theater(String name, HashSet movieList){
        this.name = name;
        this.movieList = movieList;
        this.totalStars = 0;
    }

    public String getName(){
        return this.name;
    }

    public List<String> getList(){
        List<String> tmpLs = new ArrayList<>(this.movieList);
        Collections.sort(tmpLs);
        return tmpLs;
    }
    public void addMovie(String movie){
        boolean added = this.movieList.add(movie);
        if(added == false){
            throw new IllegalArgumentException("Movie already exists or check spelling!");
        }
    }

    public void removeMovie(String movie){
        boolean removed = this.movieList.remove(movie);
        if(removed == false){
            throw new IllegalArgumentException("Cannot remove a movie that doesn't exist!");
        }

    }

    public int getListSize(){
        return this.movieList.size();
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

    public int getTotalStars(){
        return this.totalStars;
    }

    public int getReviewListSize(){
        return this.reviewList.size();
    }
    public String toString(){
        List<String> tmp = this.getList();
        Collections.sort(tmp);
        return String.format(this.name + " is showing these movies: " + tmp );
    }



}
