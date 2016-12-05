import java.io.*;  
public class RangePrime{  
public static void main(String args[])throws Exception{  


String alphaLower = "";
String alphaUpper = "";
int lowerNum = 0;
int upperNum = 0;
int testValue = 0;
int primeCount = 0;
String primeOrNot = "";
  
 InputStreamReader r=new InputStreamReader(System.in);  
 BufferedReader br=new BufferedReader(r);  
  
       System.out.println("Enter starting number: ");  
       alphaLower=br.readLine();  
       System.out.println("data is: "+alphaLower);
       
       
       System.out.println("Enter starting number: ");  
       alphaUpper=br.readLine();  
       System.out.println("data is: "+alphaUpper);
 
// declare test values and reinitialize for new test

         
lowerNum = Integer.valueOf(alphaLower);
upperNum = Integer.valueOf(alphaUpper);
  
  
 // test:
 // if (lowerNum <= 0){System.out.println("positive integer only");}
 // test1:
 // if (upperNum <= 0){System.out.println("positive integer only");}
  
  if (lowerNum<==0){lowerNum = 2;} 
  if (upperNum <=0){upperNum = 2;}
  
  if (lowerNum ==1){lowerNum = 2;}

for (int j=lowerNum; j <= upperNum; j++){
   testValue = j;
   primeOrNot = "Prime";
   
//  START TEST
//  for(int i=2; i<testValue; i++){
//   for(int i=2; i<(testValue/2)+1; i++){
   for(int i=2; i<(testValue/i)+1; i++){    // prevent tests of multiples 
 
     System.out.println(testValue + " " + i + " " + testValue%i);
     if ((testValue % i) == 0)
      {
          primeOrNot = "Not Prime";
          break; 
      } // if loop end


   } // for loop end 
  
  
       if (primeOrNot == "Prime"){ primeCount++; 
                                
                                System.out.println("primeCount inc");
                                } 

   System.out.println(testValue +" is " + primeOrNot);

}
 System.out.println("Number of primes in range: "+primeCount);
    
//    break test; 
 // break test1;
  

 br.close();  
 r.close();  
 }  
} 
