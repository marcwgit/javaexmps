import java.io.*;  
public class Factorprime{  
public static void main(String args[])throws Exception{  
  
   InputStreamReader r=new InputStreamReader(System.in);  
   BufferedReader br=new BufferedReader(r); 

   int count = 0;
   String num1="";
   Double testnumber= 0.0;
 
   System.out.println("Enter a number: ");
   num1=br.readLine();

   testnumber = Double.valueOf(num1);

   System.out.println(testnumber);

   System.out.print("Prime factors: ");

   while (testnumber > 2.0){

//      System.out.println("in 1 "+testnumber); 
      while (testnumber % 2 == 0){
         
//          System.out.println("in 2 "+count);
    
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
         
         if (count ==0){
            System.out.print("3");
         } else {
            System.out.print(",3");
         }
         count++;

      }
     
      while (testnumber % 5  == 0){

         testnumber = testnumber / 5;
         
         if (count == 0){
            System.out.print("5");
         } else {
            System.out.print(",5");
         }
         count++;
      }

      while (testnumber % 7  == 0){

         testnumber = testnumber / 7;
         
         if (count == 0){
            System.out.print("7");
         } else {
            System.out.print(",7");
         }
         count++;
      }
     
     
           while (testnumber % 11  == 0){

         testnumber = testnumber / 11;
         
         if (count == 0){
            System.out.print("11");
         } else {
            System.out.print(",11");
         }
         count++;
      }
     
     
           while (testnumber % 13  == 0){

         testnumber = testnumber / 13;
         
         if (count == 0){
            System.out.print("13");
         } else {
            System.out.print(",13");
         }
         count++;
      }
     
     
     
           while (testnumber % 17  == 0){

         testnumber = testnumber / 17;
         
         if (count == 0){
            System.out.print("17");
         } else {
            System.out.print(",17");
         }
         count++;
      }
     
     
           while (testnumber % 19  == 0){

         testnumber = testnumber / 19;
         
         if (count == 0){
            System.out.print("19");
         } else {
            System.out.print(",19");
         }
         count++;
      }
     
           while (testnumber % 23  == 0){

         testnumber = testnumber / 23;
         
         if (count == 0){
            System.out.print("23");
         } else {
            System.out.print(",23");
         }
         count++;
      }
     
     
   }
   System.out.println();
 br.close();
 r.close();
 }
}
