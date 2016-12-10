import java.io.*;  
public class Factorprime{  
public static void main(String args[])throws Exception{  
  
   InputStreamReader r=new InputStreamReader(System.in);  
   BufferedReader br=new BufferedReader(r); 

   int count = 0;
   String num1="";
   int testnumber= 0;
 
   System.out.println("Enter a number: ");
   num1=br.readLine();

   testnumber = Integer.valueOf(num1);

   System.out.println(testnumber);

   System.out.print("Prime factors: ");

//   while (testnumber > 2){
     
     for (int i=2; i< Math.sqrt(testnumber)+1; i++){

//      System.out.println("in 1 "+testnumber); 
      while (testnumber % i == 0){
         
//          System.out.println("in 2 "+count);
    
         testnumber = testnumber / i; 
         if (count ==0){
            System.out.print(i);
         } else {
            System.out.print(","+i);
         }
         count++;

      }

     } 
     
   // }
  System.out.println(count);
  if (count==0){System.out.print(testnumber+" 1");}
   System.out.println();
 br.close();
 r.close();
 }
}
