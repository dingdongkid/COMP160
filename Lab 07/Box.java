/** Lab 7, COMP160, 2017, Nicholas Dong
  * Box.java
  * Creates a set of parameters for a box
  */

public class Box{
  
  // data field declarations
  private int height;
  private int width;
  private int length;
  
  //constructors
  /** creates a blank box with default 0 values
    */
  public Box(){}
  /** creates a box with three set sides
    */
  public Box(int h, int l, int w){
    height = h;
    length = l;
    width = w;
  }
  /** creates a cube with sides of the same length
    */
  public Box(int side){
    height = side;
    length = side;
    width = side;
  }
  
  /** sets height value
    */
  public void setHeight(int h){
    height = h;
  }
  
  /** sets width value
    */
  public void setWidth(int w){
    width = w;
  }
  
  /**sets length value
    */
  public void setLength(int l){
    length = l;
  }
  
  /** calculates and returns surface area value
    */
  public int getSurfaceArea(){
    int SurfaceArea = 2*(height*width + width*length + length*height);
    return SurfaceArea;
  }
  
  /**calculates and returns volume value
    */
  public int getVolume(){
    int Volume = height*width*length;
    return Volume;
  }
  
  /**returns a string representation of the object
    */
  public String toString(){
    String parameters = ("Height is: " + height + ", Length is: " + length + ", Width is: " + width + ", Volume is: " + getVolume() + ", Surface Area: " + getSurfaceArea());
    return parameters;
  }
}