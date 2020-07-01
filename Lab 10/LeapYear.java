/** Lab 10, COMP160, Nicholas Dong
  * LeapYear.java
  * Determines if a given year is a leap year
  */

public class LeapYear{
  //data fields
  public int years;
  
  /** enters years to be checked
    */
  public static void main(String[]args){
    leapYear(2014);
    leapYear(2016);
    leapYear(1900);
    leapYear(2000);
    leapYear(1554);
  }
  /** determines leap year status
    */
  public static void leapYear(int years){
    if (years < 1582){
      System.out.println(years + ": predates the Gregorian calendar");
    } else if ((years%4 == 0) && ((years%100 == 0) == (years%400 == 0))){
      System.out.println(years + ": is a leap year");
    } else {
      System.out.println(years + ": is not a leap year");
    }
  }
}