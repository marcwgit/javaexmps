import java.util.Scanner;
import java.io.InputStreamReader;
import java.lang.*;

class Sec5Ex9b{

   public static void main(String args[])
   {
	   Integer mainMins, mainSecs, totalSecs=0;
	   int[] HMSarray = new int[3];
	   
	   
	      String request[] = {"First Time" , "Second Time"};
	      for (int i =0; i < request.length; i++)
		  {
	    	  System.out.println(request[i]);
	mainMins = readInput("minutes");
	mainSecs = readInput("seconds");
	
	totalSecs += makeTotalSecs(mainMins, mainSecs);
	
	System.out.println(mainMins);
	System.out.println(mainSecs);
	
	//System.out.println("in main "+readInput("minutes"));
	//System.out.println("in main "+readInput("seconds"));
	
	displayHMS(mainMins,mainSecs);
	HMSarray = displayHMS(mainMins,mainSecs);
	   System.out.println(HMSarray[2]);
	   System.out.println(HMSarray[1]);
	   System.out.println(HMSarray[0]);
	   
	   
	   System.out.println("Times added");
	   mainMins = 0;
	   displayHMS(mainMins,totalSecs);
		HMSarray = displayHMS(mainMins,totalSecs);
		   System.out.println(HMSarray[2]);
		   System.out.println(HMSarray[1]);
		   System.out.println(HMSarray[0]);

		  }
	   
	
   }
   
   
   static Integer makeTotalSecs(Integer inpMins, Integer inpSecs){
	
	   Integer secs, mins;
	   return inpSecs +(60 * inpMins);
   }
   
   static Integer readInput(String inpPrompt)
   {
      int a;
//      float b;
//      String s;
//	String prompt = inpPrompt;
      


      Scanner in = new Scanner(System.in);
      
		System.out.print("Enter "+inpPrompt+": ");
      a = in.nextInt();

		System.out.println();
      System.out.println("You entered "+a+" "+ inpPrompt);
	  return a;

	  
    
   }
   
   static int[] displayHMS(Integer inpMins, Integer inpSecs){
	   
	   Integer hours, mins, secs;
	   int[] outHMSarray = new int[3];
	   
	   mins = inpSecs/60;
	   secs = inpSecs - (mins*60);
	   outHMSarray[0] = secs;
	   
	   inpMins = inpMins + mins;
	   hours = inpMins/60;
	   outHMSarray[2] = hours;
	   
	   mins = inpMins - (hours*60);
	   outHMSarray[1] = mins;
	   
	   System.out.println(hours);
	   System.out.println(mins);
	   System.out.println(secs);
	   return outHMSarray;
	   
   }
}
