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
public class ArregloArea {

    private int indice;
    private final Area[] areas;

    public ArregloArea() {
        this.indice = 0;
        areas = new Area[3];
    }

    public void registrarArea(String nombreArea, ArregloAnimal animales, ArregloVeterinario veterinarios) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (nombreArea.equals(areas[i].getNombreArea())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < areas.length) {
            this.areas[this.indice] = new Area(nombreArea, animales, veterinarios);
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public void eliminarArea(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        int nuevoIndice = Eliminadores.eliminarElementoArea(areas, id);

        if (nuevoIndice != this.indice) {
            this.indice = nuevoIndice;
        } else {
            throw new ElementoNoEncontrado();
        }

    }

    public Area buscarArea(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(areas[i].getNombreArea())) {
                return areas[i];
            }
        }

        throw new ElementoNoEncontrado();

    }

    public Area[] getAreas() {
        return areas;
    }

    public int getIndice() {
        return indice;
    }

}
