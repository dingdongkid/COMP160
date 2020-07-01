import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

/** FilePanel.java
  * Lab 20, COMP160,  2017
  * 
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  */
public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  
  
  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){  
    String fileName = "LongBadData.txt";
    boolean filled;
    Color fillColour = Color.red;
    try{
      Scanner fileScan = new Scanner(new File(fileName));
      while (fileScan.hasNextLine()&&count<10){
        String inputLine = fileScan.nextLine();
        if (inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")){
          Scanner inputScan = new Scanner(inputLine);
          
          //reading integers from inputLine
          int fill = inputScan.nextInt();
          int colour = inputScan.nextInt();
          int x = inputScan.nextInt();
          int y = inputScan.nextInt();
          int width = inputScan.nextInt();
          int height = inputScan.nextInt();
          
          //interpret first integer - rectangle fill
          if (fill == 1)
            filled = true;
          else 
            filled = false;
          
          
          //interpret second integer - rectangle colour
          if (colour == 1)
            fillColour = Color.red;
          else if (colour == 2)
            fillColour = Color.blue;
          else if (colour == 3)
            fillColour = Color.green;
          
          drawObjects[count] = new Rectangle(filled, fillColour, x, y, width, height);
          count++;
          
          setPreferredSize(new Dimension(300,300));
          setBackground(Color.yellow);
        }
      } //while
      //reading code
    } catch (FileNotFoundException e){
      System.out.println("File not found. Check file name and location.");
      System.exit(1);
    } //catch
    
    // creating rectangles
    /**
     drawObjects[count] = new Rectangle(true,Color.red, 0, 0,30,30);
     count++;
     drawObjects[count] = new Rectangle(false,Color.blue, 50, 50,30,30);
     count++;
     setPreferredSize(new Dimension(300,300));
     setBackground(Color.yellow);
     */
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    } 
  }
}
