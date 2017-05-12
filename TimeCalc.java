import java.io.*;
import java.util.Scanner;
public class TimeCalc {

   public static void main(String args[]) {
      /* Create two objects using constructor */
      Time timeOne = new Time(3600);
      Time timeTwo = new Time(3600);
//	  Time timeThree = new Time(0);
	  

      // Invoking methods for each object created
      timeOne.timeHours(26);
      timeOne.timeMinutes(50);
      timeOne.timeSeconds(1000);
      timeOne.printTime();
      System.out.println(timeOne.makeTotalSeconds());

      timeTwo.timeHours(21);
      timeTwo.timeMinutes(50);
      timeTwo.timeSeconds(500);
      timeTwo.printTime();
      System.out.println(timeTwo.makeTotalSeconds());
	  
      
	  timeOne.timeHours(getInputInt("Hours"));
      timeOne.timeMinutes(getInputInt("Minutes"));
      timeOne.timeSeconds(getInputInt("Seconds"));
      timeOne.printTime();
	  System.out.println(timeOne.makeTotalSeconds());
	  
	  timeTwo.timeHours(getInputInt("Hours"));
      timeTwo.timeMinutes(getInputInt("Minutes"));
      timeTwo.timeSeconds(getInputInt("Seconds"));
      timeTwo.printTime();
	  System.out.println(timeTwo.makeTotalSeconds());
      
      

	  
//	  timeThree.timeHours(getInputInt("Hours"));
//      timeThree.timeMinutes(getInputInt("Minutes"));
//      timeThree.timeSeconds(getInputInt("Seconds"));
//	   Time timeThree = new Time(3789);
	  
	   Time timeThree = new Time(timeOne.makeTotalSeconds() + timeTwo.makeTotalSeconds());
	  timeThree.printTime();
	  timeThree.displayFromSecsToHMS();
	  
	  System.out.println(timeThree.makeTotalSeconds());
	  
	  timeThree.printTotalSeconds();
	  
	  timeThree.displayFromSecsToHMS(3721);
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
