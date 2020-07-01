package shapes;
import java.awt.*;
/** Lab 23, COMP160, Nicholas Dong
  * Square.java
  * Draws a square
  */

public class Square extends Shape{
  
  public void display(Graphics g){
    g.setColor(colour);
    g.fillRect(x, y, width, height);
  }
}