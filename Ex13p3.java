import java.io.*;  
public class Ex13p3{  
public static void main(String args[])throws Exception{  
  
   InputStreamReader r=new InputStreamReader(System.in);  
   BufferedReader br=new BufferedReader(r); 
   int count = 0;
   String num1="";
   int testnumber= 0;
   int firstNumber=0;
   int secondNumber=0;
   int lowerNumber=0;
 
   System.out.println("Enter a number: ");
   num1=br.readLine();
   firstNumber = Integer.valueOf(num1);
   System.out.println(firstNumber);

   System.out.println("Enter a number: ");
   num1=br.readLine();
   secondNumber = Integer.valueOf(num1);
   System.out.println(secondNumber);
  
  if (firstNumber <= secondNumber){
    lowerNumber = firstNumber;
  }else{
    lowerNumber = secondNumber;
  }
  
  for (int i = lowerNumber; i > 1; i--){
    if (firstNumber%i==0 && secondNumber%i==0){
      System.out.println(i);
      break;
    }
  }
      
 
  
   br.close();
 r.close();
 }
}
