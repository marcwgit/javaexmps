
import TerminalIO.KeyboardReader;

public class MyConvert{
    public static void main(String[] args){
        KeyboardReader reader = new KeyboardReader();
        double fahrenheit;
        double celsius;
      
        fahrenheit = reader.readDouble("Enter the temperature in Farenheit: ");
      
        celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
      
        System.out.println("The equivalent in Celsius is: " + celsius);
  
    }
 
} 
