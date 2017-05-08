import java.io.*;
import java.util.Scanner;
public class EmployeeTest {

   public static void main(String args[]) {
      /* Create two objects using constructor */
      Employee empOne = new Employee("James Smith");
      Employee empTwo = new Employee("Mary Anne");
      Employee empThree = new Employee("");
      // Invoking methods for each object created
      empOne.empAge(26);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(1000);
      empOne.printEmployee();

      empTwo.empAge(21);
      empTwo.empDesignation("Software Engineer");
      empTwo.empSalary(500);
      empTwo.printEmployee();
	  
      empThree.empAge(getInputInt());
      empThree.empDesignation("Software Engineer");
      empThree.empSalary(getInputInt());
      empThree.printEmployee();

	  
   }
         public static int getInputInt()
   {
      int a;
//      float b;
//      String s;

      Scanner in = new Scanner(System.in);

//      System.out.println("Enter a string");
//      s = in.nextLine();
//      System.out.println("You entered string "+s);

      System.out.println("Enter an integer");
      a = in.nextInt();
      System.out.println("You entered integer "+a);
	  return a;

//      System.out.println("Enter a float");
//      b = in.nextFloat();
//      System.out.println("You entered float "+b);   
   }
   
   
   
}
