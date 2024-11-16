package controladorVetZoo;

import general.Sistema;
import general.Utilidades;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modeloControlMedico.ControlMedico;
import modeloDiagnostico.Diagnostico;
import modeloExamenFisico.ExamenFisico;
import modeloMedicamento.Medicamento;
import modeloSintoma.Sintoma;
import vista.frmModCtrlMedicos;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorModCtrlMed {

    private frmModCtrlMedicos vistaModCtrlMedicos;

    public ControladorModCtrlMed(ControlMedico ctrlMedicoSel, JTable tablaControlesMedicos) {
        vistaModCtrlMedicos = new frmModCtrlMedicos();

        vistaModCtrlMedicos.TxtAnimal.setText(ctrlMedicoSel.getNombreAnimal());

        vistaModCtrlMedicos.ChbReceta.setEnabled(false);
        vistaModCtrlMedicos.ChbSintoma.setEnabled(false);
        vistaModCtrlMedicos.ChbDiagnostico.setEnabled(false);
        
        if (ctrlMedicoSel.getInformeMedico() != null) {
            vistaModCtrlMedicos.TxtPeso.setText(String.valueOf(ctrlMedicoSel.getInformeMedico().getPeso()));
            vistaModCtrlMedicos.TxtTalla.setText(String.valueOf(ctrlMedicoSel.getInformeMedico().getAltura()));
            vistaModCtrlMedicos.TxtAreaObservaciones.setText(String.valueOf(ctrlMedicoSel.getInformeMedico().getObservaciones()));
        }

        if (ctrlMedicoSel.getDiagnostico() != null) {
            vistaModCtrlMedicos.ChbDiagnostico.setSelected(true);

            if (ctrlMedicoSel.getDiagnostico().getMedicamentos().obtenerArreglo() != null) {
                vistaModCtrlMedicos.ChbReceta.setSelected(true);
            }

            if (ctrlMedicoSel.getDiagnostico().getSintomas().obtenerArreglo() != null) {
                vistaModCtrlMedicos.ChbSintoma.setSelected(true);
            }

        }

        vistaModCtrlMedicos.BtnModificarDiagnostico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorModDiag ctrlSin = new ControladorModDiag(ctrlMedicoSel, vistaModCtrlMedicos.ChbDiagnostico, vistaModCtrlMedicos.ChbSintoma,
                        vistaModCtrlMedicos.ChbReceta);
                ctrlSin.run();

            }
        });

        vistaModCtrlMedicos.BtnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ACCIONES DE VALIDACION

                if (validarCamposModCtrlMedico()) {
                    ctrlMedicoSel.getInformeMedico().setPeso(Double.parseDouble(vistaModCtrlMedicos.TxtPeso.getText()));
                    ctrlMedicoSel.getInformeMedico().setAltura(Double.parseDouble(vistaModCtrlMedicos.TxtTalla.getText()));
                    ctrlMedicoSel.getInformeMedico().setObservaciones(vistaModCtrlMedicos.TxtAreaObservaciones.getText());

                    Utilidades.llenarTablaVerCtrlMed(tablaControlesMedicos);

                    vistaModCtrlMedicos.dispose();
                } else {
                    JOptionPane.showMessageDialog(vistaModCtrlMedicos, "Los datos ingresados no son validos");
                    limpiarCamposModCtrlMedico();
                }
            }
        });

    }

    public void run() {
        vistaModCtrlMedicos.setVisible(true);
    }

    public boolean validarCamposModCtrlMedico() {
        boolean esValido = true;

        // Obtener valores de los campos
        String pesoTexto = vistaModCtrlMedicos.TxtPeso.getText().trim();
        String alturaTexto = vistaModCtrlMedicos.TxtTalla.getText().trim();
        String observaciones = vistaModCtrlMedicos.TxtAreaObservaciones.getText().trim();

        // Validar Peso
        try {
            double peso = Double.parseDouble(pesoTexto);
            if (peso > 0) {
                vistaModCtrlMedicos.TxtPeso.setBackground(Color.WHITE);
            } else {
                vistaModCtrlMedicos.TxtPeso.setBackground(Color.RED);
                esValido = false;
            }
        } catch (NumberFormatException e) {
            vistaModCtrlMedicos.TxtPeso.setBackground(Color.RED);
            esValido = false;
        }

        // Validar Altura
        try {
            double altura = Double.parseDouble(alturaTexto);
            if (altura > 0) {
                vistaModCtrlMedicos.TxtTalla.setBackground(Color.WHITE);
            } else {
                vistaModCtrlMedicos.TxtTalla.setBackground(Color.RED);
                esValido = false;
            }
        } catch (NumberFormatException e) {
            vistaModCtrlMedicos.TxtTalla.setBackground(Color.RED);
            esValido = false;
        }

        // Validar Observaciones
        if (observaciones.isEmpty()) {
            vistaModCtrlMedicos.TxtAreaObservaciones.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaModCtrlMedicos.TxtAreaObservaciones.setBackground(Color.WHITE);
        }

        return esValido;
    }

    public void limpiarCamposModCtrlMedico() {

        vistaModCtrlMedicos.TxtPeso.setBackground(Color.WHITE);

        vistaModCtrlMedicos.TxtTalla.setBackground(Color.WHITE);

        vistaModCtrlMedicos.TxtAreaObservaciones.setBackground(Color.WHITE);
    }

}
