package shapes;
import java.awt.*;
/** Lab 23, COMP160, Nicholas Dong
  * Oval.java
  * Draws an oval
  */

public class Oval extends Shape{
  public Oval(){  
  height = width*4;
  y = randomRange(0, 400-this.height);
  }
  
  public void display(Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, width, this.height);
  }
}