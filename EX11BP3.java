import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.io.*;
public class EX11BP3 {

	public static void main(String[] args)throws Exception
	{
		
		 InputStreamReader r=new InputStreamReader(System.in);  
		 BufferedReader br=new BufferedReader(r); 
		// TODO Auto-generated method stub

int value1=0, value2=0, numberofprimes=0;
String name="";

System.out.println("Enter starting number: ");  
name=br.readLine(); 
System.out.println("number is "+name);
//value1 = Integer.valueof(name);
value1 = Integer.parseInt(name);

System.out.println("Enter ending number"); 
name =br.readLine();
System.out.println("number is "+name);
//value2 = Integer.valueof(name);
value2 = Integer.parseInt(name);


for(int outercount=value1; outercount<value2+1; outercount++ ){
	
	
numberofprimes++;
System.out.println(numberofprimes+"start outer");
for(int count=2; count<=outercount-1; count++){
	
	System.out.println(outercount+" "+count);
	if(0==outercount%count){
		numberofprimes--;
		System.out.println("is not prime");
		break;
		
	}
}
System.out.println("is prime");
}
System.out.println(numberofprimes+" before 1 check");
	if(value1==1){numberofprimes--;}
	System.out.println(numberofprimes);

br.close();  
r.close(); 
	}

}


