/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmapTransformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;

public class Bitmap {
    String inputPath;
    String outputPath;
    String transName;
    BufferedImage myImg = null;

    //constructor
    public Bitmap(String inputPath, String outputPath, String transName){
        this.inputPath = inputPath;
        this.outputPath = outputPath;
        this.transName = transName + ".bmp";
    }

    public String getGreeting() {
        return "Hello world.";
    }

    public String getBitmap(){
        File bmpFile = new File(this.inputPath);
        //System.out.println(bmpFile.exists());
        try{
            this.myImg = ImageIO.read(bmpFile);
            return "Success!";
        }
        catch (IOException err){
            //log exception
            //display error
            return "Failed to read";
        }
    }

//    public void flipVertically(){
//    }
//
//    public void changeColor() {
//    }

    public String writeToFile(){
        try {
            ImageIO.write(this.myImg, "BMP", new File(this.outputPath));
            return "Success!";
        }
        catch(IOException err){
            //log err
            //display err message
            return "Failed to write";
        }
    }

}
