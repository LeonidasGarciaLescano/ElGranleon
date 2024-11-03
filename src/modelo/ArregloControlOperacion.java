package modelo;

import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import general.Eliminadores;
import java.util.Date;

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

    public void registrarControlOperacion(String id,
            String nombreOperacion,
            String resultado,
            String descripcion,
            String anotaciones,
            String nombreVeterinario,
            Date fechaOperacion, Date fechaRegistro, Date fechaUltimaMod) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(this.controlesOperaciones[i].getId())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < this.controlesOperaciones.length) {
            this.controlesOperaciones[this.indice] = new ControlOperacion(id, nombreOperacion, resultado, descripcion, anotaciones, nombreVeterinario, fechaOperacion, fechaRegistro, fechaUltimaMod);
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public void eliminarControlOperacion(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        int nuevoIndice = Eliminadores.eliminarElementoControlOperacion(controlesOperaciones, id);

        if (nuevoIndice != this.indice) {
            this.indice = nuevoIndice;
        } else {
            throw new ElementoNoEncontrado();
        }

    }

    public ControlOperacion buscarControlOoperacion(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(controlesOperaciones[i].getId())) {
                return controlesOperaciones[i];
            }
        }

        throw new ElementoNoEncontrado();

    }

    public int getIndice() {
        return indice;
    }

}
