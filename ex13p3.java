import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.io.*;
public class ex13p3{

	public static void main(String[] args)throws Exception
	{
		
		 InputStreamReader r=new InputStreamReader(System.in);  
		 BufferedReader br=new BufferedReader(r); 
		// TODO Auto-generated method stub

int firstinteger=0, secondinteger=0, gcf=0, lowernumber=0;
String name="";

System.out.println("Enter an integer: ");  
name=br.readLine(); 
System.out.println("number is "+firstinteger);
//value1 = Integer.valueof(name);
firstinteger = Integer.parseInt(name);

System.out.println("Enter an integer"); 
name =br.readLine();
System.out.println("number is "+secondinteger);
//value2 = Integer.valueof(name);
secondinteger = Integer.parseInt(name);

if(firstinteger>=secondinteger){
lowernumber=secondinteger;}
if(firstinteger<=secondinteger){
lowernumber=firstinteger;}
for(int count=lowernumber;count>1;count--){
if((firstinteger%count==0)&&(secondinteger%count==0)){
System.out.print(count);
		break;}
}
	br.close();  
r.close(); 
	}

}
