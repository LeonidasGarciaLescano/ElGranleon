package controlador;

import modelo.Area;
import modelo.VeterinarioCirujano;
import vista.frmMenuCtrlOperacion;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorVetCir {

    VeterinarioCirujano veterinarioCirujano;
    Area area;
    frmMenuCtrlOperacion vistaCir;

    public ControladorVetCir(VeterinarioCirujano veterinarioCirujano, Area area) {
        this.veterinarioCirujano = veterinarioCirujano;
        this.area = area;
        vistaCir = new frmMenuCtrlOperacion();
    }

    public void run() {
        vistaCir.setVisible(true);
    }

}
