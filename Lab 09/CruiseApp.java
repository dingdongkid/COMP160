import java.util.Scanner;
import java.text.NumberFormat;
/** application class for Customer.java
 * Lab 9 COMP160
 */

public class CruiseApp{
  
    public static void main(String[]args){
        //each Customer created with name, age, showed student ID card
        Customer customer1 = new Customer("Aaron Stott",17, true);
        Customer customer2 = new Customer("Betty Adams",17, false);
        Customer customer3 = new Customer("Corin Child",16, true);
        Customer customer4 = new Customer("Doris Stewart",25, true);
        Customer customer5 = new Customer("Edmond Cheyne",12, false);
        Customer customer6 = new Customer("Fiona Chaney",7, false);
        Customer customer7 = new Customer("Ged Still-Child",16, true);
        Customer customer8 = new Customer("Harry Adamson",20, false);
        
        confirmBooking(customer1); 
        confirmBooking(customer2);
        confirmBooking(customer3);
        confirmBooking(customer4);
        confirmBooking(customer5);
        confirmBooking(customer6);
        confirmBooking(customer7);
        confirmBooking(customer8);
        
        showBooking(customer1);
        showBooking(customer2);
        showBooking(customer3);
        showBooking(customer4);
        showBooking(customer5);
        showBooking(customer6);
        showBooking(customer7);
        showBooking(customer8);
    }
    
    /** displays prices and confirms booking
      * calculates prices depending on discounts
      */
    public static void confirmBooking(Customer customer){
      NumberFormat fmt = NumberFormat.getCurrencyInstance(); //sets currency format     
      //declarations of local variables
      double ticketPrice = 56;
      double mealPrice = 30;
      
      //calculates ticket price with discount
      if (customer.isChild()|| customer.isStudent())
        ticketPrice = ticketPrice*0.5;
      else
          ticketPrice = ticketPrice*0.8;
      
      //calculates meal price with discount
      if (customer.isChild())
        mealPrice = mealPrice*0.5;
      else
          mealPrice = mealPrice*0.9;
      
     //prints price information 
      System.out.print(customer.getName() + "\nTicket price: " + fmt.format(ticketPrice) + "\nMeal price:   " + fmt.format(mealPrice) + "\nTotal price:  " + fmt.format(ticketPrice + mealPrice) + "\n");
      System.out.println("Confirm booking for " + customer.getName() + " (Y/N)");
      customer.setBooked();
    }
    
    //shows list of booked customers
    public static void showBooking(Customer customer){
      if (customer.isBooked())
        System.out.println(customer.getName() + " is booked");
    }
}