package modeloControlOperacion;

import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import general.Eliminadores;
import java.util.Date;
import modeloControlMedico.ControlMedico;
import modeloVeterinario.Veterinario;

/**
 * @author Leonidas Garcia Lescano
 */
public class ArregloControlOperacion {

    private int indice;
    private ControlOperacion[] controlesOperaciones;

    public ArregloControlOperacion() {
        this.indice = 0;
        controlesOperaciones = new ControlOperacion[10];
    }

    public void registrarControlOperacion(Veterinario veterinario,
            String nombreAnimal,
            String nombreOperacion,
            String resultado,
            String descripcion,
            String anotaciones,
            Date fechaOperacion) throws IdDuplicado, LimiteAlcanzado {

        if (this.indice < this.controlesOperaciones.length) {
            this.controlesOperaciones[this.indice] = new ControlOperacion(veterinario, nombreAnimal, nombreOperacion, resultado, descripcion,
                    anotaciones, fechaOperacion, new Date(), new Date());
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public void eliminarControlOperacion(int id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        int nuevoIndice = Eliminadores.eliminarElementoControlOperacion(controlesOperaciones, this.indice, id);

        if (nuevoIndice != this.indice) {
            this.indice = nuevoIndice;
        } else {
            throw new ElementoNoEncontrado();
        }

    }

    public ControlOperacion buscarControlOperacion(int id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        for (int i = 0; i < this.indice; i++) {
            if (id == controlesOperaciones[i].getIdCtrlOpr()) {
                return controlesOperaciones[i];
            }
        }

        throw new ElementoNoEncontrado();

    }

    public ControlOperacion[] obtenerArreglo() {

        ControlOperacion[] controlesOperacionesValidos = new ControlOperacion[this.indice];

        if (this.indice == 0) {
            return null;
        }

        for (int i = 0; i <= this.indice - 1; i++) {
            controlesOperacionesValidos[i] = this.controlesOperaciones[i];
        }

        return controlesOperacionesValidos;
    }

    public static String[] getColumnas() {
        return new String[]{
            "ID de control medico",
            "Nombre del animal",
            "Nombre veterinario",
            "Fecha de registro",
            "Fecha de ultima modificacion"
        };
    }

    public int getIndice() {
        return indice;
    }

}
