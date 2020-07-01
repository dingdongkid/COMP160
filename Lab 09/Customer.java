import java.util.Scanner;
/** Lab 9, COMP160, Nicholas Dong
  * Customer.java
  * Represents customer for a meal and discounted harbour cruise package
  */

public class Customer{
  
  //data fields
  public String name;
  public boolean child = false;
  public boolean student = false;
  public boolean booked = false;
  
  /** constructor for customer data
    */
  public Customer(String nameIn, int age, boolean studentIn){
    name = nameIn;
    child = (age >= 5 && age <= 16);
    student = studentIn;
  }
  
  /** returns customer name
    */
  public String getName(){
    return name;
  }
  
  /** boolean checks age for child
    */
  public boolean isChild(){
  
    return child;
  }
  
  /** boolean checks age for student
    */
  public boolean isStudent(){
    return student;
  }
  
  /** boolean checks booking status
    */
  public boolean isBooked(){
    return booked;
  }
  
  /** checks if booking has been confirmed
    */
  public void setBooked(){
    Scanner scan = new Scanner(System.in);
    String booking;
    booking = scan.nextLine();
    if (booking.equals("y") || booking.equals("Y")){
      booked = true;
      System.out.println("Booked\n");
    } else{
        System.out.println("\n");
    }
  }
}