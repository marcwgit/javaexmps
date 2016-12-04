import java.io.*;  
public class Factorprime{  
public static void main(String args[])throws Exception{  
  
   InputStreamReader r=new InputStreamReader(System.in);  
   BufferedReader br=new BufferedReader(r); 

   int count = 0;
   String num1="";
   Double testnumber= 0.0;
 
   System.out.println("Enter your number: ");
   num1=br.readLine();

   testnumber = Double.valueOf(num1);

   System.out.println(testnumber);

   System.out.print("Prime factors: ");

   while (testnumber > 2.0){

//      System.out.println("in 1 "+testnumber); 
      while (testnumber % 2 == 0){
         
          System.out.println("in 2 "+count);
    
         testnumber = testnumber / 2; 
         if (count ==0){
            System.out.print("2");
         } else {
            System.out.print(",2");
         }
         count++;

      }

      while (testnumber % 3  == 0){
        
         testnumber = testnumber / 3;
         
         if (count > 1){
            System.out.print("3");
         } else {
            System.out.print(",3");
         }
         count++;

      }
     
      while (testnumber % 5  == 0){

         testnumber = testnumber / 5;
         
         if (count > 1){
            System.out.print("5");
         } else {
            System.out.print(",5");
         }
         count++;
      }


   }
   System.out.println();
 br.close();
 r.close();
 }
}
