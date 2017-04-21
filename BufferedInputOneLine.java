import java.io.*;  
class G5{  
public static void main(String args[])throws Exception{  
  
InputStreamReader r=new InputStreamReader(System.in);  
BufferedReader br=new BufferedReader(r);  

         for(int i=10; i>1; i--){
              System.out.println("The value of i is: "+i);
         }

 	for(int i=10; i>1; i--){
  		System.out.println("The value of i is: "+i);
		System.out.println("I plus one is: " +i+1);
		System.out.println("Enter your name");  
		String name=br.readLine();  
		System.out.println("Welcome "+name);
	}  
 }  
}  
