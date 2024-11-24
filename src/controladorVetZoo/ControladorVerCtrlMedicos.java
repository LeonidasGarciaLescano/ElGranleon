package controladorVetZoo;

import estilos.Fuente;
import general.Sistema;
import general.Utilidades;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modeloControlMedico.ControlMedico;
import modeloHistoriaMedica.HistoriaMedica;
import vista.frmVerCtrlMedicos;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorVerCtrlMedicos {

    private frmVerCtrlMedicos vistaCtrlMedicos;

    public ControladorVerCtrlMedicos() {
        vistaCtrlMedicos = new frmVerCtrlMedicos();
        Fuente.inicializarFuentes("/estilos/resources/Adlam.ttf","/estilos/resources/Geologica.ttf",48f);
        Fuente.aplicarFuentesSelectivas(vistaCtrlMedicos.getContentPane());
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
                        ControladorVerCtrlMedico ctrlVerCtrlMed = new ControladorVerCtrlMedico(ctrlMedSel);
                        ctrlVerCtrlMed.run();
                    }

                }
            }
        });

    }

    public void run() {
        vistaCtrlMedicos.setVisible(true);
    }

}
