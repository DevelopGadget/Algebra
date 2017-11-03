package algebra;


import Vista.Splash;
import Vista.VistaAlgebra;

import javax.swing.UIManager;

public class Algebra {

    public static void main(String[] args) {
         try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAlgebra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Splash v1 = new Splash();

    }

    public static Boolean Esnumero(String i) {
        boolean V = true;
        try {
            Double.parseDouble(i);
        } catch (NumberFormatException e) {
            V = false;
        }
        return V;
    }
}
