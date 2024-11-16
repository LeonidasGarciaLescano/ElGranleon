package general;

import modeloArea.Area;
import modeloAnimal.ArregloAnimal;
import modeloArea.ArregloArea;
import modeloVeterinario.ArregloVeterinario;
import modeloDiagnostico.Diagnostico;
import modeloExamenFisico.ExamenFisico;
import modeloHistoriaMedica.HistoriaMedica;
import modeloInformeMedico.InformeMedico;
import modeloVeterinario.Veterinario;
import modeloVeterinario.VeterinarioCirujano;
import modeloVeterinario.VeterinarioZoologico;

/**
 * @author Leonidas Garcia Lescano
 */
public class Sistema {

    //DATOS GENERALES
    public static ArregloArea areas = new ArregloArea();
    public static ArregloVeterinario veterinarios = new ArregloVeterinario(60);

    //SESION DE VETERINARIO;
    public static Area areaVeterinario;
    public static Veterinario veterinarioSesion;

    //REGISTRO DE CONTROL MEDICO
    public static Diagnostico nuevoDiagnostico;
    public static InformeMedico nuevoInformeMedico;

    //A QUITAR EN UN FUTURO
    public static int codigosHistorias = 1;

}
