package controladorVetZoo;

import general.Sistema;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import modeloDiagnostico.Diagnostico;
import modeloExamenFisico.ExamenFisico;
import vista.frmRegDiagnostico;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorRegDiag {

    private frmRegDiagnostico vistaRegDiag;

    public ControladorRegDiag(JCheckBox chbDiag, JCheckBox chbSin, JCheckBox chbRec) {
        vistaRegDiag = new frmRegDiagnostico();

        if (Sistema.nuevoDiagnostico != null) {

            vistaRegDiag.TxtAreaDescripcion.setText(Sistema.nuevoDiagnostico.getDescripcion());
            vistaRegDiag.TxtResultado.setText(Sistema.nuevoDiagnostico.getResultado());

            if (Sistema.nuevoDiagnostico.getExamenFisico() != null) {
                vistaRegDiag.TxtAreaEstadoFisico.setText(Sistema.nuevoDiagnostico.getExamenFisico().getEstado());
                vistaRegDiag.TxtTemperatura.setText(Sistema.nuevoDiagnostico.getExamenFisico().getTemperaturaCorporal() + " C°");
                vistaRegDiag.TxtFrecuencia.setText(Sistema.nuevoDiagnostico.getExamenFisico().getFrecuenciaCardiaca() + " BPM");
            } else {
                System.out.println("el examen fisico es nulo");
            }
        }

        vistaRegDiag.BtnAddSintoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Sistema.nuevoDiagnostico != null) {
                    ControladorRegSin ctrlSin = new ControladorRegSin(chbSin, vistaRegDiag.ChbSintoma);
                    ctrlSin.run();
                } else {
                    JOptionPane.showMessageDialog(vistaRegDiag, "Debes registrar el diagnostico primero");
                }

            }
        });

        vistaRegDiag.BtnAddReceta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Sistema.nuevoDiagnostico != null) {
                    ControladorRegRec ctrlRec = new ControladorRegRec(chbRec, vistaRegDiag.ChbReceta);
                    ctrlRec.run();
                } else {
                    JOptionPane.showMessageDialog(vistaRegDiag, "Debes registrar el diagnostico primero");
                }
            }
        });

        vistaRegDiag.BtnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (validarCamposRegDiagnostico()) {
                    String descripcion = vistaRegDiag.TxtAreaDescripcion.getText().trim();
                    String resultado = vistaRegDiag.TxtResultado.getText().trim();
                    String estado = vistaRegDiag.TxtAreaEstadoFisico.getText().trim();
                    Double temperaturaCorporal = Double.valueOf(vistaRegDiag.TxtTemperatura.getText().trim());
                    Integer frecuenciaCardiaca = Integer.valueOf(vistaRegDiag.TxtFrecuencia.getText().trim());

                    if (Sistema.nuevoDiagnostico == null) {
                        Sistema.nuevoDiagnostico = new Diagnostico(descripcion, resultado);
                        Sistema.nuevoDiagnostico.registrarExamenFisico(estado, temperaturaCorporal, frecuenciaCardiaca, new Date());
                        chbDiag.setSelected(true);
                    } else {
                        Sistema.nuevoDiagnostico.setDescripcion(descripcion);
                        Sistema.nuevoDiagnostico.setResultado(resultado);
                        Sistema.nuevoDiagnostico.registrarExamenFisico(estado, temperaturaCorporal, frecuenciaCardiaca, new Date());
                    }
                } else {
                    JOptionPane.showMessageDialog(vistaRegDiag, "Los datos ingresados no son validos");
                    limpiarCamposRegDiagnostico();
                }

            }
        });

    }

    public void run() {
        vistaRegDiag.setVisible(true);
    }

    public boolean validarCamposRegDiagnostico() {
        boolean esValido = true;

        // Obtener valores de los campos
        String descripcion = vistaRegDiag.TxtAreaDescripcion.getText().trim();
        String resultado = vistaRegDiag.TxtResultado.getText().trim();
        String estado = vistaRegDiag.TxtAreaEstadoFisico.getText().trim();
        String temperaturaTexto = vistaRegDiag.TxtTemperatura.getText().trim();
        String frecuenciaTexto = vistaRegDiag.TxtFrecuencia.getText().trim();

        // Validar Descripción
        if (descripcion.isEmpty()) {
            vistaRegDiag.TxtAreaDescripcion.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaRegDiag.TxtAreaDescripcion.setBackground(Color.WHITE);
        }

        // Validar Resultado
        if (resultado.isEmpty()) {
            vistaRegDiag.TxtResultado.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaRegDiag.TxtResultado.setBackground(Color.WHITE);
        }

        // Validar Estado Físico
        if (estado.isEmpty()) {
            vistaRegDiag.TxtAreaEstadoFisico.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaRegDiag.TxtAreaEstadoFisico.setBackground(Color.WHITE);
        }

        // Validar Temperatura Corporal
        try {
            Double temperaturaCorporal = Double.valueOf(temperaturaTexto);
            vistaRegDiag.TxtTemperatura.setBackground(Color.WHITE);
        } catch (NumberFormatException e) {
            vistaRegDiag.TxtTemperatura.setBackground(Color.RED);
            esValido = false;
        }

        // Validar Frecuencia Cardíaca
        try {
            Integer frecuenciaCardiaca = Integer.valueOf(frecuenciaTexto);
            vistaRegDiag.TxtFrecuencia.setBackground(Color.WHITE);
        } catch (NumberFormatException e) {
            vistaRegDiag.TxtFrecuencia.setBackground(Color.RED);
            esValido = false;
        }

        return esValido;
    }

    public void limpiarCamposRegDiagnostico() {
        // Limpiar campo Descripción
        vistaRegDiag.TxtAreaDescripcion.setBackground(Color.WHITE);

        vistaRegDiag.TxtResultado.setBackground(Color.WHITE);


        vistaRegDiag.TxtAreaEstadoFisico.setBackground(Color.WHITE);

   
        vistaRegDiag.TxtTemperatura.setBackground(Color.WHITE);

 
        vistaRegDiag.TxtFrecuencia.setBackground(Color.WHITE);
    }

}
