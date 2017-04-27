import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

//import java.io.*;
public class ClassDemo1a{
	public static void main(String[] args)throws Exception{
			
	printThis();	
		
	}	
	
public static void printThis(){

System.out.print("Enter something: ");  
String name = System.console().readLine();
System.out.println(name);


	}
		
}
