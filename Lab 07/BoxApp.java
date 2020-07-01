/** Lab 7, COMP160, 2017, Nicholas Dong
  * BoxApp.java
  * Application class for Box
  */

public class BoxApp{
  public static void main (String[]args){
    Box box1 = new Box (); //creates box1
    box1.setHeight(4);
    box1.setLength(4);
    box1.setWidth(6);
    
    Box box2 = new Box (3, 4, 5); //creates box2
    
    Box box3 = new Box (5); //creates box3
    
    System.out.println(box1.toString());
    System.out.println(box2.toString());
    System.out.println(box3.toString());
  }
}