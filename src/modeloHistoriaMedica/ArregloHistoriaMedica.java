package modeloHistoriaMedica;

import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import general.Eliminadores;
import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class ArregloHistoriaMedica {

    private int indice;

    private HistoriaMedica[] historiasMedicas;

    public ArregloHistoriaMedica() {
        this.indice = 0;
        historiasMedicas = new HistoriaMedica[50];
    }

    public void registrarHistoriaMedica(HistoriaMedica nuevaHistoriaMedica) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (nuevaHistoriaMedica.getId() == historiasMedicas[i].getId()) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < historiasMedicas.length) {
            this.historiasMedicas[this.indice] = nuevaHistoriaMedica;
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public void eliminarHistoriaMedica(int id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        int nuevoIndice = Eliminadores.eliminarElementoHistoriaMedica(historiasMedicas, this.indice, id);

        if (nuevoIndice != this.indice) {
            this.indice = nuevoIndice;
        } else {
            throw new ElementoNoEncontrado();
        }

    }

    public HistoriaMedica buscarHistoriaMedica(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(historiasMedicas[i].getId())) {
                return historiasMedicas[i];
            }
        }

        throw new ElementoNoEncontrado();

    }

    public HistoriaMedica[] obtenerArreglo() {

        HistoriaMedica[] historiasMedicasValidas = new HistoriaMedica[this.indice];

        if (this.indice == 0) {
            return null;
        }

        for (int i = 0; i <= this.indice - 1; i++) {
            historiasMedicasValidas[i] = this.historiasMedicas[i];
        }

        return historiasMedicasValidas;
    }

    public static String[] getCabecera() {
        return new String[]{
            "ID",
            "Nombre veterinario",
            "Fecha ultima modificacion",
            "Diagnostico?"
        };
    }

    public HistoriaMedica[] getAnimales() {
        return historiasMedicas;
    }

    public int getIndice() {
        return indice;
    }

}
