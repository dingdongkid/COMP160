import javax.swing.*;
import java.awt.*;
/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2017 
 */
public class Pie extends JPanel{
    /** constructor method, sets up the Pie panel */
  public Pie(){
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.white);
  }
 
    
    /** all drawing code goes in the paint method, which is called automatically*/
    public void paintComponent (Graphics page){
      super.paintComponent(page);
      final int LEFT = 50;
      final int TOP = 50;
      final int DIAMETER = 200;
      final int ANGLE = 45;
      
      page.setColor (Color.black);
      page.fillArc (LEFT + 11, TOP - 4, DIAMETER, DIAMETER, 0*ANGLE, ANGLE);
      
      page.setColor (Color.red);
      page.fillArc (LEFT, TOP, DIAMETER, DIAMETER, 1*ANGLE, ANGLE);
      
      page.setColor (Color.orange);
      page.fillArc (LEFT, TOP, DIAMETER, DIAMETER, 2*ANGLE, ANGLE);
      
      page.setColor (Color.yellow);
      page.fillArc (LEFT, TOP, DIAMETER, DIAMETER, 3*ANGLE, ANGLE);
      
      page.setColor (Color.green);
      page.fillArc (LEFT, TOP, DIAMETER, DIAMETER, 4*ANGLE, ANGLE);
      
      page.setColor (Color.blue);
      page.fillArc (LEFT, TOP, DIAMETER, DIAMETER, 5*ANGLE, ANGLE);
      
      page.setColor (new Color(75, 0, 130));
      page.fillArc (LEFT, TOP, DIAMETER, DIAMETER, 6*ANGLE, ANGLE);
      
      page.setColor (new Color(127, 0, 255));
      page.fillArc (LEFT, TOP, DIAMETER, DIAMETER, 7*ANGLE, ANGLE);
      
      //your pie chart code goes here
    }
}
