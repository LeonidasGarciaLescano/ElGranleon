package runner;

import controladorInicio.ControladorInicioSesion;
import general.Config;
import general.Sistema;
import libs.SerializadoraGEN;

/**
 * @author Leonidas Garcia Lescano
 */
public class App {

    public static void main(String[] args) {

        try {
            Sistema.areas = SerializadoraGEN.deserializarArregloArea();
        } catch (Exception e) {
            Config.cargarAreas();
            Config.cargarVeterinarios();
            Config.cargarAnimales();
        }

        ControladorInicioSesion ctrlInicio = new ControladorInicioSesion();
        ctrlInicio.run();

    }

}
