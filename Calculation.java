import java.util.Scanner;
class Calculation{  

 void fact(int  n){  
  double fact;  
  fact = 1;
   for(int i=1;i<=n;i++){  
   fact=fact*i;  
  }  
 System.out.println("factorial is "+fact);  
}  
public static void main(String args[]){

// scanner gets its input from the console.
    Scanner scanner = new Scanner(System.in);
    String name = "";
System.out.print("seed? ");
name = scanner.next();
System.out.println();

int userinp = Integer.parseInt(name);  
// new Calculation().fact(5);//calling method with anonymous object
new Calculation().fact(userinp);//calling method with anonymous object   
}  
}  
