package controladorVetZoo;

import general.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modeloControlMedico.ControlMedico;
import modeloHistoriaMedica.HistoriaMedica;
import vista.frmVerCtrlMedico;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorVerCtrlMedico {

    private frmVerCtrlMedico vistaCtrlMedico;

    public ControladorVerCtrlMedico(ControlMedico ctrlMedSel) {
        vistaCtrlMedico = new frmVerCtrlMedico();

        System.out.println(ctrlMedSel);
        
        vistaCtrlMedico.TxtNombreAnimal.setText(ctrlMedSel.getNombreAnimal());
        vistaCtrlMedico.DateChFechaRegistro.setDate(ctrlMedSel.getFechaRegistro());
        vistaCtrlMedico.DateChFechaUltMod.setDate(ctrlMedSel.getFechaUltimaMod());
        
        if (ctrlMedSel.getInformeMedico() != null) {
            vistaCtrlMedico.TxtPeso.setText(String.valueOf(ctrlMedSel.getInformeMedico().getPeso()));
        vistaCtrlMedico.TxtTalla.setText(String.valueOf(ctrlMedSel.getInformeMedico().getAltura()));
        vistaCtrlMedico.TAObservaciones.setText(String.valueOf(ctrlMedSel.getInformeMedico().getObservaciones()));
        }
        

        vistaCtrlMedico.BtnVerDiagnostico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (ctrlMedSel.getDiagnostico() != null) {
                    ControladorVerDiagnostico ctrlVerDiag = new ControladorVerDiagnostico(ctrlMedSel.getDiagnostico());
                    ctrlVerDiag.run();
                } else {
                    JOptionPane.showMessageDialog(vistaCtrlMedico, "Este control medico parece no tener un diagnostico registrado");
                }

            }
        });

    }

    public void run() {
        vistaCtrlMedico.setVisible(true);
    }

}
