package general;

import modeloAnimal.Animal;
import modeloArea.Area;
import modeloControlMedico.ControlMedico;
import modeloControlOperacion.ControlOperacion;
import modeloHistoriaMedica.HistoriaMedica;
import modeloMedicamento.Medicamento;
import modeloSintoma.Sintoma;
import modeloVeterinario.Veterinario;

/**
 * @author Leonidas Garcia Lescano
 */
public class Eliminadores {

    public static int eliminarElementoArea(Area[] arreglo, int tamValido, String id) {
        int n = tamValido;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!arreglo[i].getNombreArea().equals(id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }

    public static int eliminarElementoHistoriaMedica(HistoriaMedica[] arreglo, int tamValido, int id) {
        int n = tamValido;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!(arreglo[i].getId() == id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }

    public static int eliminarElementoAnimal(Animal[] arreglo, int tamValido, String id) {
        int n = tamValido;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!arreglo[i].getId().equals(id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }

    public static int eliminarElementoVeterinario(Veterinario[] arreglo, int tamValido, String id) {
        int n = tamValido;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!arreglo[i].getId().equals(id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }

    public static int eliminarElementoControlMedico(ControlMedico[] arreglo, int tamValido, int id) {
        int n = tamValido;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!(arreglo[i].getIdCtrlMedico() == id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }

    public static int eliminarElementoControlOperacion(ControlOperacion[] arreglo, int tamValido, int id) {
        int n = tamValido;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (!(arreglo[i].getIdCtrlOpr() == id)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }

    public static int eliminarElementoSintoma(Sintoma[] arreglo, int tamValido, String nombre) {
        int n = tamValido;
        int index = 0;

        System.out.println(n);

        for (int i = 0; i < n; i++) {
            if (!arreglo[i].getNombre().equals(nombre)) {
                arreglo[index] = arreglo[i];
                index++;
            }
        }

        return index;
    }

    public static int eliminarElementoMedicamento(Medicamento[] arreglo, int tamValido, String id) {
        int n = tamValido;
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
