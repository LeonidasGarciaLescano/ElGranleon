package modeloArea;

import modeloArea.Area;
import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import general.Eliminadores;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class ArregloArea implements Serializable {

    private int indice;
    private final Area[] areas;

    public ArregloArea() {
        this.indice = 0;
        areas = new Area[3];
    }

    public void registrarArea(Area nuevaArea) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (nuevaArea.getNombreArea().equals(areas[i].getNombreArea())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < areas.length) {
            this.areas[this.indice] = nuevaArea;
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public void eliminarArea(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        int nuevoIndice = Eliminadores.eliminarElementoArea(areas, this.indice, id);

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

    public Area[] obtenerArreglo() {
        
        Area[] areasValidas = new Area[this.indice];
        
        if (this.indice == 0) return null;
        
        for (int i = 0; i <= this.indice-1; i++) {
            areasValidas[i] = this.areas[i];
        }
        
        return areasValidas;
    }
    
    public Area[] getAreas() {
        return areas;
    }

    public int getIndice() {
        return indice;
    }

}
