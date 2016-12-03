import java.io.*;  
public class PrimeFind{  
public static void main(String args[])throws Exception{  
  
 InputStreamReader r=new InputStreamReader(System.in);  
 BufferedReader br=new BufferedReader(r);  
  
 String name="";  
//   big problem   String primeOrNot="Prime";
 


// start while loop and ask for input

  while(!name.equals("stop")){  
   System.out.println("Enter number: ");  
   name=br.readLine();  
   System.out.println("data is: "+name);  
 
// declare test values and reinitialize for new test

   String primeOrNot = "Prime";  
   Double testValue = Double.valueOf(name);

//  START TEST
//  for(int i=2; i<testValue; i++){
   for(int i=2; i<(testValue/2)+1; i++){ 
 
     System.out.println(testValue + " " + i + " " + testValue%i);
     if ((testValue % i) == 0)
      {
          primeOrNot = "Not Prime";
          break; 
      } // if loop end

   
   } // for loop end 

   System.out.println(testValue +" is " + primeOrNot);

 }  
  
 br.close();  
 r.close();  
 }  
} 
