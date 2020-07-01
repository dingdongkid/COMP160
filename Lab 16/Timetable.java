/** Lab 16, COMP160, Nicholas Dong
  * Timetable.java
  * Displays a 12x12 multiplication table
  */

public class Timetable{
  
  public static void main(String[]args){
    int rows = 12;
    int cols = 12;
    int [] [] table = new int[rows][cols];
    
    //filling table
    for(int row = 0; row < rows; row++){
      for(int col = 0; col < cols; col++){
        table[row][col] = (row+1)*(col+1);
      }
    }
    
    //printing table
    for(int[] eachArray:table){
      for(int eachNum:eachArray){
        System.out.print(eachNum + "\t");
      }
      System.out.println();
    }
  }
}