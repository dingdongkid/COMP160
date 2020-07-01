import javax.swing.*;

/** Lab 14, COMP160, Nicholas Dong
  * DinerApp.java
  * Creates JFrame for drawing
  */

public class DinerApp{
  public static void main(String[]args){
    JFrame frame = new JFrame ("DinerApp");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TablePanel());
    frame.pack();
    frame.setVisible(true);
  }
}