package modeloVeterinario;

import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import general.Eliminadores;

/**
 * @author Leonidas Garcia Lescano
 */
public class ArregloVeterinario {

    private int indice;
    private final Veterinario[] veterinarios;

    public ArregloVeterinario(int tam) {
        this.indice = 0;
        veterinarios = new Veterinario[tam];
    }

    public void registrarVeterinario(Veterinario nuevoVeterinario) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (nuevoVeterinario.getId().equals(veterinarios[i].getId())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < veterinarios.length) {
            this.veterinarios[this.indice] = nuevoVeterinario;
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public void eliminarVeterinario(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        int nuevoIndice = Eliminadores.eliminarElementoVeterinario(veterinarios, this.indice, id);

        if (nuevoIndice != this.indice) {
            this.indice = nuevoIndice;
        } else {
            throw new ElementoNoEncontrado();
        }

    }

    public Veterinario buscarVeterinario(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(veterinarios[i].getId())) {
                return veterinarios[i];
            }
        }

        throw new ElementoNoEncontrado();

    }

    public Veterinario buscarVeterinarioPorNombre(String nombre) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        for (int i = 0; i < this.indice; i++) {
            if (nombre.equals(veterinarios[i].getNombres())) {
                return veterinarios[i];
            }
        }

        throw new ElementoNoEncontrado();

    }

    public Veterinario[] obtenerArreglo() {

        Veterinario[] veterinariosValidos = new Veterinario[this.indice];

        if (this.indice == 0) {
            return null;
        }

        for (int i = 0; i <= this.indice - 1; i++) {
            veterinariosValidos[i] = this.veterinarios[i];
        }

        return veterinariosValidos;
    }

    public static String[] getCabecera() {
        return new String[]{
            "ID",
            "Nombres",
            "DNI",
            "Area asignada",
            "Especialidad"
        };
    }

    public int getIndice() {
        return indice;
    }

    public Veterinario[] getVeterinarios() {
        return veterinarios;
    }

}
