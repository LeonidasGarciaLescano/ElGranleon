/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class frmRegCtrlOperacion extends javax.swing.JFrame {

    /**
     * Creates new form frmRegCtrlOperacion
     */
    public frmRegCtrlOperacion() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlRegistrarControlOperacion = new javax.swing.JPanel();
        LblRegistrar = new javax.swing.JLabel();
        PnlInformeMedicoLeft = new javax.swing.JPanel();
        LblInformeMedico = new javax.swing.JLabel();
        LblNombreOperacion = new javax.swing.JLabel();
        LblDescripcion = new javax.swing.JLabel();
        LblResultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaDescripcion = new javax.swing.JTextArea();
        TxtAnimal = new javax.swing.JTextField();
        TxtNombreOperacion = new javax.swing.JTextField();
        TxtResultado = new javax.swing.JTextField();
        LblAnimal = new javax.swing.JLabel();
        PnlRegistrar = new javax.swing.JPanel();
        BtnRegistrar = new javax.swing.JToggleButton();
        PnlInformeMedicoRight = new javax.swing.JPanel();
        LblAnotaciones = new javax.swing.JLabel();
        LblFechaOperacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtAreaAnotaciones = new javax.swing.JTextArea();
        DateChFechaOperacion = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlRegistrarControlOperacion.setPreferredSize(new java.awt.Dimension(1000, 100));

        LblRegistrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        LblRegistrar.setText("Registrar control de operacion");

        javax.swing.GroupLayout PnlRegistrarControlOperacionLayout = new javax.swing.GroupLayout(PnlRegistrarControlOperacion);
        PnlRegistrarControlOperacion.setLayout(PnlRegistrarControlOperacionLayout);
        PnlRegistrarControlOperacionLayout.setHorizontalGroup(
            PnlRegistrarControlOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRegistrarControlOperacionLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(LblRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlRegistrarControlOperacionLayout.setVerticalGroup(
            PnlRegistrarControlOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRegistrarControlOperacionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LblRegistrar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        LblInformeMedico.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LblInformeMedico.setText("Informe medico:");

        LblNombreOperacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblNombreOperacion.setText("Nombre de la operacion:");

        LblDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblDescripcion.setText("Descripcion General:");

        LblResultado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblResultado.setText("Resultado:");

        TxtAreaDescripcion.setColumns(20);
        TxtAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(TxtAreaDescripcion);

        LblAnimal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblAnimal.setText("Animal:");

        javax.swing.GroupLayout PnlInformeMedicoLeftLayout = new javax.swing.GroupLayout(PnlInformeMedicoLeft);
        PnlInformeMedicoLeft.setLayout(PnlInformeMedicoLeftLayout);
        PnlInformeMedicoLeftLayout.setHorizontalGroup(
            PnlInformeMedicoLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInformeMedicoLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblInformeMedico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PnlInformeMedicoLeftLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PnlInformeMedicoLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlInformeMedicoLeftLayout.createSequentialGroup()
                        .addComponent(LblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnlInformeMedicoLeftLayout.createSequentialGroup()
                        .addGroup(PnlInformeMedicoLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlInformeMedicoLeftLayout.createSequentialGroup()
                                .addComponent(LblAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlInformeMedicoLeftLayout.createSequentialGroup()
                                .addComponent(LblNombreOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNombreOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlInformeMedicoLeftLayout.createSequentialGroup()
                                .addComponent(LblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
        );
        PnlInformeMedicoLeftLayout.setVerticalGroup(
            PnlInformeMedicoLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInformeMedicoLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblInformeMedico)
                .addGap(22, 22, 22)
                .addGroup(PnlInformeMedicoLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(PnlInformeMedicoLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNombreOperacion)
                    .addComponent(TxtNombreOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PnlInformeMedicoLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(LblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtnRegistrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlRegistrarLayout = new javax.swing.GroupLayout(PnlRegistrar);
        PnlRegistrar.setLayout(PnlRegistrarLayout);
        PnlRegistrarLayout.setHorizontalGroup(
            PnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRegistrarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PnlRegistrarLayout.setVerticalGroup(
            PnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlRegistrarLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        LblAnotaciones.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblAnotaciones.setText("Anotaciones:");

        LblFechaOperacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblFechaOperacion.setText("Fecha de la operacion:");

        TxtAreaAnotaciones.setColumns(20);
        TxtAreaAnotaciones.setRows(5);
        jScrollPane2.setViewportView(TxtAreaAnotaciones);

        javax.swing.GroupLayout PnlInformeMedicoRightLayout = new javax.swing.GroupLayout(PnlInformeMedicoRight);
        PnlInformeMedicoRight.setLayout(PnlInformeMedicoRightLayout);
        PnlInformeMedicoRightLayout.setHorizontalGroup(
            PnlInformeMedicoRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInformeMedicoRightLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PnlInformeMedicoRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlInformeMedicoRightLayout.createSequentialGroup()
                        .addGroup(PnlInformeMedicoRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblAnotaciones))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlInformeMedicoRightLayout.createSequentialGroup()
                        .addGroup(PnlInformeMedicoRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateChFechaOperacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblFechaOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(420, 420, 420))))
        );
        PnlInformeMedicoRightLayout.setVerticalGroup(
            PnlInformeMedicoRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInformeMedicoRightLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(LblFechaOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DateChFechaOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(LblAnotaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlInformeMedicoLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlInformeMedicoRight, javax.swing.GroupLayout.PREFERRED_SIZE, 484, Short.MAX_VALUE))
            .addComponent(PnlRegistrarControlOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlRegistrarControlOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlInformeMedicoRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlInformeMedicoLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegCtrlOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegCtrlOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegCtrlOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegCtrlOperacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegCtrlOperacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton BtnRegistrar;
    public com.toedter.calendar.JDateChooser DateChFechaOperacion;
    private javax.swing.JLabel LblAnimal;
    private javax.swing.JLabel LblAnotaciones;
    private javax.swing.JLabel LblDescripcion;
    private javax.swing.JLabel LblFechaOperacion;
    private javax.swing.JLabel LblInformeMedico;
    private javax.swing.JLabel LblNombreOperacion;
    private javax.swing.JLabel LblRegistrar;
    private javax.swing.JLabel LblResultado;
    private javax.swing.JPanel PnlInformeMedicoLeft;
    private javax.swing.JPanel PnlInformeMedicoRight;
    private javax.swing.JPanel PnlRegistrar;
    private javax.swing.JPanel PnlRegistrarControlOperacion;
    public javax.swing.JTextField TxtAnimal;
    public javax.swing.JTextArea TxtAreaAnotaciones;
    public javax.swing.JTextArea TxtAreaDescripcion;
    public javax.swing.JTextField TxtNombreOperacion;
    public javax.swing.JTextField TxtResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
