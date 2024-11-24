package controladorVetZoo;

import estilos.Fuente;
import general.Sistema;
import general.Utilidades;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.tools.Diagnostic;
import modeloMedicamento.ArregloMedicamento;
import modeloDiagnostico.Diagnostico;
import vista.frmRegReceta;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorRegRec {

    private frmRegReceta vistaRegRec;

    public ControladorRegRec(JCheckBox chbRec1, JCheckBox chbRec2) {

        vistaRegRec = new frmRegReceta();
        Fuente.inicializarFuentes("/estilos/resources/Adlam.ttf","/estilos/resources/Geologica.ttf",48f);
        Fuente.aplicarFuentesSelectivas(vistaRegRec.getContentPane());
        Utilidades.llenarTablaMedicamentos(vistaRegRec.TblMedicamentos, Sistema.nuevoDiagnostico.getMedicamentos());

        vistaRegRec.BtnRegistrarMedicamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (validarCamposRegReceta()) {
                    String nombre = vistaRegRec.TxtNombreFarmaco.getText().trim();
                    double cantidad = Double.parseDouble(vistaRegRec.TxtCantidad.getText().trim());
                    int intervaloHora = Integer.parseInt(vistaRegRec.TxtIntervaloHoras.getText().trim());
                    int dias = Integer.parseInt(vistaRegRec.TxtDias.getText().trim());

                    Sistema.nuevoDiagnostico.registrarMedicamento(nombre, cantidad, intervaloHora, dias);

                    chbRec1.setSelected(true);
                    chbRec2.setSelected(true);

                    vistaRegRec.TxtNombreFarmaco.setText("");
                    vistaRegRec.TxtCantidad.setText("");
                    vistaRegRec.TxtIntervaloHoras.setText("");
                    vistaRegRec.TxtDias.setText("");

                    Utilidades.llenarTablaMedicamentos(vistaRegRec.TblMedicamentos, Sistema.nuevoDiagnostico.getMedicamentos());
                } else {
                    JOptionPane.showMessageDialog(vistaRegRec, "Los datos ingresados no son validos");
                    limpiarCamposRegReceta();
                }

            }
        });

        vistaRegRec.TblMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = vistaRegRec.TblMedicamentos.rowAtPoint(evt.getPoint());

                if (row >= 0) {

                    int opcion = JOptionPane.showConfirmDialog(vistaRegRec, "¿Quieres eliminar el medicamento?");

                    if (opcion == JOptionPane.YES_OPTION) {
                        String nombreMedicamento = String.valueOf(vistaRegRec.TblMedicamentos.getValueAt(row, 0));

                        Sistema.nuevoDiagnostico.eliminarMedicamento(nombreMedicamento);

                        if (Sistema.nuevoDiagnostico.getMedicamentos().obtenerArreglo() == null) {
                            chbRec1.setSelected(false);
                            chbRec2.setSelected(false);
                        }

                        Utilidades.llenarTablaMedicamentos(vistaRegRec.TblMedicamentos, Sistema.nuevoDiagnostico.getMedicamentos());

                    }

                }
            }
        });

    }

    public void run() {
        vistaRegRec.setVisible(true);
    }

    public boolean validarCamposRegReceta() {
        boolean esValido = true;

        // Obtener valores de los campos
        String nombre = vistaRegRec.TxtNombreFarmaco.getText().trim();
        String cantidadTexto = vistaRegRec.TxtCantidad.getText().trim();
        String intervaloHoraTexto = vistaRegRec.TxtIntervaloHoras.getText().trim();
        String diasTexto = vistaRegRec.TxtDias.getText().trim();

        // Validar Nombre del Fármaco
        if (nombre.isEmpty()) {
            vistaRegRec.TxtNombreFarmaco.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaRegRec.TxtNombreFarmaco.setBackground(Color.WHITE);
        }

        // Validar Cantidad
        try {
            double cantidad = Double.parseDouble(cantidadTexto);
            vistaRegRec.TxtCantidad.setBackground(Color.WHITE);
        } catch (NumberFormatException e) {
            vistaRegRec.TxtCantidad.setBackground(Color.RED);
            esValido = false;
        }

        // Validar Intervalo de Horas
        try {
            int intervaloHora = Integer.parseInt(intervaloHoraTexto);
            vistaRegRec.TxtIntervaloHoras.setBackground(Color.WHITE);
        } catch (NumberFormatException e) {
            vistaRegRec.TxtIntervaloHoras.setBackground(Color.RED);
            esValido = false;
        }

        // Validar Días
        try {
            int dias = Integer.parseInt(diasTexto);
            vistaRegRec.TxtDias.setBackground(Color.WHITE);
        } catch (NumberFormatException e) {
            vistaRegRec.TxtDias.setBackground(Color.RED);
            esValido = false;
        }

        return esValido;
    }

    public void limpiarCamposRegReceta() {

        vistaRegRec.TxtNombreFarmaco.setBackground(Color.WHITE);

        vistaRegRec.TxtCantidad.setBackground(Color.WHITE);

        vistaRegRec.TxtIntervaloHoras.setBackground(Color.WHITE);

        vistaRegRec.TxtDias.setBackground(Color.WHITE);
    }

}
