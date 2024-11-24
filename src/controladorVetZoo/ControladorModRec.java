package controladorVetZoo;

import estilos.Fuente;
import general.Sistema;
import general.Utilidades;
import java.awt.Color;
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
        Fuente.inicializarFuentes("/estilos/resources/Adlam.ttf","/estilos/resources/Geologica.ttf",48f);
        Fuente.aplicarFuentesSelectivas(vistaModReceta.getContentPane());
        Utilidades.llenarTablaMedicamentos(vistaModReceta.TblMedicamentos, ctrlMedSel.getDiagnostico().getMedicamentos());

        vistaModReceta.BtnRegistrarMedicamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (validarCampos()) {
                    String nombre = vistaModReceta.TxtNombreFarmaco.getText().trim();
                    double cantidad = Double.parseDouble(vistaModReceta.TxtCantidad.getText().trim());
                    int intervaloHora = Integer.parseInt(vistaModReceta.TxtIntervaloHoras.getText().trim());
                    int dias = Integer.parseInt(vistaModReceta.TxtDias.getText().trim());

                    ctrlMedSel.getDiagnostico().registrarMedicamento(nombre, cantidad, intervaloHora, dias);

                    chbRec1.setSelected(true);
                    chbRec2.setSelected(true);

                    vistaModReceta.TxtNombreFarmaco.setText("");
                    vistaModReceta.TxtCantidad.setText("");
                    vistaModReceta.TxtIntervaloHoras.setText("");
                    vistaModReceta.TxtDias.setText("");

                    Utilidades.llenarTablaMedicamentos(vistaModReceta.TblMedicamentos, ctrlMedSel.getDiagnostico().getMedicamentos());

                } else {
                    JOptionPane.showMessageDialog(vistaModReceta, "Los datos ingresados no son validos");
                    limpiarCampos();
                }
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

    public boolean validarCampos() {
        boolean esValido = true;

        String nombre = vistaModReceta.TxtNombreFarmaco.getText().trim();
        if (nombre.isEmpty()) {
            vistaModReceta.TxtNombreFarmaco.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModReceta.TxtNombreFarmaco.setBackground(Color.WHITE);
        }

        String cantidadText = vistaModReceta.TxtCantidad.getText().trim();
        if (cantidadText.isEmpty() || !cantidadText.matches("^[0-9]*\\.?[0-9]+$")) {
            vistaModReceta.TxtCantidad.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModReceta.TxtCantidad.setBackground(Color.WHITE);
        }

        String intervaloHoraText = vistaModReceta.TxtIntervaloHoras.getText().trim();
        if (intervaloHoraText.isEmpty() || !intervaloHoraText.matches("^[0-9]+$")) {
            vistaModReceta.TxtIntervaloHoras.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModReceta.TxtIntervaloHoras.setBackground(Color.WHITE);
        }

        String diasText = vistaModReceta.TxtDias.getText().trim();
        if (diasText.isEmpty() || !diasText.matches("^[0-9]+$")) {
            vistaModReceta.TxtDias.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModReceta.TxtDias.setBackground(Color.WHITE);
        }

        return esValido;
    }

    public void limpiarCampos() {
        // Limpiar los JTextFields
        vistaModReceta.TxtNombreFarmaco.setText("");
        vistaModReceta.TxtCantidad.setText("");
        vistaModReceta.TxtIntervaloHoras.setText("");
        vistaModReceta.TxtDias.setText("");

        // Restaurar el color de fondo a blanco
        vistaModReceta.TxtNombreFarmaco.setBackground(Color.WHITE);
        vistaModReceta.TxtCantidad.setBackground(Color.WHITE);
        vistaModReceta.TxtIntervaloHoras.setBackground(Color.WHITE);
        vistaModReceta.TxtDias.setBackground(Color.WHITE);
    }

}
