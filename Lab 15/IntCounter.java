/** Lab 15, COMP160, Nicholas Dong
  * IntCounter.java
  * Takes an int array and shows requested data
  */

public class IntCounter{
  //data field
  int[] numArray;
  
  /** constructor for array numArray
    */
  public IntCounter(int[] numArray){
    String s = "";
    this.numArray = numArray;
    for (int num:numArray){
      s += Integer.toString(num) + " ";
    }
    System.out.println(s + "Array is of length " + numArray.length);
  }
  
  /** method to display each time target integer is found in an array
    */
  public void showTarget(int target){
    int count = 0;
    for(int i = 0; i < numArray.length; i++){
      if(numArray[i] == target){
        System.out.println("\tThere is a " + Integer.toString(target) + " in position " + Integer.toString(i));
        count++;
      }
    }
    if(count == 0)
      System.out.println("There are no " + target + "'s in this array");
  }
}