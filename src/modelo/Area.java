package modelo;

import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class Area {

    private String nombreArea;
    ArregloAnimal animales;
    ArregloVeterinario veterinarios;

    public Area(String nombreArea, ArregloAnimal animales, ArregloVeterinario veterinarios) {
        this.nombreArea = nombreArea;
        this.animales = animales;
        this.veterinarios = veterinarios;
    }

    public String registrarAnimal(String id, String nombre, String especie, String clase, String sexo, Date fechanacimiento) {

        String resultado;

        try {
            animales.registrarAnimal(id, nombre, especie, clase, sexo, fechanacimiento, this.nombreArea);
            resultado = "Animal registrado con exito";
        } catch (IdDuplicado | LimiteAlcanzado e) {
            resultado = e.getMessage();
        }
        
        return resultado;
    }

    public String registrarVeterinario(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro, String nombreArea) {

        String resultado;

        try {
            veterinarios.registrarVeterinario(id, clave, nombres, telefono, email, dni, fechaRegistro, nombreArea);
            resultado = "Veterinario registrado con exito";
        } catch (IdDuplicado | LimiteAlcanzado e) {
            resultado = e.getMessage();
        }

        return resultado;

    }

    public String registrarVeterinarioZoologico(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro) {

        String resultado;

        try {
            veterinarios.registrarVeterinarioZoologico(id, clave, nombres, telefono, email, dni, fechaRegistro, this.nombreArea);
            resultado = "Veterinario zoologico registrado con exito";
        } catch (IdDuplicado | LimiteAlcanzado e) {
            resultado = e.getMessage();
        }

        return resultado;

    }
    
    public String registrarVeterinarioCirujano(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro) {

        String resultado;

        try {
            veterinarios.registrarVeterinarioCirujano(id, clave, nombres, telefono, email, dni, fechaRegistro, this.nombreArea);
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

    @Override
    public String toString() {
        String nombres = "";

        Animal[] lista = animales.getAnimales();
        int indice = animales.getIndice();

        for (int i = 0; i < indice; i++) {
            nombres += lista[i].getNombre();
            nombres += "\n";
        }

        return nombres;

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
