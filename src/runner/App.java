package runner;

import controladorInicio.ControladorInicioSesion;
import general.Config;

/**
 * @author Leonidas Garcia Lescano
 */
public class App {

    public static void main(String[] args) {

        Config confi = new Config();

        ControladorInicioSesion ctrlInicio = new ControladorInicioSesion();
        ctrlInicio.run();

    }

}
