/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.time.LocalTime;

/**
 *
 * @author USUARIO
 */
public class frmMenuCtrlMedico extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuCtrlMedico
     */
    public frmMenuCtrlMedico() {
        initComponents();
        getContentPane().setBackground(new Color(204, 255, 204));
        this.setLocationRelativeTo(null);
        setResizable(false);
        setSize(1000, 620);
        setDate();
    }
    private void setDate(){
        LocalTime currentTime = LocalTime.now();
        String saludo;

        if (currentTime.isBefore(LocalTime.NOON)) {
            saludo = "¡Buenos días veterinario medico encargado!";
        } else if (currentTime.isBefore(LocalTime.of(18, 0))) {
            saludo = "¡Buenas tardes veterinario medico encargado!";
        } else {
            saludo = "¡Buenas noches veterinario medico encargado!";
        }

        LblSaludo.setText(saludo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PnlTitulo = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        PnlVerCtrlMedico = new javax.swing.JPanel();
        LblSaludo = new javax.swing.JLabel();
        PnlInputs = new javax.swing.JPanel();
        PnlGenCrtlMed = new javax.swing.JPanel();
        BtnGenCtrlMed = new javax.swing.JButton();
        PnlVerCtrlMed = new javax.swing.JPanel();
        BtnVerCtrlMed = new javax.swing.JButton();
        PnlModCtrlMed = new javax.swing.JPanel();
        BtnModCtrlMed = new javax.swing.JButton();
        PnlDelCtrlMed = new javax.swing.JPanel();
        BtnDelCtrlMed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlTitulo.setBackground(new Color(204, 255, 204));
        PnlTitulo.setLayout(new java.awt.GridBagLayout());

        LblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        LblTitulo.setText("Gestión de controles médicos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 120, 21, 147);
        PnlTitulo.add(LblTitulo, gridBagConstraints);

        PnlVerCtrlMedico.setBackground(new Color(204, 255, 204));

        LblSaludo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        LblSaludo.setText("¡Buenas (Tiempo), (Nombre del veterinario)!");

        javax.swing.GroupLayout PnlVerCtrlMedicoLayout = new javax.swing.GroupLayout(PnlVerCtrlMedico);
        PnlVerCtrlMedico.setLayout(PnlVerCtrlMedicoLayout);
        PnlVerCtrlMedicoLayout.setHorizontalGroup(
            PnlVerCtrlMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlVerCtrlMedicoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LblSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlVerCtrlMedicoLayout.setVerticalGroup(
            PnlVerCtrlMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlVerCtrlMedicoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LblSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PnlInputs.setBackground(new Color(204, 255, 204));
        PnlInputs.setLayout(new java.awt.GridLayout(4, 1));

        PnlGenCrtlMed.setBackground(new Color(204, 255, 204));
        PnlGenCrtlMed.setLayout(new java.awt.GridBagLayout());

        BtnGenCtrlMed.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BtnGenCtrlMed.setText("Generar control médico");
        BtnGenCtrlMed.setPreferredSize(new java.awt.Dimension(700, 80));
        BtnGenCtrlMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenCtrlMedActionPerformed(evt);
            }
        });
        PnlGenCrtlMed.add(BtnGenCtrlMed, new java.awt.GridBagConstraints());

        PnlInputs.add(PnlGenCrtlMed);

        PnlVerCtrlMed.setBackground(new Color(204, 255, 204));
        PnlVerCtrlMed.setLayout(new java.awt.GridBagLayout());

        BtnVerCtrlMed.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BtnVerCtrlMed.setText("Visualizar controles médicos");
        BtnVerCtrlMed.setPreferredSize(new java.awt.Dimension(700, 80));
        PnlVerCtrlMed.add(BtnVerCtrlMed, new java.awt.GridBagConstraints());

        PnlInputs.add(PnlVerCtrlMed);

        PnlModCtrlMed.setBackground(new Color(204, 255, 204));
        PnlModCtrlMed.setLayout(new java.awt.GridBagLayout());

        BtnModCtrlMed.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BtnModCtrlMed.setText("Modificar controles médicos");
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

        BtnDelCtrlMed.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BtnDelCtrlMed.setText("Eliminar control médico");
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
                .addComponent(PnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlVerCtrlMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModCtrlMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModCtrlMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModCtrlMedActionPerformed

    private void BtnGenCtrlMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenCtrlMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGenCtrlMedActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuCtrlMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuCtrlMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuCtrlMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuCtrlMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuCtrlMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnDelCtrlMed;
    public javax.swing.JButton BtnGenCtrlMed;
    public javax.swing.JButton BtnModCtrlMed;
    public javax.swing.JButton BtnVerCtrlMed;
    public javax.swing.JLabel LblSaludo;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PnlDelCtrlMed;
    private javax.swing.JPanel PnlGenCrtlMed;
    private javax.swing.JPanel PnlInputs;
    private javax.swing.JPanel PnlModCtrlMed;
    private javax.swing.JPanel PnlTitulo;
    private javax.swing.JPanel PnlVerCtrlMed;
    private javax.swing.JPanel PnlVerCtrlMedico;
    // End of variables declaration//GEN-END:variables
}
