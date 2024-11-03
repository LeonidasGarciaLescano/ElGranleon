package controlador;

import general.Sistema;
import general.Utilidades;
import modelo.Area;
import modelo.ArregloVeterinario;
import vista.frmGestVet;

/**
 * @author Leonidas Garcia Lescano
 */

public class ControladorGestVet {

    frmGestVet vistaGestion;
    Area[] areas;

    public ControladorGestVet() {
        vistaGestion = new frmGestVet();
        areas = Sistema.zoo.getAreaArreglo().getAreas();
        
        Object[][] data = Utilidades.generarDatosTablaVeterinarios(Sistema.veterinarios);
        Utilidades.llenarTabla(vistaGestion.TblVet, ArregloVeterinario.getCabecera(), data);
        
    }
    
    public void run() {
        vistaGestion.setVisible(true);
    }
    
}
