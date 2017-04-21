
import TerminalIO.KeyboardReader;

KeyboardReader reader = new KeyboardReader() 

double fahrenheit; double celsius;

fahrenheit = reader.readDouble();

celsius = (fahrenheit - 32.0) • 5.0 / 9.0;


System.out.println(celsius);

reader.pause();


