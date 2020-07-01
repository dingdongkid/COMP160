package shapes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** Lab 23, COMP160, Nicholas Dong
  * ShapePanel.java
  * Control panel to generate objects
  */

public class ShapePanel extends JPanel{
  //data field declarations
  private Shape[] shapes = new Shape[20];
  private JButton addShape;
  private JPanel controlPanel;
  private JTextField showNum;
  private JLabel countLabel;
  private DrawingPanel drawPanel;
  private int count;
  
  private JButton start, stop;
  Timer timer, timer2;
  private final int DELAY = 10;
  
  private JButton[] buttons ={new JButton("Circle"),new JButton("Square"),new JButton("Oval"),new JButton("Smiley"),new JButton("Pikachu"),new JButton("Start"),new JButton("Stop")};
  
  /**new instance of JFrame
    */
  public static void main(String[]args){
    JFrame frame = new JFrame("Shapes");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add(new ShapePanel());
    frame.pack();
    frame.setVisible(true);
  }
  
  public ShapePanel(){
    //data field initialisations
    //addShape = new JButton("Add Shape");
    showNum = new JTextField(2);
    countLabel = new JLabel("Count");
    
    //controlPanel constructor
    controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100,400));
    
    ButtonListener listener = new ButtonListener();
    
    //adding listener for all JButtons
    for(JButton option:buttons){
      option.addActionListener(listener);
      controlPanel.add(option);
    }

    controlPanel.add(showNum);
    controlPanel.add(countLabel);
    
    add(controlPanel);
    
    //drawPanel constructor
    drawPanel = new DrawingPanel();
    add(drawPanel);
    
    //adding instances of timers
    timer = new Timer(DELAY, listener);
    timer2 = new Timer(DELAY*100, listener);
  }
  
  private class ButtonListener implements ActionListener{
    /**interactions following button presses
      */
    public void actionPerformed(ActionEvent e){
      //add shape, change colour
      /**if (e.getSource() == addShape){
        for(int i=0; i<count; i++)
        shapes[i].change();
        if (count < shapes.length){
        shapes[count] = new Circle();
        count++;
        }
        }
        */
      
      //moving
      if (e.getSource() == timer){
        for(int i=0; i<count; i++){
          shapes[i].move();
        }
      }
      //colour changing
      else if (e.getSource() == timer2){
        for(int i=0; i<count; i++)
          shapes[i].change();
      }
      //stop movement/colour change
      else {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("Stop")){
          timer.stop();
          for(int i=0; i<count; i++)
            shapes[i].change();
          timer2.stop();
        }
        //start movement/colour change
        else if (button.getText().equals("Start")){
          timer.start();
          for(int i=0; i<count; i++)
            shapes[i].change();
          timer2.start();
        }
        else if (button.getText().equals("Circle")){
          for(int i=0; i<count; i++)
            shapes[i].change();
          if (count < shapes.length){
            shapes[count] = new Circle();
            count++;
          }
        }
        else if (button.getText().equals("Square")){
          for(int i=0; i<count; i++)
            shapes[i].change();
          if (count < shapes.length){
            shapes[count] = new Square();
            count++;
          }
        }
        else if (button.getText().equals("Oval")){
          for(int i=0; i<count; i++)
            shapes[i].change();
          if (count < shapes.length){
            shapes[count] = new Oval();
            count++;
          }
        }
        else if (button.getText().equals("Smiley")){
          for(int i=0; i<count; i++)
            shapes[i].change();
          if (count < shapes.length){
            shapes[count] = new Smiley();
            count++;
          }
        }
        else if (button.getText().equals("Pikachu")){
          for(int i=0; i<count; i++)
            shapes[i].change();
          if (count < shapes.length){
            shapes[count] = new Pikachu();
            count++;
          }
        }
        showNum.setText(Integer.toString(count));
      }
      repaint();
    }
  }
  
  private class DrawingPanel extends JPanel{
    //background drawing
    public DrawingPanel(){
      setPreferredSize(new Dimension(400,400));
      setBackground(Color.pink);
    }
    
    //circle drawing 
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      
      for(int i=0; i<count; i++){
        shapes[i].display(g);
      }
      
      
    }
  }
}