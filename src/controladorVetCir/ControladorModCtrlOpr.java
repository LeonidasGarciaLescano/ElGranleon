package controladorVetCir;

import estilos.Fuente;
import general.Sistema;
import general.Utilidades;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modeloControlOperacion.ControlOperacion;
import vista.frmModCtrlOperaciones;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorModCtrlOpr {

    private frmModCtrlOperaciones vistaModCtrlOpr;

    public ControladorModCtrlOpr(ControlOperacion ctrlOprSel, JTable tablaControlOperaciones) {
        vistaModCtrlOpr = new frmModCtrlOperaciones();
        Fuente.inicializarFuentes("/estilos/resources/Adlam.ttf","/estilos/resources/Geologica.ttf",48f);
        Fuente.aplicarFuentesSelectivas(vistaModCtrlOpr.getContentPane());
        vistaModCtrlOpr.TxtAnimal.setText(ctrlOprSel.getNombreAnimal());
        vistaModCtrlOpr.TxtResultado.setText(ctrlOprSel.getResultado());
        vistaModCtrlOpr.TxtNombreOperacion.setText(ctrlOprSel.getNombreOperacion());
        vistaModCtrlOpr.TxtResultado.setText(ctrlOprSel.getResultado());
        vistaModCtrlOpr.TxtAreaDescripcion.setText(ctrlOprSel.getDescripcion());
        vistaModCtrlOpr.DateChFechaOperacion.setDate(ctrlOprSel.getFechaOperacion());
        vistaModCtrlOpr.TxtAreaAnotaciones.setText(ctrlOprSel.getAnotaciones());

        vistaModCtrlOpr.BtnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (validarCamposModOperacion()) {
                    String nombreOperacion = vistaModCtrlOpr.TxtNombreOperacion.getText().trim();
                    String resultado = vistaModCtrlOpr.TxtResultado.getText().trim();
                    String descripcion = vistaModCtrlOpr.TxtAreaDescripcion.getText().trim();
                    Date fechaOperacion = vistaModCtrlOpr.DateChFechaOperacion.getDate();
                    String anotaciones = vistaModCtrlOpr.TxtAreaAnotaciones.getText();

                    ctrlOprSel.modificarControlOperacion(nombreOperacion, resultado, descripcion, anotaciones, fechaOperacion);

                    Utilidades.llenarTablaVerCtrlOpr(tablaControlOperaciones);
                    
                    vistaModCtrlOpr.dispose();
                    
                } else {
                    JOptionPane.showMessageDialog(vistaModCtrlOpr, "Los datos ingresados no son validos");
                    limpiarCamposModOperacion();
                }

            }
        });

    }

    public void run() {
        vistaModCtrlOpr.setVisible(true);
    }

    public boolean validarCamposModOperacion() {
        boolean esValido = true;

        // Obtener valores de los campos
        String nombreOperacion = vistaModCtrlOpr.TxtNombreOperacion.getText().trim();
        String resultado = vistaModCtrlOpr.TxtResultado.getText().trim();
        String descripcion = vistaModCtrlOpr.TxtAreaDescripcion.getText().trim();
        Date fechaOperacion = vistaModCtrlOpr.DateChFechaOperacion.getDate();
        String anotaciones = vistaModCtrlOpr.TxtAreaAnotaciones.getText().trim();

        // Validar Nombre de Operación
        if (nombreOperacion.isEmpty()) {
            vistaModCtrlOpr.TxtNombreOperacion.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModCtrlOpr.TxtNombreOperacion.setBackground(Color.WHITE);
        }

        // Validar Resultado
        if (resultado.isEmpty()) {
            vistaModCtrlOpr.TxtResultado.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModCtrlOpr.TxtResultado.setBackground(Color.WHITE);
        }

        // Validar Descripción
        if (descripcion.isEmpty()) {
            vistaModCtrlOpr.TxtAreaDescripcion.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModCtrlOpr.TxtAreaDescripcion.setBackground(Color.WHITE);
        }

        // Validar Fecha de Operación
        if (fechaOperacion == null) {
            vistaModCtrlOpr.DateChFechaOperacion.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModCtrlOpr.DateChFechaOperacion.setBackground(Color.WHITE);
        }

        // Validar Anotaciones
        if (anotaciones.isEmpty()) {
            vistaModCtrlOpr.TxtAreaAnotaciones.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModCtrlOpr.TxtAreaAnotaciones.setBackground(Color.WHITE);
        }

        return esValido;
    }

    public void limpiarCamposModOperacion() {
        // Limpiar campo de texto Nombre de Operación
        vistaModCtrlOpr.TxtNombreOperacion.setBackground(Color.WHITE);

        // Limpiar campo de texto Resultado
        vistaModCtrlOpr.TxtResultado.setBackground(Color.WHITE);

        // Limpiar área de texto Descripción
        vistaModCtrlOpr.TxtAreaDescripcion.setBackground(Color.WHITE);

        // Limpiar selector de fecha
        vistaModCtrlOpr.DateChFechaOperacion.setBackground(Color.WHITE);

        // Limpiar área de texto Anotaciones
        vistaModCtrlOpr.TxtAreaAnotaciones.setBackground(Color.WHITE);
    }

}
