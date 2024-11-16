package modeloAnimal;

import modeloAnimal.Animal;
import excepciones.ArregloException;
import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import general.Eliminadores;
import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class ArregloAnimal {

    private int indice;
    private final Animal[] animales;

    public ArregloAnimal(int tam) {
        this.indice = 0;
        animales = new Animal[tam];
    }

    public void registrarAnimal(Animal nuevoAnimal) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (nuevoAnimal.getId().equals(animales[i].getId())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < animales.length) {
            this.animales[this.indice] = nuevoAnimal;
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }
    
    public void eliminarAnimal(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        int nuevoIndice = Eliminadores.eliminarElementoAnimal(animales, this.indice, id);

        if (nuevoIndice != this.indice) {
            this.indice = nuevoIndice;
        } else {
            throw new ElementoNoEncontrado();
        }

    }

    public Animal buscarAnimal(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(animales[i].getId())) {
                return animales[i];
            }
        }

        throw new ElementoNoEncontrado();

    }

    public Animal[] obtenerArreglo() {

        Animal[] animalesValidos = new Animal[this.indice];

        if (this.indice == 0) {
            return null;
        }

        for (int i = 0; i <= this.indice - 1; i++) {
            animalesValidos[i] = this.animales[i];
        }

        return animalesValidos;
    }

    public static String[] getCabecera() {
        return new String[]{
            "ID",
            "Nombre",
            "Especie"
        };
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public int getIndice() {
        return indice;
    }

}
