package shapes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** Lab 22, COMP160, Nicholas Dong
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
    addShape = new JButton("Add Shape");
    showNum = new JTextField(2);
    countLabel = new JLabel("Count");
    start = new JButton("Start");
    stop = new JButton("Stop");
    
    //controlPanel constructor
    controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100,400));
    controlPanel.add(addShape);
    controlPanel.add(showNum);
    controlPanel.add(countLabel);
    controlPanel.add(start);
    controlPanel.add(stop);
    add(controlPanel);
    
    //adding listener for addShape JButton
    ButtonListener listener = new ButtonListener();
    addShape.addActionListener(listener);
    start.addActionListener(listener);
    stop.addActionListener(listener);
    
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
      if (e.getSource() == addShape){
        for(int i=0; i<count; i++)
          shapes[i].change();
        if (count < shapes.length){
          shapes[count] = new Shape();
          count++;
        }
      }
      //moving
      else if (e.getSource() == timer){
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
      if (e.getSource() == stop){
        timer.stop();
        for(int i=0; i<count; i++)
          shapes[i].change();
       timer2.stop();
      }
      //start movement/colour change
      if (e.getSource() == start){
        timer.start();
        for(int i=0; i<count; i++)
          shapes[i].change();
       timer2.start();
      }
      
      showNum.setText(Integer.toString(count));
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