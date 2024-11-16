package modeloArea;

import modeloAnimal.Animal;
import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import java.util.Date;
import modeloAnimal.ArregloAnimal;
import modeloVeterinario.ArregloVeterinario;
import modeloVeterinario.Veterinario;

/**
 * @author Leonidas Garcia Lescano
 */
public class Area {

    private final String nombreArea;
    ArregloAnimal animales;
    ArregloVeterinario veterinarios;

    public Area(String nombreArea) {
        this.nombreArea = nombreArea;
        this.animales = new ArregloAnimal(40);
        this.veterinarios = new ArregloVeterinario(20);
    }

    public String registrarAnimal(Animal nuevoAnimal) {

        String resultado;

        try {
            animales.registrarAnimal(nuevoAnimal);
            resultado = "Animal registrado con exito";
        } catch (IdDuplicado | LimiteAlcanzado e) {
            resultado = e.getMessage();
        }

        return resultado;
    }

    public String registrarVeterinario(Veterinario nuevoVeterinario) {

        String resultado;

        try {
            veterinarios.registrarVeterinario(nuevoVeterinario);
            resultado = "Veterinario registrado con exito";
        } catch (IdDuplicado | LimiteAlcanzado e) {
            resultado = e.getMessage();
        }

        return resultado;

    }

    public String eliminarAnimal(String id) {

        String resultado;

        try {

            animales.eliminarAnimal(id);
            resultado = "Animal eliminado con exito";

        } catch (ArregloVacio | ElementoNoEncontrado e) {
            resultado = e.getMessage();
        }

        return resultado;

    }

    public String eliminarVeterinario(String id) {

        String resultado;

        try {

            veterinarios.eliminarVeterinario(id);
            resultado = "Veterinario eliminado con exito";

        } catch (ArregloVacio | ElementoNoEncontrado e) {
            resultado = e.getMessage();
        }

        return resultado;

    }

    public Animal buscarAnimal(String id) {

        try {

            return animales.buscarAnimal(id);

        } catch (ArregloVacio | ElementoNoEncontrado e) {
            return null;
        }

    }

    public Veterinario buscarVeterinario(String id) {

        try {

            return veterinarios.buscarVeterinario(id);

        } catch (ArregloVacio | ElementoNoEncontrado e) {
            return null;
        }

    }

    public Veterinario buscarVeterinarioPorNombre(String nombre) {

        try {

            return veterinarios.buscarVeterinarioPorNombre(nombre);

        } catch (ArregloVacio | ElementoNoEncontrado e) {
            return null;
        }

    }

    @Override
    public String toString() {
        return nombreArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public ArregloAnimal getAnimales() {
        return animales;
    }

    public ArregloVeterinario getArregloVeterinarios() {
        return veterinarios;
    }

}
