package controladorVetCir;

import general.Sistema;
import general.Utilidades;
import modeloControlOperacion.ControlOperacion;
import modeloHistoriaMedica.HistoriaMedica;
import vista.frmVerCtrlOperaciones;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorVerCtrlOperaciones {

    private frmVerCtrlOperaciones vistaVerOperaciones;

    public ControladorVerCtrlOperaciones() {
        vistaVerOperaciones = new frmVerCtrlOperaciones();

        Utilidades.llenarTablaVerCtrlOpr(vistaVerOperaciones.TblControlOperaciones);

        vistaVerOperaciones.TblControlOperaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = vistaVerOperaciones.TblControlOperaciones.rowAtPoint(evt.getPoint());

                if (row >= 0) {

                    Integer idCtrlOperacion = Integer.parseInt(vistaVerOperaciones.TblControlOperaciones.getValueAt(row, 0).toString());

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
                        ControladorVerCtrlOperacion ctrlVerCtrlOpr = new ControladorVerCtrlOperacion(ctrlOprSel);
                        ctrlVerCtrlOpr.run();
                    }

                }
            }
        });

    }

    public void run() {
        vistaVerOperaciones.setVisible(true);
    }

}
