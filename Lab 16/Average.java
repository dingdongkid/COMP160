/** Lab 16, COMP160, Nicholas Dong
  * Average.java
  * Displays average of numbers in an array row
  */

public class Average{
  
  public static void main(String[]args){
    
    int [] [] table = {{1,2,3},{4,5,6},{7,8}};
    //printing table
    for(int[] eachArray:table){
      double total = 0;
      double values = 0;
      for(int eachNum:eachArray){
        System.out.print(eachNum + "\t");
        total += eachNum;
        values++;
      }
      System.out.print("Average : " + (total/values));
      System.out.println();
    }
  }
}