import java.awt.*;

/** Lab 14, COMP160, Nicholas Dong
  * Diner.java
  * Stores information to show a series of diners around table
  */

public class Diner{
  
  // data field declarations
  private int x;
  private int y;
  private String name;
  private int seatNum;
  private Color colour;
  private final int DIAMETER = 50;
  
  /** constructor for Diner
    */
  public Diner(int x, int y, String name, int seatNum, Color colour){
    this.x = x;
    this.y = y;
    this.name = name;
    this.seatNum = seatNum;
    this.colour = colour;
  }
  
  /** draw method for Diner
    */
  public void draw(Graphics g){
    // seat
    g.setColor (colour);
    g.fillOval (x, y, DIAMETER, DIAMETER);
    //name
    g.setColor (Color.black);
    g.setFont (new Font ("Helvetica", Font.BOLD, 14));
    g.drawString (name, x+6, y+30);
    //seat number
    g.setColor (Color.black);
    g.setFont (new Font ("Helvetica", Font.PLAIN, 10));
    g.drawString (Integer.toString(seatNum), x+21, y+10);
  }
}