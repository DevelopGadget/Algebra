
package Vista;

import com.sun.awt.AWTUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Splash extends javax.swing.JFrame {

    Timer t;
    ActionListener la;
    public Splash() {
        la = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(barra.getValue() < 100){
                    barra.setValue(barra.getValue() + 5);
                }else{
                    t.stop();
                    dispose();
                    VistaAlgebra v1 = new VistaAlgebra();
                }
            }
        };
        t = new Timer(100, la); 
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        setVisible(true);
        setLocationRelativeTo(null);
        t.start();
        setIconImage(new ImageIcon(getClass().getResource("/Componentes/Logo_1.png")).getImage());           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(321, 313));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Componentes/output_S1CEkV.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-20, -20, 340, 330);
        getContentPane().add(barra);
        barra.setBounds(110, 150, 110, 19);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
