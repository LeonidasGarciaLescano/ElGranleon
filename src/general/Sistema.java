package general;

import modeloArea.Area;
import modeloArea.ArregloArea;
import modeloVeterinario.ArregloVeterinario;
import modeloDiagnostico.Diagnostico;
import modeloInformeMedico.InformeMedico;
import modeloVeterinario.Veterinario;

/**
 * @author Leonidas Garcia Lescano
 */
public class Sistema {

    //DATOS GENERALES
    public static ArregloArea areas = new ArregloArea();

    //SESION DE VETERINARIO;
    public static Area areaVeterinario;
    public static Veterinario veterinarioSesion;

    //REGISTRO DE CONTROL MEDICO
    public static Diagnostico nuevoDiagnostico;
    public static InformeMedico nuevoInformeMedico;

    public static ContenerIdentificadores contId = new ContenerIdentificadores();

}
