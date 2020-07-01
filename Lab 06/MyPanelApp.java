import javax.swing.*;
import java.awt.Color;
/** Setup of MyPanelApp
  * Nicholas Dong
  */
public class MyPanelApp{
  public static void main(String[]args){
    MyPanel mp1 = new MyPanel();
    mp1.decorate (java.awt.Color.blue, 180);
    MyPanel mp2 = new MyPanel();
    mp2.decorate(Color.gray, 400);
  }
}