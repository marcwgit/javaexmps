import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.lang.*;
import java.util.Scanner;




//import java.io.*;

public class IsPrime2{



	public static void main(String[] args)throws Exception{
		Scanner in = new Scanner(System.in);
Long userinput, maxinput;

	boolean result=true; //true means number is prime.

		String name="";

System.out.println("Enter an integer: ");  

//  name = System.console().readLine();
name = in.nextLine();


// name=br.readLine(); 

System.out.println("number is "+name);

//value1 = Integer.valueof(na

userinput= Long.parseLong(name);

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
