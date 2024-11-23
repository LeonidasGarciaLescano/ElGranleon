package modeloSintoma;

import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import general.Eliminadores;
import java.io.Serializable;

/**
 * @author Leonidas Garcia Lescano
 */
public class ArregloSintoma implements Serializable {

    private int indice;
    private final Sintoma[] sintomas;

    public ArregloSintoma() {
        this.indice = 0;
        sintomas = new Sintoma[10];
    }

    public void registrarSintoma(String nombre, String gravedad) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (nombre.equals(sintomas[i].getNombre())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < sintomas.length) {
            this.sintomas[this.indice] = new Sintoma(nombre, gravedad);
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public void eliminarSintoma(String nombre) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        int nuevoIndice = Eliminadores.eliminarElementoSintoma(sintomas, this.indice, nombre);

        if (nuevoIndice != this.indice) {
            this.indice = nuevoIndice;
        } else {
            throw new ElementoNoEncontrado();
        }

    }

    public Sintoma buscarSintoma(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(sintomas[i].getNombre())) {
                return sintomas[i];
            }
        }

        throw new ElementoNoEncontrado();

    }

    public Sintoma[] obtenerArreglo() {

        Sintoma[] sintomasValidos = new Sintoma[this.indice];

        if (this.indice == 0) {
            return null;
        }

        for (int i = 0; i <= this.indice - 1; i++) {
            sintomasValidos[i] = this.sintomas[i];
        }

        return sintomasValidos;
    }

    public static String[] getColumnas() {
        return new String[]{
            "Nombre sintoma",
            "Gravedad"
        };
    }

}
