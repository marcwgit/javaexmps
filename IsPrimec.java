// import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

//import java.io.*;
public class IsPrimec{
	private int inpNumber;


	public IsPrimec(int inputNumber)  {
	
		inpNumber = inputNumber;
		
			
		
Long maxinput;
	boolean result=true; //true means number is prime.
		String name="";
System.out.println("Enter an integer: ");  
<<<<<<< HEAD
//  name = System.console().readLine();
=======
// name = System.console().readLine();
>>>>>>> cfcfd661029065b1a8fc45f250571c9f3c5fec4d

// name=br.readLine(); 
System.out.println("number is "+name);
//value1 = Integer.valueof(na
long userinput = inpnumber.longValue();		
userinput = (inpnumber);		
// userinput= Long.parseLong(name);
	maxinput=(userinput/2)+1;
	int j=maxinput.intValue();
	System.out.println("Value of j "+j);
		for(int count=2; count<=j;count++){
			if(userinput%count==0){
			result=false;
			System.out.println(userinput +" divisible by " + count);
			}else{
			System.out.println(userinput +" not divisible by " + count);
			}
		}
String s1=Boolean.toString(result);
		System.out.println(s1);		   
}}

