package inheritance;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TestTheater {
    private final double DELTA = 1e-15;
    private String revBody = "Nice place!";

    public HashSet<String> createMovieList(){
        HashSet<String> movieLs = new HashSet<>();
        for(int i = 1; i <= 5; i++){
            movieLs.add("movie"+i);
        }
        return movieLs;
    }

    public Review createReview(Theater theater, String revBody, String movie){
        return new Review("user1", revBody, 5, theater, movie);
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

    @Test
    public void testTheaterCheckList_empty(){
        Theater theater1 = new Theater(tNameHelper() + 1, createMovieList());
        Review review1 = createReview(theater1, revBody, "movie1");
        String input = review1.toString();
        boolean output = theater1.checkList(input);

        assertFalse("checking if the review is in a empty list should return false", output);
    }

    @Test
    public void testTheaterAddReview_empty(){
        Theater theater1 = new Theater(tNameHelper() + 1, createMovieList());
        Review review1 = createReview(theater1, revBody, "movie1");
        theater1.addReview(review1);
        int actualOutput = theater1.getReviewListSize();
        int expectOutput = 1;

        assertEquals("list sizes should be equal", expectOutput, actualOutput);
    }

    @Test
    public void testTheaterCheckList_notEmpty(){
        Theater theater1 = new Theater(tNameHelper() + 1, createMovieList());
        Review review1 = createReview(theater1, revBody, "movie1");
        String input = review1.toString();
        theater1.addReview(review1);
        boolean output = theater1.checkList(input);

        assertTrue("should return true", output);
    }

    @Test
    public void testTheaterAvgStars(){
        Theater theater1 = new Theater(tNameHelper() + 1, createMovieList());

        for(int i = 0; i < 5; i++){
            theater1.addReview( createReview(theater1, revBody + i, "movie" + 1) );
        }

        double actualOutput = theater1.getTotalStars()/theater1.getReviewListSize();
        double expectOutput = 5.0;

        assertEquals("values should be equal", expectOutput, actualOutput, DELTA);
    }
}
