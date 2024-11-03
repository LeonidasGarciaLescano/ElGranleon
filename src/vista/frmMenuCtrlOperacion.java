/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;

/**
 *
 * @author USUARIO
 */
public class frmMenuCtrlOperacion extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuCtrlMedico
     */
    public frmMenuCtrlOperacion() {
        initComponents();
        getContentPane().setBackground(new Color(204, 255, 204));
        this.setLocationRelativeTo(null);
        setResizable(false);
        setSize(1000, 620);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlTitulo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PnlVerCtrlMedico = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PnlInputs = new javax.swing.JPanel();
        PnlGenCrtlMed = new javax.swing.JPanel();
        BtnGenCtrlOpr = new javax.swing.JButton();
        PnlVerCtrlMed = new javax.swing.JPanel();
        BtnVerCtrlOpr = new javax.swing.JButton();
        PnlModCtrlMed = new javax.swing.JPanel();
        BtnModCtrlMed = new javax.swing.JButton();
        PnlDelCtrlMed = new javax.swing.JPanel();
        BtnDelCtrlMed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlTitulo.setBackground(new Color(204, 255, 204));
        PnlTitulo.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gestión de controles de operaciones");
        PnlTitulo.add(jLabel3, new java.awt.GridBagConstraints());

        PnlVerCtrlMedico.setBackground(new Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel2.setText("¡Buenas (Tiempo), (Nombre del veterinario)!");

        javax.swing.GroupLayout PnlVerCtrlMedicoLayout = new javax.swing.GroupLayout(PnlVerCtrlMedico);
        PnlVerCtrlMedico.setLayout(PnlVerCtrlMedicoLayout);
        PnlVerCtrlMedicoLayout.setHorizontalGroup(
            PnlVerCtrlMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlVerCtrlMedicoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlVerCtrlMedicoLayout.setVerticalGroup(
            PnlVerCtrlMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlVerCtrlMedicoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PnlInputs.setBackground(new Color(204, 255, 204));
        PnlInputs.setLayout(new java.awt.GridLayout(4, 1));

        PnlGenCrtlMed.setBackground(new Color(204, 255, 204));
        PnlGenCrtlMed.setLayout(new java.awt.GridBagLayout());

        BtnGenCtrlOpr.setText("General control de operación");
        BtnGenCtrlOpr.setPreferredSize(new java.awt.Dimension(700, 80));
        BtnGenCtrlOpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenCtrlOprActionPerformed(evt);
            }
        });
        PnlGenCrtlMed.add(BtnGenCtrlOpr, new java.awt.GridBagConstraints());

        PnlInputs.add(PnlGenCrtlMed);

        PnlVerCtrlMed.setBackground(new Color(204, 255, 204));
        PnlVerCtrlMed.setLayout(new java.awt.GridBagLayout());

        BtnVerCtrlOpr.setText("Visualizar controles de operaciones");
        BtnVerCtrlOpr.setPreferredSize(new java.awt.Dimension(700, 80));
        PnlVerCtrlMed.add(BtnVerCtrlOpr, new java.awt.GridBagConstraints());

        PnlInputs.add(PnlVerCtrlMed);

        PnlModCtrlMed.setBackground(new Color(204, 255, 204));
        PnlModCtrlMed.setLayout(new java.awt.GridBagLayout());

        BtnModCtrlMed.setText("Modificar controles de operaciones");
        BtnModCtrlMed.setPreferredSize(new java.awt.Dimension(700, 80));
        BtnModCtrlMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModCtrlMedActionPerformed(evt);
            }
        });
        PnlModCtrlMed.add(BtnModCtrlMed, new java.awt.GridBagConstraints());

        PnlInputs.add(PnlModCtrlMed);

        PnlDelCtrlMed.setBackground(new Color(204, 255, 204));
        PnlDelCtrlMed.setLayout(new java.awt.GridBagLayout());

        BtnDelCtrlMed.setText("Eliminar control de operaciones");
        BtnDelCtrlMed.setPreferredSize(new java.awt.Dimension(700, 80));
        PnlDelCtrlMed.add(BtnDelCtrlMed, new java.awt.GridBagConstraints());

        PnlInputs.add(PnlDelCtrlMed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PnlVerCtrlMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PnlInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlVerCtrlMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlInputs, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModCtrlMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModCtrlMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModCtrlMedActionPerformed

    private void BtnGenCtrlOprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenCtrlOprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGenCtrlOprActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuCtrlOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuCtrlOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuCtrlOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuCtrlOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuCtrlOperacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelCtrlMed;
    private javax.swing.JButton BtnGenCtrlOpr;
    private javax.swing.JButton BtnModCtrlMed;
    private javax.swing.JButton BtnVerCtrlOpr;
    private javax.swing.JPanel PnlDelCtrlMed;
    private javax.swing.JPanel PnlGenCrtlMed;
    private javax.swing.JPanel PnlInputs;
    private javax.swing.JPanel PnlModCtrlMed;
    private javax.swing.JPanel PnlTitulo;
    private javax.swing.JPanel PnlVerCtrlMed;
    private javax.swing.JPanel PnlVerCtrlMedico;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
