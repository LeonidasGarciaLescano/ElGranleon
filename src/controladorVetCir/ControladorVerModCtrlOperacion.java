package controladorVetCir;

import general.Sistema;
import general.Utilidades;
import modeloControlOperacion.ControlOperacion;
import modeloHistoriaMedica.HistoriaMedica;
import vista.frmVerCtrlOperaciones;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorVerModCtrlOperacion {

    private frmVerCtrlOperaciones vistaVerCtrlOpr;

    public ControladorVerModCtrlOperacion() {
        vistaVerCtrlOpr = new frmVerCtrlOperaciones();

        Utilidades.llenarTablaVerCtrlOpr(vistaVerCtrlOpr.TblControlOperaciones);

        vistaVerCtrlOpr.TblControlOperaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = vistaVerCtrlOpr.TblControlOperaciones.rowAtPoint(evt.getPoint());

                if (row >= 0) {

                    Integer idCtrlOperacion = Integer.parseInt(vistaVerCtrlOpr.TblControlOperaciones.getValueAt(row, 0).toString());

                    ControlOperacion ctrlOprSel = null;

                    for (HistoriaMedica hist : Sistema.veterinarioSesion.getHistoriasMedicas().obtenerArreglo()) {
                        for (ControlOperacion ctrlOpr : hist.getControlesOperaciones().obtenerArreglo()) {
                            if (ctrlOpr.getIdCtrlOpr() == idCtrlOperacion) {
                                ctrlOprSel = ctrlOpr;
                                break;
                            }
                        }
                    }

                    if (ctrlOprSel != null) {
                        ControladorModCtrlOpr ctrlModCtrlOpr = new ControladorModCtrlOpr(ctrlOprSel, vistaVerCtrlOpr.TblControlOperaciones);
                        ctrlModCtrlOpr.run();
                    }

                }
            }
        });

    }

    public void run() {
        vistaVerCtrlOpr.setVisible(true);
    }

}
