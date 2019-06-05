package inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Theater {
    private String name;
    private HashSet<String> movieList = new HashSet<>();

    public Theater(String name){
        this.name = name;
    }

    public Theater(String name, HashSet movieList){
        this.name = name;
        this.movieList = movieList;
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

    public String toString(){
        List<String> tmp = this.getList();
        Collections.sort(tmp);
        return String.format(this.name + " is showing these movies: " + tmp );
    }



}
