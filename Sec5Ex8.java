//sec 5 ex 8 sec5ex8
import java.io.InputStreamReader;

import java.lang.*;

import java.util.Scanner;

import java.io.BufferedReader;


public class Sec5Ex8{
	
	public static void main(String[] args)throws Exception{
		
	Integer inputValue = new Integer(99);
	Integer testValue = new Integer(99);
	Integer oput;
		
	
	GetInput ex8Input = new GetInput();
	ex8Input.getInput();
	System.out.println(ex8Input.getInput());
//	System.out.println(getInput());



testValue /= 10;
System.out.println(testValue);


inputValue = 998;
oput = inputValue/100;
System.out.println(oput);
System.out.println(inputValue/100);


Integer a = new Integer(3); // or even just Integer a = 2;
a *= 10;
System.out.println(a);

Integer b = new Integer(998);
b /= 100;
System.out.println(b); 


//	System.out.print("enter something: ");
//		String name = System.console().readLine();
//		System.out.println(name);
	
	}

	
	String getInput(){
		
	System.out.print("Enter something in prog loop: ");

		String name = System.console().readLine();

		System.out.println("in prog loop " +name);
		return name;
	
	}
}

		
	


//public class SeparateDigit{ 
	
//	public String separate (){
//	return;
//	}
//}
