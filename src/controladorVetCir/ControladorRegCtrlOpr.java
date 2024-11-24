package controladorVetCir;

import estilos.Fuente;
import general.Sistema;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import modeloAnimal.Animal;
import modeloControlMedico.ControlMedico;
import modeloDiagnostico.Diagnostico;
import modeloExamenFisico.ExamenFisico;
import modeloMedicamento.Medicamento;
import modeloSintoma.Sintoma;
import vista.frmRegCtrlOperacion;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorRegCtrlOpr {

    private frmRegCtrlOperacion vistaCtrlOpr;

    public ControladorRegCtrlOpr(Animal animalSel) {
        vistaCtrlOpr = new frmRegCtrlOperacion();
        Fuente.inicializarFuentes("/estilos/resources/Adlam.ttf","/estilos/resources/Geologica.ttf",48f);
        Fuente.aplicarFuentesSelectivas(vistaCtrlOpr.getContentPane());
        vistaCtrlOpr.TxtAnimal.setText(animalSel.getNombre());

        vistaCtrlOpr.BtnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (validarDatosOperacion()) {
                    String nombreOpr = vistaCtrlOpr.TxtNombreOperacion.getText().trim();
                    String resultado = vistaCtrlOpr.TxtResultado.getText().trim();
                    String descripcion = vistaCtrlOpr.TxtAreaDescripcion.getText().trim();
                    Date fechaOperacion = vistaCtrlOpr.DateChFechaOperacion.getDate();
                    String anotaciones = vistaCtrlOpr.TxtAreaDescripcion.getText().trim();

                    animalSel.getHistoriaMedica().registrarControlOperaciones(Sistema.veterinarioSesion, animalSel.getNombre(), resultado, nombreOpr, resultado, descripcion, anotaciones, nombreOpr, fechaOperacion);

                    Sistema.veterinarioSesion.registrarHistoriaMedica(animalSel.getHistoriaMedica());

                    JOptionPane.showMessageDialog(vistaCtrlOpr, "Control de operacion registrado correctamente");

                    vistaCtrlOpr.dispose();
                } else {
                    JOptionPane.showMessageDialog(vistaCtrlOpr, "Los datos ingresados no son validos");
                    limpiarCamposOperacion();
                }

            }
        });

    }

    public void run() {
        vistaCtrlOpr.setVisible(true);
    }

    public boolean validarDatosOperacion() {
        boolean esValido = true;

        // Obtener valores de los campos
        String nombreOpr = vistaCtrlOpr.TxtNombreOperacion.getText().trim();
        String resultado = vistaCtrlOpr.TxtResultado.getText().trim();
        String descripcion = vistaCtrlOpr.TxtAreaDescripcion.getText().trim();
        Date fechaOperacion = vistaCtrlOpr.DateChFechaOperacion.getDate();
        String anotaciones = vistaCtrlOpr.TxtAreaAnotaciones.getText().trim();

        // Validar Nombre de Operación
        if (nombreOpr.isEmpty()) {
            vistaCtrlOpr.TxtNombreOperacion.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaCtrlOpr.TxtNombreOperacion.setBackground(Color.WHITE);
        }

        // Validar Resultado
        if (resultado.isEmpty()) {
            vistaCtrlOpr.TxtResultado.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaCtrlOpr.TxtResultado.setBackground(Color.WHITE);
        }

        // Validar Descripción
        if (descripcion.isEmpty()) {
            vistaCtrlOpr.TxtAreaDescripcion.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaCtrlOpr.TxtAreaDescripcion.setBackground(Color.WHITE);
        }

        // Validar Fecha de Operación
        if (fechaOperacion == null) {
            vistaCtrlOpr.DateChFechaOperacion.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaCtrlOpr.DateChFechaOperacion.setBackground(Color.WHITE);
        }

        // Validar Anotaciones
        if (anotaciones.isEmpty()) {
            vistaCtrlOpr.TxtAreaAnotaciones.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaCtrlOpr.TxtAreaAnotaciones.setBackground(Color.WHITE);
        }

        return esValido;
    }

    public void limpiarCamposOperacion() {
        vistaCtrlOpr.TxtNombreOperacion.setBackground(Color.WHITE);

        vistaCtrlOpr.TxtResultado.setBackground(Color.WHITE);

        vistaCtrlOpr.TxtAreaDescripcion.setBackground(Color.WHITE);

        vistaCtrlOpr.DateChFechaOperacion.setBackground(Color.WHITE);

        vistaCtrlOpr.TxtAreaAnotaciones.setBackground(Color.WHITE);
    }
}
