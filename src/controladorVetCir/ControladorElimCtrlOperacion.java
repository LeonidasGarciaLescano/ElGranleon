package controladorVetCir;

import estilos.Fuente;
import general.Sistema;
import general.Utilidades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import modeloControlOperacion.ControlOperacion;
import modeloHistoriaMedica.HistoriaMedica;
import vista.frmElimCtrlOperacion;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorElimCtrlOperacion {

    private frmElimCtrlOperacion vistaElimCtrlOpr;

    public ControladorElimCtrlOperacion() {
        vistaElimCtrlOpr = new frmElimCtrlOperacion();
        Fuente.inicializarFuentes("/estilos/resources/Adlam.ttf","/estilos/resources/Geologica.ttf",48f);
        Fuente.aplicarFuentesSelectivas(vistaElimCtrlOpr.getContentPane());
        Utilidades.llenarTablaVerCtrlOpr(vistaElimCtrlOpr.TblControlOperacion);

        vistaElimCtrlOpr.TblControlOperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = vistaElimCtrlOpr.TblControlOperacion.rowAtPoint(evt.getPoint());

                if (row >= 0) {

                    int opcion = JOptionPane.showConfirmDialog(vistaElimCtrlOpr, "¿Quieres eliminar este control de operación?");

                    if (opcion == JOptionPane.YES_OPTION) {
                        Integer idCtrlOperacion = Integer.valueOf(vistaElimCtrlOpr.TblControlOperacion.getValueAt(row, 0).toString());

                        for (HistoriaMedica hist : Sistema.veterinarioSesion.getHistoriasMedicas().obtenerArreglo()) {
                            for (ControlOperacion ctrlOpr : hist.getControlesOperaciones().obtenerArreglo()) {
                                if (ctrlOpr.getIdCtrlOpr() == idCtrlOperacion) {
                                    hist.eliminarControlOperacion(idCtrlOperacion);

                                    if (hist.getControlesOperaciones().obtenerArreglo() != null) {
                                        boolean aunTieneCtrolOpr = false;

                                        for (ControlOperacion ctrlOprDe : hist.getControlesOperaciones().obtenerArreglo()) {
                                            if (ctrlOprDe.getVeterinario().getId().equals(Sistema.veterinarioSesion.getId())) {
                                                aunTieneCtrolOpr = true;
                                                break;
                                            }
                                        }

                                        if (!aunTieneCtrolOpr) {
                                            Sistema.veterinarioSesion.eliminarHistoriaMedica(hist.getId());
                                        }
                                    } else {
                                        Sistema.veterinarioSesion.eliminarHistoriaMedica(hist.getId());
                                    }

                                    break;
                                }
                            }
                        }

                        Utilidades.llenarTablaVerCtrlOpr(vistaElimCtrlOpr.TblControlOperacion);

                        JOptionPane.showMessageDialog(vistaElimCtrlOpr, "Control de operacion eliminado correctamente");

                    }

                }

            }
        });
    }

    public void run() {
        vistaElimCtrlOpr.setVisible(true);
    }

}
