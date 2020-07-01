import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Lab 18, COMP160, Nicholas Dong
  * TrafficLightPanel.java
  * Listener with multiple buttons
  */

public class TrafficLightPanel extends JPanel{
  private JButton redButton, greenButton, amberButton;
  private JLabel buttonLabel, lastPressedLabel;
  private JPanel buttonPanel;
  
  public TrafficLightPanel(){
    //declaring JButtons
    redButton = new JButton("Red");
    greenButton = new JButton("Green");
    amberButton = new JButton("Amber");
    
    //declaring JLabels
    buttonLabel = new JLabel("Button Panel");
    lastPressedLabel = new JLabel ("last pressed");
    
    //instance of ButtonListener
    ButtonListener listener = new ButtonListener();
    redButton.addActionListener(listener);
    greenButton.addActionListener(listener);
    amberButton.addActionListener(listener);
    
    //constructor for buttonPanel
    buttonPanel = new JPanel();
    buttonPanel.setPreferredSize(new Dimension(80, 290));
    buttonPanel.setBackground(Color.white);
    buttonPanel.add(buttonLabel);
    buttonPanel.add(redButton);
    buttonPanel.add(amberButton);
    buttonPanel.add(greenButton);
    //buttonPanel.add(lastPressedLabel);
    
    //base variables for TrafficLightPanel
    setPreferredSize(new Dimension(200, 300));
    setBackground(Color.blue);
    add(buttonPanel);
    
    //constructor for LightPanel
    LightPanel light = new LightPanel();
    light.setPreferredSize(new Dimension(80, 290));
    light.setBackground(Color.cyan);
    add(light);
  }
  
  /** private ButtonListener class, implements ActionListener
    */
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      if (event.getSource() == redButton){
        lastPressedLabel.setText("red");
        //buttonPanel.setBackground(Color.red);
      }
      if (event.getSource() == amberButton){
        lastPressedLabel.setText("amber");
        //buttonPanel.setBackground(Color.orange);
      }
      if (event.getSource() == greenButton){
        lastPressedLabel.setText("green");
        //buttonPanel.setBackground(Color.green);
      }
      repaint();
    }
  }
  /** private LightPanel class, extends JPanel
    */
  private class LightPanel extends JPanel{ 
    /** paintComponent method for traffic light
      */
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      //black ovals
      g.setColor(Color.black);
      g.fillOval(21, 31, 38, 38);
      g.fillOval(21, 91, 38, 38);
      g.fillOval(21, 151, 38, 38);
      
      //coloured ovals
      if (lastPressedLabel.getText() == "red"){
      g.setColor(Color.red);
      g.fillOval(20, 30, 40, 40);
      }
      
      if (lastPressedLabel.getText() == "amber"){
      g.setColor(Color.orange);
      g.fillOval(20, 90, 40, 40);
      }
      
      if (lastPressedLabel.getText() == "green"){
      g.setColor(Color.green);
      g.fillOval(20, 150, 40, 40);
      }
    }
    
    
  } 
}