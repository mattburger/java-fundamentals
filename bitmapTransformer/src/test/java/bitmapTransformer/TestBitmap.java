package bitmapTransformer;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestBitmap {
    //test read function
    @Test
    public void testAppReadsFile_success(){
        Bitmap classUnderTest = new Bitmap("src/main/resources/input.bmp", "src/main/resources/", "output.bmp");
        assertEquals("getBitmap should return Success", "Success!", classUnderTest.getBitmap());
    }

    @Test
    public void testAppReadsFile_fail(){
        Bitmap classUnderTest = new Bitmap("src/src/main/resources/input.bmp", "src/main/resources/", "output.bmp");
        //change to assert failure later
        assertEquals("getBitmap should return failure message", "Failed to read", classUnderTest.getBitmap());
    }

    //test write function
    @Test
    public void testAppWritesFile_success(){
        Bitmap classUnderTest = new Bitmap("src/main/resources/input.bmp", "src/main/resources/output.bmp", "output");
        assertEquals("writeToFile should return Success", "Success!", classUnderTest.writeToFile());
    }

    @Test
    public void testAppWritesFile_fail(){
        Bitmap classUnderTest = new Bitmap("src/src/main/resources/input.bmp", "src/main/main/resources/output.bmp", "output");
        //change to assert failure later
        assertEquals("writeToFile should return failure message", "Failed to write", classUnderTest.writeToFile());
    }
}
