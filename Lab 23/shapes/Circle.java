package shapes;
import java.awt.*;
/** Lab 23, COMP160, Nicholas Dong
  * Circle.java
  * Draws a circle
  */

public class Circle extends Shape{
  
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}