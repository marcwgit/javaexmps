
// File   : methods/KmToMilesMethods.java
// Purpose: Converts kilometers to miles using two methods.
// Author : Fred Swartz - placed in public domain
// Date   : 22 Apr 2006

import javax.swing.*;

public class KmToMilesMethods {
    //========================================================= constants
    private static final double MILES_PER_KILOMETER = 0.621;    

    //============================================================== main
    public static void main(String[] args) {
        double kms   = getDouble("Enter number of kilometers.");
        double miles = convertKmToMi(kms);
        displayString(kms + " kilometers is " + miles + " miles.");
    }

    //===================================================== convertKmToMi
    // Conversion method - kilometers to miles.
    private static double convertKmToMi(double kilometers) {
        double miles = kilometers * MILES_PER_KILOMETER;
        return miles;
    }

    //========================================================= getDouble
    // I/O convenience method to read a double value.
    private static double getDouble(String prompt) {
        String tempStr;
        tempStr = JOptionPane.showInputDialog(null, prompt);
        return Double.parseDouble(tempStr);
    }

    //===================================================== displayString
    // I/O convenience method to display a string in dialog box.
    private static void displayString(String output) {
        JOptionPane.showMessageDialog(null, output);
    }
}
