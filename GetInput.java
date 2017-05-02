import java.io.InputStreamReader;

import java.lang.*;


public class GetInput{
	
	public String getInput(){
		
	System.out.print("Enter something sep: ");

		String name = System.console().readLine();

		System.out.println(name);
		return name;
	
	}
}
