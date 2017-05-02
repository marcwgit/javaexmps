// File   : methods/avg3/AvgThreeOverloaded.java
// Description: Averages three numbers -- meaningless, but
// Purpose: Show an overloaded method, getDouble, with three definitions,
//          differing in the number of parameters.
// Issues : Input isn't checked for legality (non-null number) because
//          the point is to show overloading.
// Author : Fred Swartz - 2007-01-11 - placed in public domain

import javax.swing.*;

public class AvgThreeOverloaded {

    //============================================================== main
    public static void main(String[] args) {
        //... Read three numbers using the three different methods.
        //    Using three different methods is only to show overloading.
        double n1   = getDouble();
        double n2   = getDouble("Enter the second number.");
        double n3   = getDouble("Enter last number.", 0.0, 100.0);
        double average = (n1 + n2 + n3) / 3.0;
        displayString("Average is " + average);
    }

    //========================================================= getDouble
    // I/O convenience method to read a double value.
    //     This version of the getDouble method simply calls on another
    //     version passing it a generic input message.
    private static double getDouble() {
        return getDouble("Enter a number");
    }

    //========================================================= getDouble
    // I/O convenience method to read a double value given a prompt.
    //     This version of getDouble displays the user supplied prompt.
    private static double getDouble(String prompt) {
        String tempStr;
        tempStr = JOptionPane.showInputDialog(null, prompt);
        return Double.parseDouble(tempStr);
    }

    //========================================================= getDouble
    // I/O convenience method to read a double value in a range.
    //     It builds a new prompt and calls another version to get
    //     the value, looping until a value in the range is found.
    private static double getDouble(String prompt, double low, double high) {
        double result;
        String rangePrompt = prompt + "  Value must be in range " 
                                    + low + " to " + high;
        
        //... Read and loop back if the number is not in the right range.
        do {
            result = getDouble(rangePrompt);
        } while (result < low || result > high);
        
        return result;
    }

    //===================================================== displayString
    // I/O convenience method to display a string in dialog box.
    private static void displayString(String output) {
        JOptionPane.showMessageDialog(null, output);
    }
}
