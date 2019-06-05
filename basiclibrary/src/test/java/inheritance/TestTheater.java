package inheritance;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TestTheater {

    public HashSet<String> createMovieList(){
        HashSet<String> movieLs = new HashSet<>();
        for(int i = 1; i <= 5; i++){
            movieLs.add("movie"+i);
        }
        return movieLs;
    }

    public String tNameHelper(){
        return "Theater";
    }
    @Test
    public void testTheaterConstructor(){
        Theater theater1 = new Theater(tNameHelper() + 1, createMovieList());
        String expectedOutput = "Theater1 is showing these movies: [movie1, movie2, movie3, movie4, movie5]";
        String actualOutput = theater1.toString();

        assertEquals("values should be the same", "Theater1", theater1.getName() );
        assertEquals("values should be the same",
                "[movie1, movie2, movie3, movie4, movie5]", theater1.getList().toString() );

        assertEquals("values should be the same", expectedOutput, actualOutput);

    }

    @Test
    public void testAddMovie_notOnList(){
        Theater theater1 = new Theater(tNameHelper() + 1, createMovieList());
        theater1.addMovie("The Fly");
        int expectedOutput = 6;
        int actualOutput = theater1.getListSize();
        assertEquals("values should be equal", expectedOutput, actualOutput);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMovie_OnList() {
        Theater theater1 = new Theater(tNameHelper() + 1, createMovieList());
        theater1.addMovie("movie1");
        int expectedOutput = 6;
        int actualOutput = theater1.getListSize();
        assertEquals("values should be equal", expectedOutput, actualOutput);
    }

    @Test
    public void testRemoveMovie_onList(){
        Theater theater1 = new Theater(tNameHelper() + 1, createMovieList());
        theater1.removeMovie("movie1");
        int expectedOutput = 4;
        int actualOutput = theater1.getListSize();
        assertEquals("values should be equal", expectedOutput, actualOutput);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveMovie_notOnList(){
        Theater theater1 = new Theater(tNameHelper() + 1, createMovieList());
        theater1.removeMovie("Back to the Future");
        int expectedOutput = 4;
        int actualOutput = theater1.getListSize();
        assertEquals("values should be equal", expectedOutput, actualOutput);
    }
}
