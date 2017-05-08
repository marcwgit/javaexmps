public class Time {

//   String name;
	int totalSeconds;
//   int age;
//   String designation;
//   double salary;

	int hours, minutes, seconds; 

   // This is the constructor of the class Employee
   public Time(Integer totalSeconds) {
      this.totalSeconds = totalSeconds;
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
   
   public int makeTotalSeconds(){ //   (int timeHours,int timeMinutes,int timeSeconds){
	//   seconds = timeSeconds;
	 //  minutes = timeMinutes;
	 //  hours = timeHours;
	   return seconds+(minutes * 60) + (hours * 3600);
   }
   
   public void printTotalSeconds(){
	   
	   System.out.println(this.totalSeconds);
	   System.out.println();
	   
   }
   
   
   public void displayFromSecsToHMS(Integer totalSeconds){
	   int Hours, Mins, Secs;
	   this.totalSeconds = totalSeconds;
	   Hours = this.totalSeconds / 3600;
	   Mins = (this.totalSeconds % 3600) / 60;
//	   Mins = (this.totalSeconds - (Hours * 3600)) % 60;
	   Secs = (this.totalSeconds % 3600) % 60;
//	   Secs = (this.totalSeconds - (Hours * 3600) -(Mins * 60);
	   System.out.println("Hours "+Hours+" Mins "+Mins+" Secs "+Secs);
	   
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
      System.out.println("Minutes: " + minutes );
      System.out.println("Seconds:" + seconds );
   }
   

}
