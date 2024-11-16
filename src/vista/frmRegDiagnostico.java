/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class frmRegDiagnostico extends javax.swing.JFrame {

    /**
     * Creates new form frmRegCtrlOperacion
     */
    public frmRegDiagnostico() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ChbReceta.setEnabled(false);
        ChbSintoma.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        PnlTitulo = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        PnlDiagnostico = new javax.swing.JPanel();
        LblDiagnostico = new javax.swing.JLabel();
        LblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaDescripcion = new javax.swing.JTextArea();
        LblResultado = new javax.swing.JLabel();
        TxtResultado = new javax.swing.JTextField();
        BtnAddSintoma = new javax.swing.JButton();
        BtnAddReceta = new javax.swing.JButton();
        ChbSintoma = new javax.swing.JCheckBox();
        ChbReceta = new javax.swing.JCheckBox();
        PnlRegistrar = new javax.swing.JPanel();
        BtnRegistrar = new javax.swing.JButton();
        PnlExamenFisico = new javax.swing.JPanel();
        LblExamenFisico = new javax.swing.JLabel();
        LblFrecuencia = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtAreaEstadoFisico = new javax.swing.JTextArea();
        LblEstadoFisico = new javax.swing.JLabel();
        LblTemperatura = new javax.swing.JLabel();
        TxtFrecuencia = new javax.swing.JTextField();
        TxtTemperatura = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlTitulo.setPreferredSize(new java.awt.Dimension(704, 100));

        LblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        LblTitulo.setText("Registrar Diagnostico");

        javax.swing.GroupLayout PnlTituloLayout = new javax.swing.GroupLayout(PnlTitulo);
        PnlTitulo.setLayout(PnlTituloLayout);
        PnlTituloLayout.setHorizontalGroup(
            PnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTituloLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(LblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlTituloLayout.setVerticalGroup(
            PnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTituloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LblTitulo)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        LblDiagnostico.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LblDiagnostico.setText("Diagnostico:");

        LblDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblDescripcion.setText("Descripcion:");

        TxtAreaDescripcion.setColumns(20);
        TxtAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(TxtAreaDescripcion);

        LblResultado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblResultado.setText("Resultado:");

        BtnAddSintoma.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        BtnAddSintoma.setText("Añadir Sintomas");

        BtnAddReceta.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        BtnAddReceta.setText("Añadir Receta");

        ChbSintoma.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ChbSintoma.setText("Sintomas");

        ChbReceta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ChbReceta.setText("Receta");
        ChbReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChbRecetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlDiagnosticoLayout = new javax.swing.GroupLayout(PnlDiagnostico);
        PnlDiagnostico.setLayout(PnlDiagnosticoLayout);
        PnlDiagnosticoLayout.setHorizontalGroup(
            PnlDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDiagnosticoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(ChbSintoma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChbReceta)
                .addGap(70, 70, 70))
            .addGroup(PnlDiagnosticoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PnlDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAddReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LblDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                        .addComponent(LblDescripcion)
                        .addGroup(PnlDiagnosticoLayout.createSequentialGroup()
                            .addComponent(LblResultado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtResultado))
                        .addComponent(BtnAddSintoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        PnlDiagnosticoLayout.setVerticalGroup(
            PnlDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDiagnosticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblDiagnostico)
                .addGap(15, 15, 15)
                .addComponent(LblDescripcion)
                .addGroup(PnlDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDiagnosticoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PnlDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlDiagnosticoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(TxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PnlDiagnosticoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LblResultado)
                                .addGap(18, 18, 18)))
                        .addComponent(BtnAddSintoma)
                        .addGap(26, 26, 26)
                        .addComponent(BtnAddReceta)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDiagnosticoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PnlDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChbReceta)
                            .addComponent(ChbSintoma))
                        .addGap(15, 15, 15))))
        );

        PnlRegistrar.setPreferredSize(new java.awt.Dimension(838, 80));

        BtnRegistrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        BtnRegistrar.setText("Registrar diagnóstico");

        javax.swing.GroupLayout PnlRegistrarLayout = new javax.swing.GroupLayout(PnlRegistrar);
        PnlRegistrar.setLayout(PnlRegistrarLayout);
        PnlRegistrarLayout.setHorizontalGroup(
            PnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRegistrarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlRegistrarLayout.setVerticalGroup(
            PnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlRegistrarLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        LblExamenFisico.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LblExamenFisico.setText("Examen Fisico:");

        LblFrecuencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblFrecuencia.setText("Frecuencia cárdiaca:");

        TxtAreaEstadoFisico.setColumns(20);
        TxtAreaEstadoFisico.setRows(5);
        jScrollPane2.setViewportView(TxtAreaEstadoFisico);

        LblEstadoFisico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblEstadoFisico.setText("Estado fisico:");

        LblTemperatura.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblTemperatura.setText("Temperatura corporal:");

        TxtFrecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFrecuenciaActionPerformed(evt);
            }
        });

        TxtTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlExamenFisicoLayout = new javax.swing.GroupLayout(PnlExamenFisico);
        PnlExamenFisico.setLayout(PnlExamenFisicoLayout);
        PnlExamenFisicoLayout.setHorizontalGroup(
            PnlExamenFisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlExamenFisicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlExamenFisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(PnlExamenFisicoLayout.createSequentialGroup()
                        .addGroup(PnlExamenFisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblExamenFisico)
                            .addComponent(LblTemperatura)
                            .addComponent(LblEstadoFisico)
                            .addComponent(LblFrecuencia))
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addComponent(TxtFrecuencia)
                    .addComponent(TxtTemperatura))
                .addContainerGap())
        );
        PnlExamenFisicoLayout.setVerticalGroup(
            PnlExamenFisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlExamenFisicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblExamenFisico)
                .addGap(18, 18, 18)
                .addComponent(LblEstadoFisico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(LblTemperatura)
                .addGap(18, 18, 18)
                .addComponent(TxtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblFrecuencia)
                .addGap(18, 18, 18)
                .addComponent(TxtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PnlDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PnlExamenFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PnlRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlExamenFisico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFrecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFrecuenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFrecuenciaActionPerformed

    private void TxtTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTemperaturaActionPerformed

    private void ChbRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChbRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChbRecetaActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnAddReceta;
    public javax.swing.JButton BtnAddSintoma;
    public javax.swing.JButton BtnRegistrar;
    public javax.swing.JCheckBox ChbReceta;
    public javax.swing.JCheckBox ChbSintoma;
    private javax.swing.JLabel LblDescripcion;
    private javax.swing.JLabel LblDiagnostico;
    private javax.swing.JLabel LblEstadoFisico;
    private javax.swing.JLabel LblExamenFisico;
    private javax.swing.JLabel LblFrecuencia;
    private javax.swing.JLabel LblResultado;
    private javax.swing.JLabel LblTemperatura;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PnlDiagnostico;
    private javax.swing.JPanel PnlExamenFisico;
    private javax.swing.JPanel PnlRegistrar;
    private javax.swing.JPanel PnlTitulo;
    public javax.swing.JTextArea TxtAreaDescripcion;
    public javax.swing.JTextArea TxtAreaEstadoFisico;
    public javax.swing.JTextField TxtFrecuencia;
    public javax.swing.JTextField TxtResultado;
    public javax.swing.JTextField TxtTemperatura;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
