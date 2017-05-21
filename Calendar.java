
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startday, numberofdays, beginning, numberofrows, activeday;
		startday=getInputInt("Enter starting day; 0=Sunday..");
		numberofdays=getInputInt("Enter amount of days in month");
		beginning=findStartCount(startday);
		System.out.println(""+startday);
		System.out.println(""+numberofdays);
		System.out.println(""+beginning);
		
		activeday=beginning;
		System.out.println(""+activeday);
		numberofrows=findRows(numberofdays,beginning);
		for (int j=1; j<=numberofrows; j++){
		PrintSolidRow();
		for(int week=1; week<=7; week++){
		PrintOneDay(activeday, numberofdays);
		activeday++;
		}
		System.out.println("");
		PrintSpacedRow();
		}
	}
	public static int findStartCount(int count){
		System.out.println(""+((count*-1)+1));
		return (count*-1)+1;

	}
	public static int findRows(int numberdayscount, int beginningcount){
		int numberofblocks, numberofrows;
		numberofblocks=numberdayscount-beginningcount;
		numberofrows=numberofblocks/7;
		if(numberofrows%7!=0){
			numberofrows++;
		}
		return numberofrows;
	}
	public static void PrintDays(){
		System.out.println("   Sun     Mon     Tue     Wed     Thu     Fri     Sat");
	}
	public static void PrintSolidRow() {
		System.out.println("******************************************************");
	}
	public static void PrintOneDay(int daycount, int numberofdays){
	//	System.out.println("daycount in PrintOneDay  "+daycount);
		if((daycount<=0)&&(daycount<numberofdays)){
			System.out.print("     -1*");
		}
		if((daycount>=1)&&(daycount<10)){
			System.out.print("      "+daycount+"*");
		}
		if((daycount>=10)&&(daycount<=numberofdays)){
			System.out.print("     "+daycount+"");
		}
	}
	//
	public static void PrintSpacedRow(){
		System.out.println("*       *       *       *       *       *       *       *");
		System.out.println("*       *       *       *       *       *       *       *");
	}
	public static int getInputInt(String Request)

	{

	   int a;

	//   float b;

	//   String s;



	   Scanner in = new Scanner(System.in);



	//   System.out.println("Enter a string");

	//   s = in.nextLine();

	//   System.out.println("You entered string "+s);



	   System.out.println(Request);

	   a = in.nextInt();

	   //System.out.println("You entered integer "+a+" "+ Request);

		  return a;



	//   System.out.println("Enter a float");

	//   b = in.nextFloat();

	//   System.out.println("You entered float "+b);   

	}

}
