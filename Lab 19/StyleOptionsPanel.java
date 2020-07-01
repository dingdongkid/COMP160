//********************************************************************
//  StyleOptionsPanel.java      adapted from Java Foundations
//
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel{
  private JLabel saying;
  private JCheckBox bold, italic;
  private int style = Font.PLAIN;
  private String typeFace = "Helvetica";
  
  private JRadioButton courier, times, helvetica;
  
  //-----------------------------------------------------------------
  //  Sets up a panel with a label and some check boxes that
  //  control the style of the label's font.
  //-----------------------------------------------------------------
  public StyleOptionsPanel(){
    setLayout(new GridLayout (6, 1));
    
    saying = new JLabel ("Say it with style!");
    saying.setFont (new Font (typeFace, style, 20));
    
    bold = new JCheckBox ("Bold");
    bold.setBackground (Color.white);
    italic = new JCheckBox ("Italic");
    italic.setBackground (Color.white);
    
    courier = new JRadioButton ("Courier");
    courier.setBackground (Color.white);
    times = new JRadioButton ("Times New Roman");
    times.setBackground (Color.white);
    helvetica = new JRadioButton ("Helvetica", true);
    helvetica.setBackground (Color.white);
    
    StyleListener listener = new StyleListener();
    bold.addItemListener (listener);
    italic.addItemListener (listener);
    courier.addItemListener (listener);
    times.addItemListener (listener);
    helvetica.addItemListener (listener);
    
    add (saying);
    add (bold);
    add (italic);
    
    ButtonGroup fonts = new ButtonGroup();
    fonts.add (courier);
    fonts.add (times);
    fonts.add (helvetica);
    
    add(courier);
    add(times);
    add(helvetica);
    
    setBackground (Color.white);
    setPreferredSize (new Dimension(300, 200));
  }
  
  //*****************************************************************
  //  Represents the listener for both check boxes.
  //*****************************************************************
  private class StyleListener implements ItemListener{
    //--------------------------------------------------------------
    //  Updates the style of the label font style.
    //--------------------------------------------------------------
    public void itemStateChanged (ItemEvent event) {
      style = Font.PLAIN;
      
      if (bold.isSelected())
        style += Font.BOLD;
      
      if (italic.isSelected())
        style += Font.ITALIC;
      
      if (courier.isSelected())
        typeFace = "Courier";
      
      else if (times.isSelected())
        typeFace = "Times New Roman";
      
      else if (helvetica.isSelected())
        typeFace = "Helvetica";
      
      saying.setFont (new Font (typeFace, style, 20));
    }
  }
}
