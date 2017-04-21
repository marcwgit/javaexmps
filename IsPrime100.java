import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

//import java.io.*;
public class IsPrime100{

	public static void main(String[] args)throws Exception{
Long maxinput;
//Long userinput;
Integer testnumber;
	boolean result=true; //true means number is prime.
		
for(testnumber=1;testnumber<101; testnumber++){
		
//userinput= Long(testnumber);
long userinput = testnumber.longValue();
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
}	   
}}

