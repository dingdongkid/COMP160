import java.util.Scanner;

/** Lab 13, COMP160, Nicholas Dong
  * Anagram.java
  * Determines whether two given strings are anagrams
  */

public class Anagram{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter first phrase");
    String line1 = scan.nextLine();
    
    System.out.println("Enter second phrase");
    String line2 = scan.nextLine();
    
    System.out.println(checkLetters(line1) + " are the letters of " + line1 + " in order\n");
    System.out.println(checkLetters(line2) + " are the letters of " + line2 + " in order\n");
    
    if(checkLetters(line1).equals(checkLetters(line2)))
      System.out.println(line1 + " is an anagram of " + line2);
    else
      System.out.println(line1 + " is not an anagram of " + line2);
  }
  
  /** returns letters in strings, in alphabetical order
    */
  public static String checkLetters(String line){
    String letters = line.toLowerCase();
    String order = "";
    for(char c = 'a'; c <= 'z'; c++){
      for(int count = 0; count < letters.length(); count++){
        if(letters.charAt(count) == c){
          order += c;
        }
      }
    }
    return order;
  }
}