import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

	
public class UsefulCmds{	
	public void printThis(){

		System.out.print("Enter something: ");  
		String name = System.console().readLine();
		System.out.println(name);
	}
}
