package controladorVetZoo;

import general.Sistema;
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

            }
        });

    }

    public void run() {
        vistaModDiag.setVisible(true);
    }

}
