package controladorVetZoo;

import general.Sistema;
import general.Utilidades;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import modeloControlMedico.ControlMedico;
import vista.frmModSintomas;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorModSin {

    private frmModSintomas vistaModSintomas;

    public ControladorModSin(ControlMedico ctrlMedSel, JCheckBox chbSin1, JCheckBox chbSin2) {

        vistaModSintomas = new frmModSintomas();

        Utilidades.llenarTablaSintomas(vistaModSintomas.TblSintoma, ctrlMedSel.getDiagnostico().getSintomas());

        vistaModSintomas.BtnRegistrarSintoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (validarCamposSintomas()) {
                    String nombreSintoma = vistaModSintomas.TxtNombreSintoma.getText().trim();
                    String gravedad = vistaModSintomas.TxtGravedad.getText().trim();

                    ctrlMedSel.getDiagnostico().registrarSintoma(nombreSintoma, gravedad);

                    chbSin1.setSelected(true);
                    chbSin2.setSelected(true);

                    vistaModSintomas.TxtNombreSintoma.setText("");
                    vistaModSintomas.TxtGravedad.setText("");

                    Utilidades.llenarTablaSintomas(vistaModSintomas.TblSintoma, ctrlMedSel.getDiagnostico().getSintomas());
                } else {
                    JOptionPane.showMessageDialog(vistaModSintomas, "Los datos ingresados no son validos");
                    limpiarCamposSintomas();
                }

            }
        });

        vistaModSintomas.TblSintoma.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = vistaModSintomas.TblSintoma.rowAtPoint(evt.getPoint());

                if (row >= 0) {

                    int opcion = JOptionPane.showConfirmDialog(vistaModSintomas, "¿Quieres eliminar el sintoma?");

                    if (opcion == JOptionPane.YES_OPTION) {
                        String nombreSintoma = String.valueOf(vistaModSintomas.TblSintoma.getValueAt(row, 0));

                        ctrlMedSel.getDiagnostico().eliminarSintoma(nombreSintoma);

                        if (ctrlMedSel.getDiagnostico().getSintomas().obtenerArreglo() == null) {
                            chbSin1.setSelected(false);
                            chbSin2.setSelected(false);
                        }

                        Utilidades.llenarTablaSintomas(vistaModSintomas.TblSintoma, ctrlMedSel.getDiagnostico().getSintomas());
                    }

                }
            }
        });

    }

    public void run() {
        vistaModSintomas.setVisible(true);
    }

    public boolean validarCamposSintomas() {
        boolean esValido = true;

        String nombreSintoma = vistaModSintomas.TxtNombreSintoma.getText().trim();
        if (nombreSintoma.isEmpty()) {
            vistaModSintomas.TxtNombreSintoma.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModSintomas.TxtNombreSintoma.setBackground(Color.WHITE);
        }

        String gravedad = vistaModSintomas.TxtGravedad.getText().trim();
        if (gravedad.isEmpty()) {
            vistaModSintomas.TxtGravedad.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModSintomas.TxtGravedad.setBackground(Color.WHITE);
        }

        return esValido;
    }

    public void limpiarCamposSintomas() {

        vistaModSintomas.TxtNombreSintoma.setText("");
        vistaModSintomas.TxtGravedad.setText("");

        vistaModSintomas.TxtNombreSintoma.setBackground(Color.WHITE);
        vistaModSintomas.TxtGravedad.setBackground(Color.WHITE);
    }

}
