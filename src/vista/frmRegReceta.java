/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class frmRegReceta extends javax.swing.JFrame {

    /**
     * Creates new form frmRegReceta
     */
    public frmRegReceta() {
        initComponents();
        getContentPane().setBackground(new Color(114, 187, 83));
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

        PnlTitulo = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        PnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblMedicamentos = new javax.swing.JTable();
        PnlNuevoMedicamento = new javax.swing.JPanel();
        LblNuevoMedicamento = new javax.swing.JLabel();
        LblCantidad = new javax.swing.JLabel();
        LblIntervaloHoras = new javax.swing.JLabel();
        LblNombreFarmaco = new javax.swing.JLabel();
        LblDias = new javax.swing.JLabel();
        TxtIntervaloHoras = new javax.swing.JTextField();
        TxtNombreFarmaco = new javax.swing.JTextField();
        BtnRegistrarMedicamento = new javax.swing.JToggleButton();
        TxtDias = new javax.swing.JTextField();
        TxtCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PnlTitulo.setBackground(new java.awt.Color(241, 246, 190));
        PnlTitulo.setPreferredSize(new java.awt.Dimension(569, 100));

        LblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(114, 187, 83));
        LblTitulo.setText("Registrar Receta");

        javax.swing.GroupLayout PnlTituloLayout = new javax.swing.GroupLayout(PnlTitulo);
        PnlTitulo.setLayout(PnlTituloLayout);
        PnlTituloLayout.setHorizontalGroup(
            PnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTituloLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(LblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlTituloLayout.setVerticalGroup(
            PnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTituloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LblTitulo)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        PnlTabla.setBackground(new java.awt.Color(241, 246, 190));
        PnlTabla.setPreferredSize(new java.awt.Dimension(700, 210));

        TblMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TblMedicamentos);

        javax.swing.GroupLayout PnlTablaLayout = new javax.swing.GroupLayout(PnlTabla);
        PnlTabla.setLayout(PnlTablaLayout);
        PnlTablaLayout.setHorizontalGroup(
            PnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        PnlTablaLayout.setVerticalGroup(
            PnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTablaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        PnlNuevoMedicamento.setBackground(new java.awt.Color(241, 246, 190));
        PnlNuevoMedicamento.setPreferredSize(new java.awt.Dimension(700, 206));

        LblNuevoMedicamento.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LblNuevoMedicamento.setForeground(new java.awt.Color(114, 187, 83));
        LblNuevoMedicamento.setText("Nuevo medicamento:");

        LblCantidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblCantidad.setText("Cantidad:");

        LblIntervaloHoras.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblIntervaloHoras.setText("Intervalo de horas:");

        LblNombreFarmaco.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblNombreFarmaco.setText("Nombre del farmaco:");

        LblDias.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LblDias.setText("Dias:");

        TxtIntervaloHoras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        TxtNombreFarmaco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        BtnRegistrarMedicamento.setBackground(new java.awt.Color(93, 109, 126));
        BtnRegistrarMedicamento.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        BtnRegistrarMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistrarMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estilos/static/icon_pill.png"))); // NOI18N
        BtnRegistrarMedicamento.setText("Registrar medicamento");

        TxtDias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        TxtCantidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout PnlNuevoMedicamentoLayout = new javax.swing.GroupLayout(PnlNuevoMedicamento);
        PnlNuevoMedicamento.setLayout(PnlNuevoMedicamentoLayout);
        PnlNuevoMedicamentoLayout.setHorizontalGroup(
            PnlNuevoMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNuevoMedicamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlNuevoMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlNuevoMedicamentoLayout.createSequentialGroup()
                        .addGroup(PnlNuevoMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlNuevoMedicamentoLayout.createSequentialGroup()
                                .addComponent(LblNombreFarmaco)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PnlNuevoMedicamentoLayout.createSequentialGroup()
                                .addComponent(LblCantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                            .addComponent(TxtNombreFarmaco))
                        .addGap(66, 66, 66)
                        .addGroup(PnlNuevoMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtIntervaloHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblIntervaloHoras)
                            .addGroup(PnlNuevoMedicamentoLayout.createSequentialGroup()
                                .addComponent(LblDias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtDias))))
                    .addComponent(LblNuevoMedicamento))
                .addContainerGap())
            .addGroup(PnlNuevoMedicamentoLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(BtnRegistrarMedicamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlNuevoMedicamentoLayout.setVerticalGroup(
            PnlNuevoMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlNuevoMedicamentoLayout.createSequentialGroup()
                .addComponent(LblNuevoMedicamento)
                .addGap(18, 18, 18)
                .addGroup(PnlNuevoMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNombreFarmaco)
                    .addComponent(LblIntervaloHoras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlNuevoMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombreFarmaco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIntervaloHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlNuevoMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblDias, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlNuevoMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblCantidad)
                        .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(BtnRegistrarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(PnlNuevoMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlNuevoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
            java.util.logging.Logger.getLogger(frmRegReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegReceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegReceta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton BtnRegistrarMedicamento;
    private javax.swing.JLabel LblCantidad;
    private javax.swing.JLabel LblDias;
    private javax.swing.JLabel LblIntervaloHoras;
    private javax.swing.JLabel LblNombreFarmaco;
    private javax.swing.JLabel LblNuevoMedicamento;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PnlNuevoMedicamento;
    private javax.swing.JPanel PnlTabla;
    private javax.swing.JPanel PnlTitulo;
    public javax.swing.JTable TblMedicamentos;
    public javax.swing.JTextField TxtCantidad;
    public javax.swing.JTextField TxtDias;
    public javax.swing.JTextField TxtIntervaloHoras;
    public javax.swing.JTextField TxtNombreFarmaco;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
