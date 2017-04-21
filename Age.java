import java.io.*;  
public class Age{  
public static void main(String args[])throws Exception{  
  
   InputStreamReader r=new InputStreamReader(System.in);  
   BufferedReader br=new BufferedReader(r); 


   String num1="";
   String num2="";
   int firstNum=0;
   int secNum=0;
   int latestVal=0;
   int pastVal=1;
   int sumVal=0;
   int count=1;
   int age = 0;
  
   System.out.println("Enter first number: ");
   num1=br.readLine();

 age = Integer.valueOf(num1);

if ((age > 0 && age < 13) || (age > 19))  
{  
  System.out.println("You are not a teenager");  
}  
else  
{  
  System.out.println("You are a teenager");  
}  



if (!((age > 0 && age < 13) || (age > 19)))
{
  System.out.println("You are a teenager");
}
else
{
  System.out.println("You are not a teenager");
}



if (!(age > 0) || !(age < 13) && !(age > 19))
{
  System.out.println("You are a teenager");
}
else
{
  System.out.println("You are not a teenager");
}












//boolean isTeenager = ((age > 0 && age < 13) || (age > 19)) ?  System.out.println("You are not a teenager") : System.out.println("You are a teenager");  



 br.close();
 r.close();
 }
}
