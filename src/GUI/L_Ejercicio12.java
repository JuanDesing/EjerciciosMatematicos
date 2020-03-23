package GUI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Clases.L_Definitiva_Universitario;

public class L_Ejercicio12 extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public L_Ejercicio12() {
        initComponents();
        this.setLocationRelativeTo(null);
        String cabecera[] = {"  Código  ", " Corte 1 ", " Corte 2 ", " Corte 3 ", "      Observación      "};
        String Datos[][] = {};
        modelo = new DefaultTableModel(Datos, cabecera);

        Tabla.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setBackground(new java.awt.Color(255, 236, 226));
        Tabla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(23, 15, 4)));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 600, 200));

        button.setBackground(new java.awt.Color(255, 228, 190));
        button.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        button.setForeground(new java.awt.Color(38, 30, 18));
        button.setText("Calcular");
        button.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(45, 28, 0), null));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 100, 30));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 23)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 30, 18));
        jLabel5.setText("Ufps");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 30, 18));
        jLabel6.setText("Información académica - Universitarios");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondouniversitarios4.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //L_Definitiva_Universitario datosdeluniversitario[] = new L_Definitiva_Universitario[1000];
    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
       
        int estudiantesregistrados = 0;

        float nota1, nota2, nota3, nota4, nota5;
        int codigo;

            JOptionPane.showMessageDialog(null, "Notas del primer corte");

            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el código del estudiante para calcular su definitiva: "));
            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1 del Examen: "));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2 del Trabajo Quiz: "));
            nota3 = Float.parseFloat(JOptionPane.showInputDialog("Nota 3 del Examen: "));
            nota4 = Float.parseFloat(JOptionPane.showInputDialog("Nota 4 del Trabajo Quiz: "));
            nota5 = Float.parseFloat(JOptionPane.showInputDialog("Nota 5 del Trabajo Quiz Final: "));

            float corte1 = L_Definitiva_Universitario.metodoacumulado(nota1, nota2, nota3, nota4, nota5);

            JOptionPane.showMessageDialog(null, "Notas del segundo corte");

            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1 del Examen: "));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2 del Trabajo Quiz: "));
            nota3 = Float.parseFloat(JOptionPane.showInputDialog("Nota 3 del Examen: "));
            nota4 = Float.parseFloat(JOptionPane.showInputDialog("Nota 4 del Trabajo Quiz: "));
            nota5 = Float.parseFloat(JOptionPane.showInputDialog("Nota 5 del Trabajo Quiz Final: "));

            float corte2 = L_Definitiva_Universitario.metodoacumulado(nota1, nota2, nota3, nota4, nota5);

            JOptionPane.showMessageDialog(null, "Notas del tercer corte");

            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1 del Examen: "));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2 del Trabajo Quiz: "));
            nota3 = Float.parseFloat(JOptionPane.showInputDialog("Nota 3 del Examen: "));
            nota4 = Float.parseFloat(JOptionPane.showInputDialog("Nota 4 del Trabajo Quiz: "));
            nota5 = Float.parseFloat(JOptionPane.showInputDialog("Nota 5 del Trabajo Quiz Final: "));

            float corte3 = L_Definitiva_Universitario.metodoacumulado(nota1, nota2, nota3, nota4, nota5);

            float promedio3cortes = (corte1 + corte2 + corte3) / 3;
            float notaquedebesacar = L_Definitiva_Universitario.metodocalculo(promedio3cortes);

            L_Definitiva_Universitario universitario = new L_Definitiva_Universitario(codigo, corte1, corte2, corte3, promedio3cortes, notaquedebesacar);
            String datosaingresarenlatabla[] = {String.valueOf(universitario.getCodigo()),String.valueOf(universitario.getCorte1()),
            String.valueOf(universitario.getCorte2()),String.valueOf(universitario.getCorte3()),String.valueOf(L_Definitiva_Universitario.metodocalculo(universitario.getPromedio3cortes()))};
            
            modelo.addRow(datosaingresarenlatabla);

            JOptionPane.showMessageDialog(null, "Estudiantes registrados: " + Tabla.getRowCount());

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
            java.util.logging.Logger.getLogger(L_Ejercicio12.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L_Ejercicio12.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L_Ejercicio12.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L_Ejercicio12.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L_Ejercicio12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
