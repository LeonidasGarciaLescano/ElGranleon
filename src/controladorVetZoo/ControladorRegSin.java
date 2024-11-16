package controladorVetZoo;

import general.Sistema;
import general.Utilidades;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import modeloDiagnostico.Diagnostico;
import vista.frmRegReceta;
import vista.frmRegSintomas;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorRegSin {

    private frmRegSintomas vistaRegSin;

    public ControladorRegSin(JCheckBox chbSin1, JCheckBox chbSin2) {

        vistaRegSin = new frmRegSintomas();

        Utilidades.llenarTablaSintomas(vistaRegSin.TblSintoma, Sistema.nuevoDiagnostico.getSintomas());

        vistaRegSin.BtnRegistrarSintoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (validarCamposRegSintoma()) {
                    String nombreSintoma = vistaRegSin.TxtNombreSintoma.getText().trim();
                    String gravedad = vistaRegSin.TxtGravedad.getText().trim();

                    Sistema.nuevoDiagnostico.registrarSintoma(nombreSintoma, gravedad);

                    chbSin1.setSelected(true);
                    chbSin2.setSelected(true);

                    Utilidades.llenarTablaSintomas(vistaRegSin.TblSintoma, Sistema.nuevoDiagnostico.getSintomas());
                } else {
                    JOptionPane.showMessageDialog(vistaRegSin, "Los datos ingresados no son validos");
                    limpiarCamposRegSintoma();
                }

            }
        });

        vistaRegSin.TblSintoma.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = vistaRegSin.TblSintoma.rowAtPoint(evt.getPoint());

                if (row >= 0) {

                    int opcion = JOptionPane.showConfirmDialog(vistaRegSin, "¿Quieres eliminar el sintoma?");

                    if (opcion == JOptionPane.YES_OPTION) {
                        String nombreSintoma = String.valueOf(vistaRegSin.TblSintoma.getValueAt(row, 0));

                        Sistema.nuevoDiagnostico.eliminarSintoma(nombreSintoma);

                        if (Sistema.nuevoDiagnostico.getSintomas().obtenerArreglo() == null) {
                            chbSin1.setSelected(false);
                            chbSin2.setSelected(false);
                        }

                        Utilidades.llenarTablaSintomas(vistaRegSin.TblSintoma, Sistema.nuevoDiagnostico.getSintomas());
                    }

                }
            }
        });

    }

    public void run() {
        vistaRegSin.setVisible(true);
    }

    public boolean validarCamposRegSintoma() {
        boolean esValido = true;

        // Obtener valores de los campos
        String nombreSintoma = vistaRegSin.TxtNombreSintoma.getText().trim();
        String gravedad = vistaRegSin.TxtGravedad.getText().trim();

        // Validar Nombre del Síntoma
        if (nombreSintoma.isEmpty()) {
            vistaRegSin.TxtNombreSintoma.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaRegSin.TxtNombreSintoma.setBackground(Color.WHITE);
        }

        // Validar Gravedad
        if (gravedad.isEmpty()) {
            vistaRegSin.TxtGravedad.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaRegSin.TxtGravedad.setBackground(Color.WHITE);
        }

        return esValido;
    }

    public void limpiarCamposRegSintoma() {
        // Limpiar campo Nombre del Síntoma
        vistaRegSin.TxtNombreSintoma.setText("");
        vistaRegSin.TxtNombreSintoma.setBackground(Color.WHITE);

        // Limpiar campo Gravedad
        vistaRegSin.TxtGravedad.setText("");
        vistaRegSin.TxtGravedad.setBackground(Color.WHITE);
    }

}
