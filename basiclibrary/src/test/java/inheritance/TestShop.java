package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestShop {

    @Test
    public void testShopConstructor(){
        Shop shop1 = new Shop("Da Shop", "This shop has provided premium service " +
                "in the local area for the last 300 years.", 3);
        String expectedOutputConstructor = "Da Shop: This shop has provided premium service " +
                                "in the local area for the last 300 years.";
        String actualOuputConstructor = shop1.toString();

        assertEquals("both names should be the same", "Da Shop", shop1.getName());
        assertEquals("both descriptions should be the same",
                "This shop has provided premium service " +
                        "in the local area for the last 300 years.",
                shop1.getDescription() );
        assertEquals("both dollarSigns should be equal", 3, shop1.getDollarSigns() );
        assertEquals("both string values should be equal", expectedOutputConstructor, actualOuputConstructor);
    }


}
