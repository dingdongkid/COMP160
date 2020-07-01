import java.awt.*;
import javax.swing.*;

/** Lab 14, COMP160, Nicholas Dong
  * TablePanel.java
  * Draws table and diners
  */

public class TablePanel extends JPanel{
  private Diner diner1, diner2, diner3, diner4, diner5, diner6;
/** constructor of diners
  */
  public TablePanel(){
    diner1 = new Diner (125, 30, "Adam", 1, Color.blue);
    diner2 = new Diner (180, 90, "Beth", 2, Color.magenta);
    diner3 = new Diner (180, 150, "Cory", 3, Color.blue);
    diner4 = new Diner (125, 210, "Dani", 4, Color.magenta);
    diner5 = new Diner (70, 150, "Evan", 5, Color.blue);
    diner6 = new Diner (70, 90, "Fern", 6, Color.magenta);
    
    setPreferredSize (new Dimension(300, 300));
    setBackground (Color.gray);
  }
/** draws table and diners
  */
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    
    g.setColor (new Color (139, 69, 19));
    g.fillRect(125, 90, 50, 110);
    
    g.setColor (Color.black);
    g.drawRect(125, 90, 50, 110);
  }
}