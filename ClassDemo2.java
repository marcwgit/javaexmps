import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

//import java.io.*;
class ClassDemo2{
	public static void main(String[] args)throws Exception{
			
	UsefulCmds myCmds = new UsefulCmds();
	myCmds.printThis();
		
		
	}	
public class UsefulCmds{	
	public void printThis(){

		System.out.print("Enter something: ");  
		String name = System.console().readLine();
		System.out.println(name);
	}
}
}