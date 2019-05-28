import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

  //main method
  public static void main(String [] args){
    //test cases for pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    //test cases for flipHeads
    flipHeads(1);
    flipHeads(2);

    //test case for commandline clock feature
    displayTimeEverySecond();
  }

  //Method to pluralize a string if input is not 1. Doesn't account for negative integers
  public static String pluralize(String inputStr, int num){
    if(num != 1){
      return(inputStr + "s");
    }
    else{
      return(inputStr);
    }
  }

  //counts the amount of flips to get n number of heads in a row
  public static void flipHeads(int num){
    Random r = new Random();
    float randNum = 2; //inital value to track and ensure it is changed
    float lastValue = randNum;
    int consectutiveHeads = 0; //keep head count
    int flips = 0; //total number of flips

    while(consectutiveHeads < num){

      //random number
      randNum = r.nextFloat();
      ++flips;
      if(randNum < 0.5){
        System.out.println("tails");
      }
      else{
        ++consectutiveHeads;
        System.out.println("heads");

        //if heads in a row is more than 1 and you've done more than one flip, check and make sure the previous flip was heads.
        //otherwise reset to 1 to account for the current head
        if( (num > 1 && flips > 1 && lastValue < 0.5) ){
          consectutiveHeads = 1;
        }
      }
      lastValue = randNum;
    }
    System.out.println("It took " + flips + " flips to flip " + num + " heads in a row.");

  }

  //display time every second infinitely
  public static void displayTimeEverySecond(){
    String pattern = "HH:mm:ss";
    String prevTimeStamp = "";
    String timeStamp = "";
    double executionCount = 0;

    while(true){
      executionCount += .000001;
      LocalDateTime now = LocalDateTime.now();
      timeStamp = now.format( DateTimeFormatter.ofPattern(pattern) );
      if( !prevTimeStamp.equals(timeStamp) ){
        System.out.println(timeStamp + " " + executionCount + " MHz");
        executionCount = 0;

      }
      prevTimeStamp = timeStamp;
    }
  }

}