import java.text.DecimalFormat;
/** Lab 8, COMP160, 2017, Nicholas Dong
  * Triangle.java
  * Application class for Triangle
  */

public class TriangleApp{
  public static void main (String[]args){
    DecimalFormat fmt = new DecimalFormat("0.##"); //sets 2 decimal place format
    Triangle a = new Triangle (0,3,3,4,1,9,"A"); //creates triangle A
    Triangle b = new Triangle (4,2,9,4,6,7,"B"); //creates triangle B
    Triangle c = new Triangle (3,5,6,9,3,9,"C"); //creates triangle C
    Triangle test = new Triangle (0,0,3,0,3,4,"test"); //creates triangle test
    
    System.out.println("Triangle " + a.getName() + " perimeter is " + fmt.format(a.getPerimeter()) + " units");
    System.out.println("Triangle " + b.getName() + " perimeter is " + fmt.format(b.getPerimeter()) + " units");
    System.out.println("Triangle " + c.getName() + " perimeter is " + fmt.format(c.getPerimeter()) + " units");
    System.out.println("Triangle " + test.getName() + " perimeter is " + fmt.format(test.getPerimeter()) + " units");
  }
}