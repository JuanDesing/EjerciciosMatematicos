/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import Clases.H_Num_Amig;

/**
 *
 * @author USUARIO
 */
public class H_Números_Amigos extends javax.swing.JFrame {

    /**
     * Creates new form A_Potencia_De_Un_Numero
     */
    public H_Números_Amigos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(29, 21, 3));
        jLabel6.setText("Número 1:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(29, 21, 3));
        jLabel7.setText("Número 2: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        numero1.setBackground(new java.awt.Color(255, 255, 255));
        numero1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(45, 28, 0), new java.awt.Color(94, 49, 6)));
        getContentPane().add(numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 79, 28));

        numero2.setBackground(new java.awt.Color(255, 255, 255));
        numero2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(45, 28, 0), new java.awt.Color(94, 49, 6)));
        getContentPane().add(numero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 79, 28));

        button.setBackground(new java.awt.Color(255, 228, 190));
        button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        button.setForeground(new java.awt.Color(38, 30, 18));
        button.setText("Calcular");
        button.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(45, 28, 0), null));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 90, 30));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 23)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 30, 18));
        jLabel5.setText("Números amigos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed

        int num1 = Integer.parseInt(numero1.getText());
        int num2 = Integer.parseInt(numero2.getText());

        if (H_Num_Amig.Calcularsumadedivisorespropios(num1) == num2) {
            JOptionPane.showMessageDialog(null, "Los números ingresados son números amigos");
        } else {
            JOptionPane.showMessageDialog(null, "Los números ingresados no son números amigos");
        }

    }//GEN-LAST:event_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(H_Números_Amigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(H_Números_Amigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(H_Números_Amigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(H_Números_Amigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new H_Números_Amigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    // End of variables declaration//GEN-END:variables
}
