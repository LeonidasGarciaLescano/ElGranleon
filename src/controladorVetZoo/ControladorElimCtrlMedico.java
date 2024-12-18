package controladorVetZoo;

import estilos.Fuente;
import general.Sistema;
import general.Utilidades;
import javax.swing.JOptionPane;
import modeloControlMedico.ControlMedico;
import modeloHistoriaMedica.HistoriaMedica;
import vista.frmElimCtrlMedico;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorElimCtrlMedico {

    private frmElimCtrlMedico vistaElimCtrlMed;

    public ControladorElimCtrlMedico() {
        vistaElimCtrlMed = new frmElimCtrlMedico();
        Fuente.inicializarFuentes("/estilos/resources/Adlam.ttf", "/estilos/resources/Geologica.ttf", 48f);
        Fuente.aplicarFuentesSelectivas(vistaElimCtrlMed.getContentPane());
        Utilidades.llenarTablaVerCtrlMed(vistaElimCtrlMed.TblControlMedico);

        vistaElimCtrlMed.TblControlMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = vistaElimCtrlMed.TblControlMedico.rowAtPoint(evt.getPoint());

                if (row >= 0) {

                    int opcion = JOptionPane.showConfirmDialog(vistaElimCtrlMed, "¿Quieres eliminar este control médico?");

                    if (opcion == JOptionPane.YES_OPTION) {
                        Integer idCtrlMedico = Integer.valueOf(vistaElimCtrlMed.TblControlMedico.getValueAt(row, 0).toString());

                        for (HistoriaMedica hist : Sistema.veterinarioSesion.getHistoriasMedicas().obtenerArreglo()) {

                            if (hist.getControlesMedicos().obtenerArreglo() != null) {
                                boolean eliminado = false;

                                for (ControlMedico ctrlMed : hist.getControlesMedicos().obtenerArreglo()) {
                                    if (ctrlMed.getIdCtrlMedico() == idCtrlMedico) {

                                        hist.eliminarControlMedico(idCtrlMedico);

                                        if (hist.getControlesMedicos().obtenerArreglo() != null) {
                                            boolean aunTieneCtrolMed = false;

                                            for (ControlMedico ctrlMedDe : hist.getControlesMedicos().obtenerArreglo()) {
                                                if (ctrlMedDe.getVeterinario().getId().equals(Sistema.veterinarioSesion.getId())) {
                                                    aunTieneCtrolMed = true;
                                                    break;
                                                }
                                            }

                                            if (!aunTieneCtrolMed) {
                                                Sistema.veterinarioSesion.eliminarHistoriaMedica(hist.getIdHistoria());
                                            }
                                        } else {
                                            Sistema.veterinarioSesion.eliminarHistoriaMedica(hist.getIdHistoria());
                                        }

                                        eliminado = true;

                                        break;
                                    }

                                    if (eliminado) {
                                        break;
                                    }
                                }
                            }

                        }

                        Utilidades.llenarTablaVerCtrlMed(vistaElimCtrlMed.TblControlMedico);

                        JOptionPane.showMessageDialog(vistaElimCtrlMed, "Control médico eliminado correctamente");

                    }

                }

            }
        });

    }

    public void run() {
        vistaElimCtrlMed.setVisible(true);
    }

}
