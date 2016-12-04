import java.io.*;  
public class PrimeFind{  
public static void main(String args[])throws Exception{  
  
 InputStreamReader r=new InputStreamReader(System.in);  
 BufferedReader br=new BufferedReader(r);  
  
 String name="";  
//   big problem   String primeOrNot="Prime";
  Double testValue = 0.0;
 


// start while loop and ask for input

  while(!name.equals("stop")){
   while (testValue < 1){
       System.out.println("Enter number a positive integer: ");  
       name=br.readLine();  
       System.out.println("data is: "+name);  
 
// declare test values and reinitialize for new test

       String primeOrNot = "Prime";  
       Double testValue = Double.valueOf(name);
   }

//  START TEST
//  for(int i=2; i<testValue; i++){
   for(int i=2; i<(testValue/2)+1; i++){
//   for(int i=2; i<(testValue/i)+1; i++){    // prevent tests of multiples 
 
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
