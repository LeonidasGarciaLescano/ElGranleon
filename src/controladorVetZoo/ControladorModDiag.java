package controladorVetZoo;

import general.Sistema;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import modeloControlMedico.ControlMedico;
import modeloDiagnostico.Diagnostico;
import vista.frmModDiagnostico;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorModDiag {

    private frmModDiagnostico vistaModDiag;

    public ControladorModDiag(ControlMedico ctrlMedSel, JCheckBox chbDiag, JCheckBox chbSin, JCheckBox chbRec) {
        vistaModDiag = new frmModDiagnostico();

        if (ctrlMedSel.getDiagnostico() != null) {
            vistaModDiag.TxtAreaDescripcion.setText(ctrlMedSel.getDiagnostico().getDescripcion());
            vistaModDiag.TxtResultado.setText(ctrlMedSel.getDiagnostico().getResultado());

            if (ctrlMedSel.getDiagnostico().getExamenFisico() != null) {
                vistaModDiag.TxtAreaEstadoFisico.setText(ctrlMedSel.getDiagnostico().getExamenFisico().getEstado());
                vistaModDiag.TxtTemperatura.setText(String.valueOf(ctrlMedSel.getDiagnostico().getExamenFisico().getTemperaturaCorporal()));
                vistaModDiag.TxtFrecuencia.setText(String.valueOf(ctrlMedSel.getDiagnostico().getExamenFisico().getFrecuenciaCardiaca()));
            }

            if (ctrlMedSel.getDiagnostico().getMedicamentos().obtenerArreglo() != null) {
                vistaModDiag.ChbReceta.setSelected(true);
            }

            if (ctrlMedSel.getDiagnostico().getSintomas().obtenerArreglo() != null) {
                vistaModDiag.ChbSintoma.setSelected(true);
            }

        }

        vistaModDiag.BtnModSintoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (ctrlMedSel.getDiagnostico() != null) {
                    ControladorModSin ctrlSin = new ControladorModSin(ctrlMedSel, chbSin, vistaModDiag.ChbSintoma);
                    ctrlSin.run();
                } else {
                    JOptionPane.showMessageDialog(vistaModDiag, "Debes registrar el diagnostico primero");
                }

            }
        });

        vistaModDiag.BtnModReceta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ctrlMedSel.getDiagnostico() != null) {
                    ControladorModRec ctrlRec = new ControladorModRec(ctrlMedSel, chbRec, vistaModDiag.ChbReceta);
                    ctrlRec.run();
                } else {
                    JOptionPane.showMessageDialog(vistaModDiag, "Debes registrar el diagnostico primero");
                }
            }
        });

        vistaModDiag.BtnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (validarCampos()) {
                    String descripcion = vistaModDiag.TxtAreaDescripcion.getText().trim();
                    String resultado = vistaModDiag.TxtResultado.getText().trim();
                    String estado = vistaModDiag.TxtAreaEstadoFisico.getText().trim();
                    Double temperaturaCorporal = Double.valueOf(vistaModDiag.TxtTemperatura.getText().trim());
                    Integer frecuenciaCardiaca = Integer.valueOf(vistaModDiag.TxtFrecuencia.getText().trim());

                    if (ctrlMedSel.getDiagnostico() != null) {
                        ctrlMedSel.getDiagnostico().modificarDiagnostico(descripcion, resultado);

                        if (ctrlMedSel.getDiagnostico().getExamenFisico() != null) {
                            ctrlMedSel.getDiagnostico().modificarExamenFisico(estado, temperaturaCorporal, frecuenciaCardiaca, new Date());
                        } else {
                            ctrlMedSel.getDiagnostico().registrarExamenFisico(estado, temperaturaCorporal, frecuenciaCardiaca, new Date());
                        }

                        chbDiag.setSelected(true);
                    } else {
                        ctrlMedSel.registrarDiagnostico(descripcion, resultado);

                        ctrlMedSel.getDiagnostico().registrarExamenFisico(estado, temperaturaCorporal, frecuenciaCardiaca, new Date());

                        chbDiag.setSelected(true);
                    }

                    JOptionPane.showMessageDialog(vistaModDiag, "Diagnostico registrado");
                } else {
                    JOptionPane.showMessageDialog(vistaModDiag, "Los datos ingresados no son validos");
                    limpiarCampos();
                }

            }
        });

    }

    public void run() {
        vistaModDiag.setVisible(true);
    }

    public boolean validarCampos() {
        boolean esValido = true;

        String descripcion = vistaModDiag.TxtAreaDescripcion.getText().trim();
        String resultado = vistaModDiag.TxtResultado.getText().trim();
        String estado = vistaModDiag.TxtAreaEstadoFisico.getText().trim();

        if (descripcion.isEmpty()) {
            vistaModDiag.TxtAreaDescripcion.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModDiag.TxtAreaDescripcion.setBackground(Color.WHITE);
        }

        if (resultado.isEmpty()) {
            vistaModDiag.TxtResultado.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModDiag.TxtResultado.setBackground(Color.WHITE);
        }

        if (estado.isEmpty()) {
            vistaModDiag.TxtAreaEstadoFisico.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModDiag.TxtAreaEstadoFisico.setBackground(Color.WHITE);
        }

        String tempText = vistaModDiag.TxtTemperatura.getText().trim();
        if (tempText.isEmpty() || !tempText.matches("^[0-9]*\\.?[0-9]+$")) {
            vistaModDiag.TxtTemperatura.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModDiag.TxtTemperatura.setBackground(Color.WHITE);
        }

        String frecuenciaText = vistaModDiag.TxtFrecuencia.getText().trim();
        if (frecuenciaText.isEmpty() || !frecuenciaText.matches("^[0-9]+$")) {
            vistaModDiag.TxtFrecuencia.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModDiag.TxtFrecuencia.setBackground(Color.WHITE);
        }

        return esValido;
    }

    public void limpiarCampos() {

        vistaModDiag.TxtAreaDescripcion.setText("");
        vistaModDiag.TxtResultado.setText("");
        vistaModDiag.TxtAreaEstadoFisico.setText("");
        vistaModDiag.TxtTemperatura.setText("");
        vistaModDiag.TxtFrecuencia.setText("");

        vistaModDiag.TxtAreaDescripcion.setBackground(Color.WHITE);
        vistaModDiag.TxtResultado.setBackground(Color.WHITE);
        vistaModDiag.TxtAreaEstadoFisico.setBackground(Color.WHITE);
        vistaModDiag.TxtTemperatura.setBackground(Color.WHITE);
        vistaModDiag.TxtFrecuencia.setBackground(Color.WHITE);
    }

}
