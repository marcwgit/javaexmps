// import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

//import java.io.*;
public class IsPrimec{
	int inputNumber inpNumber;


	public void isPrime()  {
	
		inpNumber = inputNumber;
		
			
		
Long maxinput;
	boolean result=true; //true means number is prime.
		String name="";
System.out.println("Enter an integer: ");  

//  name = System.console().readLine();

// name = System.console().readLine();


// name=br.readLine(); 
System.out.println("number is "+name);

// Long userinput = inpNumber.longValue();   no work	
Long userinput = new Long(inpNumber);   //try this	
//       userinput = (inpNumber);		
 //userinput= Long.parseLong(name);
 
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

