import java.lang.*;

public class BooleanDemo {

   public static void main(String[] args) {

      // create 2 boolean primitives bool1, bool2
      boolean bool1, bool2;

      // assign values to bool1, bool2
      bool1 = true;
      bool2 = false;

      // create 2 String's s1, s2
      String s1, s2;

      /**
       *  static method is called using class name 
       *  assign string value of primitives bool1, bool2 to s1, s2
       */
      s1 = Boolean.toString(bool1);
      s2 = Boolean.toString(bool2);

      String str1 = "String value of boolean primitive " +bool1+ " is "  +s1;
      String str2 = "String value of boolean primitive " +bool2+ " is "  +s2;

      // print s1, s2 values
      System.out.println( str1 );
      System.out.println( str2 );
   }
}
