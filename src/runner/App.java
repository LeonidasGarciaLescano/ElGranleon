package runner;

import controladorInicio.ControladorInicioSesion;
import general.Config;
import general.Sistema;
import libs.SerializadoraGEN;
import modeloControlMedico.ControlMedico;
import modeloControlOperacion.ControlOperacion;

/**
 * @author Leonidas Garcia Lescano
 */
public class App {

    public static void main(String[] args) {

        try {
            Sistema.areas = SerializadoraGEN.deserializarArregloArea();
            Sistema.contId = SerializadoraGEN.deserializarIdentificadores();

            ControlMedico.id = Sistema.contId.getIdCtrlMedico();
            ControlOperacion.id = Sistema.contId.getIdCtrlOpr();

        } catch (Exception e) {
            Config.cargarAreas();
            Config.cargarVeterinarios();
            Config.cargarAnimales();
        }

        ControladorInicioSesion ctrlInicio = new ControladorInicioSesion();
        ctrlInicio.run();

    }

}
