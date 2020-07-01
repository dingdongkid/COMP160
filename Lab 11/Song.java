/** Lab 11, COMP160, Nicholas Dong
  * Song.java
  * Gives information about a song lyric
  */

public class Song{
  private String songLine;
  //constructor for Song
  public Song(String t){
    songLine = t;
  }
  //returns songLine string
  public String toString(){
    return songLine;
  }
  /*processing information of the song line
   */
  public void process(){
    //printing length
    System.out.println("Length is: " + songLine.length());
    System.out.println("Last character is: " + songLine.charAt(songLine.length()-1));
    //declaring word locations
    int space1 = songLine.indexOf(" ");
    int space2 = songLine.indexOf(" ", space1+1);
    
    //printing song line as two lines
    if (space2 < 0 ){
      System.out.println(songLine.substring(0));
    } else {
        System.out.println(songLine.substring(0,space2) + "\n" + songLine.substring(space2+1));
        //printing third word, first letter
    System.out.println("First letter of third word is: " + songLine.charAt(space2+1));
      }
    
    
    
    //printing in uppercase
    System.out.println(songLine.toUpperCase());
    
    //replacing spaces with x
    String x = songLine.replaceAll(" ", "x");
    System.out.println(x.toString());
    
    //finding first b
    System.out.println("First b is located at: " + songLine.indexOf("b"));
    
    //printing song line
    System.out.println(songLine);
  }
}