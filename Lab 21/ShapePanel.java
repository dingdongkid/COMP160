import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** Lab 21, COMP160, Nicholas Dong
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
  
  //new instance of JFrame
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
    
    //controlPanel constructor
    controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100,400));
    controlPanel.add(addShape);
    controlPanel.add(showNum);
    controlPanel.add(countLabel);
    add(controlPanel);
    
    //adding listener for addShape JButton
    ButtonListener listener = new ButtonListener();
    addShape.addActionListener(listener);
    
    //drawPanel constructor
    drawPanel = new DrawingPanel();
    add(drawPanel);
  }
  
  private class ButtonListener implements ActionListener{
    //interactions on button press
    public void actionPerformed(ActionEvent e){
      if (e.getSource() == addShape){
        if (count < 20){
          shapes[count] = new Shape();
          count++;
        }
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