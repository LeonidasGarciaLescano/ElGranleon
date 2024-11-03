package general;

import modelo.Animal;
import modelo.Area;
import modelo.ControlMedico;
import modelo.ControlOperacion;
import modelo.Medicamento;
import modelo.Sintoma;
import modelo.Veterinario;

/**
 * @author Leonidas Garcia Lescano
 */
public class Eliminadores {

    public static int eliminarElementoArea(Area[] arreglo, String id) {
        int n = arreglo.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!arreglo[i].getNombreArea().equals(id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }
    
    public static int eliminarElementoAnimal(Animal[] arreglo, String id) {
        int n = arreglo.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!arreglo[i].getId().equals(id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }

    public static int eliminarElementoVeterinario(Veterinario[] arreglo, String id) {
        int n = arreglo.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!arreglo[i].getId().equals(id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }

    public static int eliminarElementoControlMedico(ControlMedico[] arreglo, String id) {
        int n = arreglo.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!arreglo[i].getId().equals(id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }

    public static int eliminarElementoControlOperacion(ControlOperacion[] arreglo, String id) {
        int n = arreglo.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!arreglo[i].getId().equals(id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }

    public static int eliminarElementoSintoma(Sintoma[] arreglo, String id) {
        int n = arreglo.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!arreglo[i].getNombre().equals(id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }
    
    public static int eliminarElementoMedicamento(Medicamento[] arreglo, String id) {
        int n = arreglo.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!arreglo[i].getNombre().equals(id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }
    
    
    
}
