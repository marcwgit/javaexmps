import java.io.*;  
public class Whiledbl{  
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
  
   System.out.println("Enter first number: ");
   num1=br.readLine();

   System.out.println("Enter second number: ");
   num2=br.readLine();
 
   firstNum = Integer.valueOf(num1);
   secNum = Integer.valueOf(num2);
   
 //  pastVal = firstNum;
   latestVal = secNum;

   
//    while ((count < 2) || (( pastVal != firstNum) && (latestVal != secNum))){
//    while ((count < 2) || (!(( pastVal == firstNum) && (latestVal == secNum)))){
      
       while (!(( pastVal == firstNum) && (latestVal == secNum))){
      
      System.out.println("firstNum : "+firstNum+" secNum : "+secNum);
      System.out.println("pastVal : "+pastVal+" latestVal : "+latestVal);

//      sumVal = pastVal + latestVal;
      System.out.println(sumVal+" "+pastVal+" "+latestVal+" "+count);
/*      if (sumVal > 9){
         sumVal = sumVal - 10;
      }

      System.out.println(" "+sumVal+" ");
      
      pastVal = latestVal;  */
      latestVal++;
      System.out.println(sumVal+" "+pastVal+" "+latestVal+" "+count+" loop end");
      count++;
   }
   System.out.println(count);
 br.close();
 r.close();
 }
}
