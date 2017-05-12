import java.io.*;
import java.util.Scanner;


public class PerfectSquare {

	static boolean squareCheck(int inpt){	
	boolean reslt = false;
		
	for (int i=1; i<Math.sqrt(inpt)+1;i++){
		
		if (i==Math.sqrt(inpt)){
			return true;
		}
	}
	
//		return reslt;
		return false;
		
	}
	
    public static int getInputInt(String Request)

 {

    int a;

//    float b;

//    String s;



    Scanner in = new Scanner(System.in);



//    System.out.println("Enter a string");

//    s = in.nextLine();

//    System.out.println("You entered string "+s);



    System.out.println("Enter "+Request);

    a = in.nextInt();

    System.out.println("You entered integer "+a+" "+ Request);

	  return a;



//    System.out.println("Enter a float");

//    b = in.nextFloat();

//    System.out.println("You entered float "+b);   

 }
}
