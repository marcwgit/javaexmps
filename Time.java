import java.io.*;
public class Time {

   String name;
//   int age;
//   String designation;
//   double salary;

	int hours, minutes, seconds; 

   // This is the constructor of the class Employee
   public Time(String name) {
      this.name = name;
   }
   
      // Assign the age of the Employee  to the variable age.
   public void timeHours(int timeHours) {
      hours = timeHours;
   }
   
      // Assign the age of the Employee  to the variable age.
   public void timeMinutes(int timeMinutes) {
      minutes = timeMinutes;
   }
   
      // Assign the age of the Employee  to the variable age.
   public void timeSeconds(int timeSeconds) {
      seconds = timeSeconds;
   }

   // Assign the age of the Employee  to the variable age.
 //  public void timeHours(int timeHours) {
//      age = timeHours;
//   }

   /* Assign the designation to the variable designation.*/
//   public void empDesignation(String empDesig) {
//      designation = empDesig;
//   }

   /* Assign the salary to the variable	salary.*/
//   public void empSalary(double empSalary) {
//      salary = empSalary;
//   }

   /* Print the Time details */
   public void printTime() {
//      System.out.println("Name:"+ name );
//      System.out.println("Age:" + age );
//      System.out.println("Designation:" + designation );
//      System.out.println("Salary:" + salary);
	  System.out.println("Hours: " + hours );
      System.out.println("Minutes: " + minutes );+
      System.out.println("Seconds:" + seconds );
   }
   

}
