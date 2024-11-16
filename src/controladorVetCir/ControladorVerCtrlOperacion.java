package controladorVetCir;

import modeloControlOperacion.ControlOperacion;
import vista.frmVerCtrlOperacion;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorVerCtrlOperacion {

    private frmVerCtrlOperacion vistaCtrlOpr;

    public ControladorVerCtrlOperacion(ControlOperacion ctrlOprSel) {

        vistaCtrlOpr = new frmVerCtrlOperacion();

        vistaCtrlOpr.TxtResultado.setText(ctrlOprSel.getResultado());
        vistaCtrlOpr.TADescripcion.setText(ctrlOprSel.getDescripcion());
        vistaCtrlOpr.TxtVeterinario.setText(ctrlOprSel.getVeterinario().getNombres());
        vistaCtrlOpr.DateChFechaOperacion.setDate(ctrlOprSel.getFechaOperacion());
        vistaCtrlOpr.DateChFechaRegistro.setDate(ctrlOprSel.getFechaRegistro());
        vistaCtrlOpr.DateChFechaUltimaMod.setDate(ctrlOprSel.getFechaUltimaMod());
        vistaCtrlOpr.TxtNombreOperacion.setText(ctrlOprSel.getNombreOperacion());
        vistaCtrlOpr.TAAnotaciones.setText(ctrlOprSel.getAnotaciones());

    }

    public void run() {
        vistaCtrlOpr.setVisible(true);
    }

}
