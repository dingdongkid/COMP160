import java.text.*;

/** BookShopApp
  * Nicholas Dong
  */
public class BookShopApp{
  public static void main (String[]args){
    Book b1 = new Book();  // creating Life of Pi object
    b1.setTitle("Life of Pi");
    b1.setPages(348);
    b1.setPrice(28.90);
    
    Book b2 = new Book();  // creating Mister Pip object
    b2.setTitle("Mister Pip");
    b2.setPages(240);
    b2.setPrice(22.70);
    
    Book b3 = new Book(); // creating Guide object
    b3.setTitle("The Hitchhiker's Guide to the Galaxy");
    b3.setPages(583);
    b3.setPrice(42);
    
    b1.displayBook();
    b2.displayBook();
    b3.displayBook();
  }
}
    