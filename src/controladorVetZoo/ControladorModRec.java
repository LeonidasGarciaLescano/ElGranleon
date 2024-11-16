package controladorVetZoo;

import general.Sistema;
import general.Utilidades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import modeloControlMedico.ControlMedico;
import vista.frmModReceta;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorModRec {

    private frmModReceta vistaModReceta;

    public ControladorModRec(ControlMedico ctrlMedSel, JCheckBox chbRec1, JCheckBox chbRec2) {

        vistaModReceta = new frmModReceta();

        Utilidades.llenarTablaMedicamentos(vistaModReceta.TblMedicamentos, ctrlMedSel.getDiagnostico().getMedicamentos());

        vistaModReceta.BtnRegistrarMedicamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = vistaModReceta.TxtNombreFarmaco.getText().trim();
                double cantidad = Double.parseDouble(vistaModReceta.TxtCantidad.getText().trim());
                int intervaloHora = Integer.parseInt(vistaModReceta.TxtIntervaloHoras.getText().trim());
                int dias = Integer.parseInt(vistaModReceta.TxtDias.getText().trim());

                ctrlMedSel.getDiagnostico().registrarMedicamento(nombre, cantidad, intervaloHora, dias);

                chbRec1.setSelected(true);
                chbRec2.setSelected(true);

                Utilidades.llenarTablaMedicamentos(vistaModReceta.TblMedicamentos, ctrlMedSel.getDiagnostico().getMedicamentos());

            }
        });

        vistaModReceta.TblMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = vistaModReceta.TblMedicamentos.rowAtPoint(evt.getPoint());

                if (row >= 0) {

                    int opcion = JOptionPane.showConfirmDialog(vistaModReceta, "¿Quieres eliminar este medicamento?");

                    if (opcion == JOptionPane.YES_OPTION) {
                        String nombreMedicamento = String.valueOf(vistaModReceta.TblMedicamentos.getValueAt(row, 0));

                        ctrlMedSel.getDiagnostico().eliminarMedicamento(nombreMedicamento);

                        if (ctrlMedSel.getDiagnostico().getMedicamentos().obtenerArreglo() == null) {
                            chbRec1.setSelected(false);
                            chbRec2.setSelected(false);
                        }

                        Utilidades.llenarTablaMedicamentos(vistaModReceta.TblMedicamentos, ctrlMedSel.getDiagnostico().getMedicamentos());

                    }

                }
            }
        });

    }

    public void run() {
        vistaModReceta.setVisible(true);
    }

}
