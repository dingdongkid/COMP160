import java.util.Scanner;

/** Lab 16, COMP160, Nicholas Dong
  * FruitSalad.java
  * displays fruits and asks user to complete them
  */

public class FruitSalad{
  
  public static void main(String[]args){
    String[] fruits = new String[3];
    Scanner scan = new Scanner(System.in);
   //fills in array 
    for(int count = 0; count < 3; count++){
      System.out.println("Enter a fruit");
      fruits[count] = scan.nextLine();
    }
    //printing elements in array, asks for guess
    for(String fruit:fruits){
      System.out.println("Guess what fruit I am?    " + fruit.substring(0,2) + "\t\t" + fruit.length() + " letters");
      for(int i = 0; i < 1; i++){
        String guess = scan.nextLine();
        if (guess.equals(fruit))
          System.out.println("Correct!");
        else {
          System.out.println("Try again");
          i--;
        }
      }
    }
  }
}