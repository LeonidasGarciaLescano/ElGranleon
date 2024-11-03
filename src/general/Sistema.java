package general;

import modelo.Area;
import modelo.ArregloAnimal;
import modelo.ArregloVeterinario;
import modelo.Veterinario;
import modelo.VeterinarioCirujano;
import modelo.VeterinarioZoologico;
import modelo.Zoologico;

/**
 * @author Leonidas Garcia Lescano
 */
public class Sistema {

    public static Zoologico zoo;

    public static Administrador administrador;
    public static Area area;    
    public static ArregloVeterinario[] veterinarios = new ArregloVeterinario[4];
    public static ArregloVeterinario veterinariosNoAsignados = new ArregloVeterinario(5);
    public static ArregloAnimal[] animales = new ArregloAnimal[3];
    public static VeterinarioCirujano veterinarioCirujano;
    public static VeterinarioZoologico veterinarioZoologico;

    public static Administrador[] administradores = {
        new Administrador("ADM-1234", "1234"),
        new Administrador("ADM-6969", "6969"),
        new Administrador("ADM-4321", "4321"),
        new Administrador("ADM-0987", "0987"),
        new Administrador("ADM-5678", "5678")
    };

}
