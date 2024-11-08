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
public class frmInicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form frmInicioSesion
     */
    public frmInicioSesion() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        PnlTitulo = new javax.swing.JPanel();
        LblTitutlo = new javax.swing.JLabel();
        PnlLogo = new javax.swing.JPanel();
        PnlInputs = new javax.swing.JPanel();
        PnlId = new javax.swing.JPanel();
        TxtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PnlClave = new javax.swing.JPanel();
        TxtClave = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        PnlIngresar = new javax.swing.JPanel();
        BtnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        PnlTitulo.setBackground(new java.awt.Color(204, 255, 204));
        PnlTitulo.setForeground(new java.awt.Color(60, 63, 65));
        PnlTitulo.setLayout(new java.awt.GridBagLayout());

        LblTitutlo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        LblTitutlo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitutlo.setText("Zoológico \"El Gran León\"");
        PnlTitulo.add(LblTitutlo, new java.awt.GridBagConstraints());

        PnlLogo.setBackground(new java.awt.Color(204, 255, 204));
        PnlLogo.setForeground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout PnlLogoLayout = new javax.swing.GroupLayout(PnlLogo);
        PnlLogo.setLayout(PnlLogoLayout);
        PnlLogoLayout.setHorizontalGroup(
            PnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PnlLogoLayout.setVerticalGroup(
            PnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );

        PnlInputs.setLayout(new java.awt.GridLayout(3, 1));

        PnlId.setBackground(new Color(204,255,204));
        PnlId.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtId.setPreferredSize(new java.awt.Dimension(200, 35));
        PnlId.add(TxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 300, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Identificación del zoológico:");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 25));
        PnlId.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 300, -1));

        PnlInputs.add(PnlId);

        PnlClave.setBackground(new Color(204,255,204));

        TxtClave.setPreferredSize(new java.awt.Dimension(200, 35));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Contraseña:");
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 25));

        javax.swing.GroupLayout PnlClaveLayout = new javax.swing.GroupLayout(PnlClave);
        PnlClave.setLayout(PnlClaveLayout);
        PnlClaveLayout.setHorizontalGroup(
            PnlClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlClaveLayout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addGroup(PnlClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(351, 351, 351))
        );
        PnlClaveLayout.setVerticalGroup(
            PnlClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlClaveLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlInputs.add(PnlClave);

        PnlIngresar.setBackground(new Color(204,255,204));
        PnlIngresar.setLayout(new java.awt.GridBagLayout());

        BtnIngresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        BtnIngresar.setText("Ingresar");
        BtnIngresar.setPreferredSize(new java.awt.Dimension(200, 50));
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 5;
        PnlIngresar.add(BtnIngresar, gridBagConstraints);

        PnlInputs.add(PnlIngresar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PnlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PnlInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlInputs, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnIngresar;
    private javax.swing.JLabel LblTitutlo;
    private javax.swing.JPanel PnlClave;
    private javax.swing.JPanel PnlId;
    private javax.swing.JPanel PnlIngresar;
    private javax.swing.JPanel PnlInputs;
    private javax.swing.JPanel PnlLogo;
    private javax.swing.JPanel PnlTitulo;
    public javax.swing.JPasswordField TxtClave;
    public javax.swing.JTextField TxtId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
