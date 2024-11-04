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
public class ArregloMedicamento {

    private int indice;
    private Medicamento[] medicamentos;

    public ArregloMedicamento() {
        this.indice = 0;
        medicamentos = new Medicamento[10];
    }

    public void registrarMedicamento(String nombre, double cantidad, int intervaloHora, int dias) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (nombre.equals(medicamentos[i].getClass())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < medicamentos.length) {
            this.medicamentos[this.indice] = new Medicamento(nombre, cantidad, intervaloHora, dias);
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public void eliminarMedicamento(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        int nuevoIndice = Eliminadores.eliminarElementoMedicamento(medicamentos, id);

        if (nuevoIndice != this.indice) {
            this.indice = nuevoIndice;
        } else {
            throw new ElementoNoEncontrado();
        }

    }

    public Medicamento buscarMedicamento(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(medicamentos[i].getNombre())) {
                return medicamentos[i];
            }
        }

        throw new ElementoNoEncontrado();

    }

    public Medicamento[] getMedicamento() {
        return medicamentos;
    }

    public int getIndice() {
        return indice;
    }

}
