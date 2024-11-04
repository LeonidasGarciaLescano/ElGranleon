/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class frmVerDiagnostico extends javax.swing.JFrame {

    /**
     * Creates new form frmDiagnosticoVer
     */
    public frmVerDiagnostico() {
        initComponents();
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
        LblTitulo = new javax.swing.JLabel();
        PnlSintomas = new javax.swing.JPanel();
        LblSintomas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblSintomas = new javax.swing.JTable();
        PnlReceta = new javax.swing.JPanel();
        LblReceta = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblReceta = new javax.swing.JTable();
        PnlDiagnostico = new javax.swing.JPanel();
        LblResultado = new javax.swing.JLabel();
        LblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaDescripcion = new javax.swing.JTextArea();
        TxtResultado = new javax.swing.JTextField();
        PnlExamenFisico = new javax.swing.JPanel();
        LblExamenFisico = new javax.swing.JLabel();
        LblEstado = new javax.swing.JLabel();
        LblFechaExamen = new javax.swing.JLabel();
        LblTemperatura = new javax.swing.JLabel();
        LblFrecuencia = new javax.swing.JLabel();
        TxtEstado = new javax.swing.JTextField();
        TxtFechaExamen = new javax.swing.JTextField();
        TxtTemperatura = new javax.swing.JTextField();
        TxtFrecuencia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlTitulo.setPreferredSize(new java.awt.Dimension(1001, 100));

        LblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        LblTitulo.setText("Diagnostico de XXXXXX");

        javax.swing.GroupLayout PnlTituloLayout = new javax.swing.GroupLayout(PnlTitulo);
        PnlTitulo.setLayout(PnlTituloLayout);
        PnlTituloLayout.setHorizontalGroup(
            PnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTituloLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(LblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlTituloLayout.setVerticalGroup(
            PnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTituloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LblTitulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        LblSintomas.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LblSintomas.setText("Sintomas:");

        TblSintomas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(TblSintomas);

        javax.swing.GroupLayout PnlSintomasLayout = new javax.swing.GroupLayout(PnlSintomas);
        PnlSintomas.setLayout(PnlSintomasLayout);
        PnlSintomasLayout.setHorizontalGroup(
            PnlSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSintomasLayout.createSequentialGroup()
                .addComponent(LblSintomas)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PnlSintomasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnlSintomasLayout.setVerticalGroup(
            PnlSintomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlSintomasLayout.createSequentialGroup()
                .addComponent(LblSintomas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LblReceta.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LblReceta.setText("Receta:");

        TblReceta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TblReceta);

        javax.swing.GroupLayout PnlRecetaLayout = new javax.swing.GroupLayout(PnlReceta);
        PnlReceta.setLayout(PnlRecetaLayout);
        PnlRecetaLayout.setHorizontalGroup(
            PnlRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRecetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlRecetaLayout.createSequentialGroup()
                        .addComponent(LblReceta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlRecetaLayout.setVerticalGroup(
            PnlRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRecetaLayout.createSequentialGroup()
                .addComponent(LblReceta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        LblResultado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblResultado.setText("Resultado:");

        LblDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblDescripcion.setText("Descripcion:");

        TxtAreaDescripcion.setColumns(20);
        TxtAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(TxtAreaDescripcion);

        javax.swing.GroupLayout PnlDiagnosticoLayout = new javax.swing.GroupLayout(PnlDiagnostico);
        PnlDiagnostico.setLayout(PnlDiagnosticoLayout);
        PnlDiagnosticoLayout.setHorizontalGroup(
            PnlDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDiagnosticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addGroup(PnlDiagnosticoLayout.createSequentialGroup()
                        .addComponent(LblDescripcion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PnlDiagnosticoLayout.createSequentialGroup()
                        .addComponent(LblResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtResultado)))
                .addContainerGap())
        );
        PnlDiagnosticoLayout.setVerticalGroup(
            PnlDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDiagnosticoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblResultado)
                    .addComponent(TxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        LblExamenFisico.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LblExamenFisico.setText("Examen fisico:");

        LblEstado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblEstado.setText("Estado: ");

        LblFechaExamen.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblFechaExamen.setText("Fecha del examen:");

        LblTemperatura.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblTemperatura.setText("Temperatura corporal:");

        LblFrecuencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblFrecuencia.setText("Frecuencia cárdiaca:");

        javax.swing.GroupLayout PnlExamenFisicoLayout = new javax.swing.GroupLayout(PnlExamenFisico);
        PnlExamenFisico.setLayout(PnlExamenFisicoLayout);
        PnlExamenFisicoLayout.setHorizontalGroup(
            PnlExamenFisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlExamenFisicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlExamenFisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblExamenFisico)
                    .addGroup(PnlExamenFisicoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PnlExamenFisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PnlExamenFisicoLayout.createSequentialGroup()
                                .addComponent(LblEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlExamenFisicoLayout.createSequentialGroup()
                                .addComponent(LblFrecuencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtFrecuencia))
                            .addGroup(PnlExamenFisicoLayout.createSequentialGroup()
                                .addComponent(LblFechaExamen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtFechaExamen))
                            .addGroup(PnlExamenFisicoLayout.createSequentialGroup()
                                .addComponent(LblTemperatura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtTemperatura)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlExamenFisicoLayout.setVerticalGroup(
            PnlExamenFisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlExamenFisicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblExamenFisico)
                .addGap(18, 18, 18)
                .addGroup(PnlExamenFisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblEstado)
                    .addComponent(TxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlExamenFisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTemperatura)
                    .addComponent(TxtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlExamenFisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblFrecuencia)
                    .addComponent(TxtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlExamenFisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblFechaExamen)
                    .addComponent(TxtFechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlExamenFisico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PnlSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlReceta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlExamenFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmVerDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVerDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVerDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVerDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVerDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblDescripcion;
    private javax.swing.JLabel LblEstado;
    private javax.swing.JLabel LblExamenFisico;
    private javax.swing.JLabel LblFechaExamen;
    private javax.swing.JLabel LblFrecuencia;
    private javax.swing.JLabel LblReceta;
    private javax.swing.JLabel LblResultado;
    private javax.swing.JLabel LblSintomas;
    private javax.swing.JLabel LblTemperatura;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PnlDiagnostico;
    private javax.swing.JPanel PnlExamenFisico;
    private javax.swing.JPanel PnlReceta;
    private javax.swing.JPanel PnlSintomas;
    private javax.swing.JPanel PnlTitulo;
    private javax.swing.JTable TblReceta;
    private javax.swing.JTable TblSintomas;
    private javax.swing.JTextArea TxtAreaDescripcion;
    private javax.swing.JTextField TxtEstado;
    private javax.swing.JTextField TxtFechaExamen;
    private javax.swing.JTextField TxtFrecuencia;
    private javax.swing.JTextField TxtResultado;
    private javax.swing.JTextField TxtTemperatura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}