import java.io.*;
import java.util.Scanner;
public class TimeCalc {

   public static void main(String args[]) {
      /* Create two objects using constructor */
      Time timeOne = new Time("James Smith");
      Time timeTwo = new Time("Mary Anne");
	  Time timeThree = new Time("");
	  

      // Invoking methods for each object created
      timeOne.timeHours(26);
      timeOne.timeMinutes(50);
      timeOne.timeSeconds(1000);
      timeOne.printTime();

      timeTwo.timeHours(21);
      timeTwo.timeMinutes(50);
      timeTwo.timeSeconds(500);
      timeTwo.printTime();
	  
	  timeThree.timeHours(getInputInt("Hours"));
      timeThree.timeMinutes(getInputInt("Minutes"));
      timeThree.timeSeconds(getInputInt("Seconds"));
      timeThree.printTime();
	  System.out.println(timeThree.makeTotalSeconds());
   }
   
   
   
   
      public static int getInputInt(String Request)
   {
      int a;
//      float b;
//      String s;

      Scanner in = new Scanner(System.in);

//      System.out.println("Enter a string");
//      s = in.nextLine();
//      System.out.println("You entered string "+s);

      System.out.println("Enter "+Request);
      a = in.nextInt();
      System.out.println("You entered integer "+a+" "+ Request);
	  return a;

//      System.out.println("Enter a float");
//      b = in.nextFloat();
//      System.out.println("You entered float "+b);   
   }
}