/** Lab 8, COMP160, 2017, Nicholas Dong
  * Triangle.java
  * Generates a box and calculates its perimeter
  */

public class Triangle{
  
  //data field declarations
  private int p1x;
  private int p1y;
  private int p2x;
  private int p2y;
  private int p3x;
  private int p3y;
  private String name;
  
  /** triangle constructor
    */
  public Triangle(int pt1x, int pt1y, int pt2x, int pt2y, int pt3x, int pt3y, String nameIn){
    p1x = pt1x;
    p1y = pt1y;
    p2x = pt2x;
    p2y = pt2y;
    p3x = pt3x;
    p3y = pt3y;
    name = nameIn;
  }
  
  /** calculates triangle side lengths
    */
  public double calcSide(int x1, int x2, int y1, int y2){
   double side = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
   return side;
  }
  
  /** calculates and returns perimeter of a triangle
    */
  public double getPerimeter(){
    double perimeter = calcSide(p1x, p2x, p1y, p2y) + calcSide(p2x, p3x, p2y, p3y) + calcSide(p3x, p1x, p3y, p1y);
    return perimeter;
  }
  
  /** returns name of triangle
    */
  public String getName(){
    String n = name;
    return name;
  }
}