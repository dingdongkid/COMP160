import java.util.Scanner;
import java.util.Random;

/** Lab 15, COMP160, Nicholas Dong
  * IntCounterApp.java
  * Makes an array, asks for user input, finds integer in array
  */

public class IntCounterApp{
  /**creates an array of random size between 5 and 10
    */
  public static int[] makeArray(){
    Random generator = new Random();
    int[] array = new int[generator.nextInt(6) + 5];
    for(int i = 0; i < array.length; i++)
      array[i] = generator.nextInt(5);
    return array;
  }
  
  /** accepts a number 3 times, finds number in a randomized array
    */
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    for(int count = 0; count < 3; count++){
      System.out.println("Which number do you want to find?");
      int number = sc.nextInt();
      //asks for number that could possibly be in the range
      if (number > 4 || 0 > number){
        System.out.println("Enter a new number");
        count--;
      } else {
          IntCounter newarray = new IntCounter(makeArray());
          newarray.showTarget(number);
        }
    }
  }
}