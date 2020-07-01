import java.util.Scanner;

/** Lab 12, COMP160, Nicholas Dong
  * EvenSums.java
  * Displays the sum of all even numbers between 2 and a given number greater than 2
  */

public class EvenSums{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer greater than 2");
    int highest = scan.nextInt();
    int index = 2, sum = 0;
    if (highest >= 2){
      while(index <= highest){
        if(index % 2 == 0)
         sum += index;
        index ++;
      }
      System.out.println("Sum of even numbers between 2 and " + highest + " inclusive is: " + sum);
    } else {
      System.out.println("Input value must not be less than 2");
    }
  }
}