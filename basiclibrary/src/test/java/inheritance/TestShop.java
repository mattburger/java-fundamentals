package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestShop {

    private final double DELTA = 1e-15;
    private String revBody = "Nice place!";

    public Shop createShop(){
        return new Shop("Da Shop", "This shop has provided premium service " +
                "in the local area for the last 300 years.", 3);
    }

    public Review createReview(Shop shop, String revBody){
        return new Review("user1", revBody, 4, shop);
    }

    @Test
    public void testShopConstructor(){
        Shop shop1 = createShop();
        String expectedOutputConstructor = "Da Shop: This shop has provided premium service " +
                                "in the local area for the last 300 years.";
        String actualOutputConstructor = shop1.toString();

        assertEquals("both names should be the same", "Da Shop", shop1.getName());
        assertEquals("both descriptions should be the same",
                "This shop has provided premium service " +
                        "in the local area for the last 300 years.",
                shop1.getDescription() );
        assertEquals("both dollarSigns should be equal", 3, shop1.getDollarSigns() );
        assertEquals("both string values should be equal", expectedOutputConstructor, actualOutputConstructor);
    }

    @Test
    public void testShopCheckList_empty(){
        Shop shop1 = createShop();
        Review review1 = createReview(shop1, revBody);
        String input = review1.toString();
        boolean output = shop1.checkList(input);

        assertFalse("checking if the review is in a empty list should return false", output);
    }

    @Test
    public void testShopAddReview_empty(){
        Shop shop1 = createShop();
        Review review1 = createReview(shop1, revBody);
        shop1.addReview(review1);
        int actualOutput = shop1.getReviewListSize();
        int expectOutput = 1;

        assertEquals("list sizes should be equal", expectOutput, actualOutput);
    }

    @Test
    public void testShopCheckList_notEmpty(){
        Shop shop1 = createShop();
        Review review1 = createReview(shop1, revBody);
        String input = review1.toString();
        shop1.addReview(review1);
        boolean output = shop1.checkList(input);

        assertTrue("should return true", output);
    }

    @Test
    public void testShopAvgStars(){
        Shop shop1 = createShop();

        for(int i = 0; i < 5; i++){
            shop1.addReview( createReview(shop1, revBody + i) );
        }

        double actualOutput = shop1.getTotalStars()/shop1.getReviewListSize();
        double expectOutput = 4.0;

        assertEquals("values should be equal", expectOutput, actualOutput, DELTA);
    }
}
