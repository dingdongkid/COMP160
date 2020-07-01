/** Lab 11, COMP160, Nicholas Dong
  * SongApp.java
  * Application class for Song
  */

public class SongApp{
  public static void main (String[]args){
    //creating objects
    Song song1 = new Song("While my guitar gently weeps");
    Song song2 = new Song("Let it be");
    Song song3 = new Song("Penny Lane");
    
    //printing song 1 information
    System.out.println(song1.toString());
    song1.process();
    System.out.print("\n");
    
    //printing song 2 information
    System.out.println(song2.toString());
    song2.process();
    System.out.print("\n");
    
    //printing song 3 information
    System.out.println(song3.toString());
    song3.process();
    System.out.print("\n");
  }
}