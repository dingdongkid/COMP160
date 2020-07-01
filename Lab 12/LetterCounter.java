import java.util.Scanner;

/** Lab 12, COMP160, Nicholas Dong
  * LetterCounter.java
  * Counts vowels and consonants within a sentence
  */

public class LetterCounter{
  public static void main(String[]args){
    
    /** taking sentence, declaring base variables
      */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a sentence");
    String sentence = scan.nextLine();
    int index = 0;
    int vowelCount = 0;
    int consonantCount = 0;
    
    /** loop checks each letter in the sentence
      */
    while (index < sentence.length()){
      char ch = sentence.charAt(index);
      /** first checks if a character is a letter, then adds to either the vowel or consonant count
        * if the character is not a letter, moves on to the next character
        */
      if(Character.isLetter(ch)){
        switch(ch){
          case 'a': case 'e': case 'i': case 'o': case 'u':
          case 'A': case 'E': case 'I': case 'O': case 'U':
            vowelCount ++;
            break;
          default:
            consonantCount ++;
            break;
        }
        index ++;
      } else {
        index ++;
      }
    }
    
    /** printing sentence and final count results
      */
    System.out.println("Sentence is: " + sentence);
    System.out.println("Number of vowels is: " + vowelCount);
    System.out.println("Number of consonants is: " + consonantCount);
  }
}