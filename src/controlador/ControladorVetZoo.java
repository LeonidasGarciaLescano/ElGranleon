package controlador;

import modelo.Area;
import modelo.VeterinarioZoologico;
import vista.frmMenuCtrlMedico;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorVetZoo {

    VeterinarioZoologico veterinarioZoologico;
    Area area;
    frmMenuCtrlMedico vistaZoo;

    public ControladorVetZoo(VeterinarioZoologico veterinarioZoologico, Area area) {
        this.veterinarioZoologico = veterinarioZoologico;
        this.area = area;
        vistaZoo = new frmMenuCtrlMedico();
    }

    public void run () {
        vistaZoo.setVisible(true);
    }
    
}
