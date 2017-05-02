// File   : methods/KmToMiles.java
// Purpose: Convert kilometers to miles. Use JOptionPane for input / output.
// Author : Fred Swartz
// Date   : 22 Apr 2006

import javax.swing.*;

public class KmToMiles {
    //============================================================ constants
    private static final double MILES_PER_KILOMETER = 0.621;    

    //================================================================= main
    public static void main(String[] args) {                        //Note 1
        //... Local variables
        String kmStr;    // String km before conversion to double.
        double km;       // Number of kilometers.
        double mi;       // Number of miles.

        //... Input
        kmStr = JOptionPane.showInputDialog(null, "Enter kilometers.");
        km = Double.parseDouble(kmStr);

        //... Computation
        mi = km * MILES_PER_KILOMETER;

        //... Output
        JOptionPane.showMessageDialog(null, km + " kilometers is "
                                          + mi + " miles.");
    }
}
