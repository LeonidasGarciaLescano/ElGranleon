package controladorVetZoo;

import general.Sistema;
import general.Utilidades;
import modeloControlMedico.ControlMedico;
import modeloHistoriaMedica.HistoriaMedica;
import vista.frmVerCtrlMedicos;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorVerModCtrlMedico {

    private frmVerCtrlMedicos vistaCtrlMedicos;

    public ControladorVerModCtrlMedico() {
        vistaCtrlMedicos = new frmVerCtrlMedicos();

        Utilidades.llenarTablaVerCtrlMed(vistaCtrlMedicos.TblControlMedicos);

        vistaCtrlMedicos.TblControlMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = vistaCtrlMedicos.TblControlMedicos.rowAtPoint(evt.getPoint());

                if (row >= 0) {

                    Integer idCtrlMedico = Integer.parseInt(vistaCtrlMedicos.TblControlMedicos.getValueAt(row, 0).toString());

                    ControlMedico ctrlMedSel = null;

                    for (HistoriaMedica hist : Sistema.veterinarioSesion.getHistoriasMedicas().obtenerArreglo()) {
                        for (ControlMedico ctrlMed : hist.getControlesMedicos().obtenerArreglo()) {
                            if (ctrlMed.getIdCtrlMedico() == idCtrlMedico) {
                                ctrlMedSel = ctrlMed;
                                break;
                            }
                        }
                    }

                    if (ctrlMedSel != null) {
                        ControladorModCtrlMed ctrlModCtrlMed = new ControladorModCtrlMed(ctrlMedSel, vistaCtrlMedicos.TblControlMedicos);
                        ctrlModCtrlMed.run();
                    }

                }
            }
        });

    }

    public void run() {
        vistaCtrlMedicos.setVisible(true);
    }

}