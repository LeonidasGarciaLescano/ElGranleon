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
public class ArregloVeterinario {

    private int indice;
    private Veterinario[] veterinarios;

    public ArregloVeterinario(int tam) {
        this.indice = 0;
        veterinarios = new Veterinario[tam];
    }

    public void registrarVeterinario(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro, String nombreArea) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(veterinarios[i].getId())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < veterinarios.length) {
            this.veterinarios[this.indice] = new Veterinario(id, clave, nombres, telefono, email, dni, fechaRegistro, nombreArea);
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public void registrarVeterinarioZoologico(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro, String nombreArea) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(veterinarios[i].getId())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < veterinarios.length) {
            this.veterinarios[this.indice] = new VeterinarioZoologico(id, clave, nombres, telefono, email, dni, fechaRegistro, nombreArea);
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }
    
    public void registrarVeterinarioZoologico(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro, String nombreArea, String tipo) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(veterinarios[i].getId())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < veterinarios.length) {
            this.veterinarios[this.indice] = new VeterinarioZoologico(id, clave, nombres, telefono, email, dni, fechaRegistro, nombreArea, tipo);
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public void registrarVeterinarioCirujano(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro, String nombreArea) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(veterinarios[i].getId())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < veterinarios.length) {
            this.veterinarios[this.indice] = new VeterinarioCirujano(id, clave, nombres, telefono, email, dni, fechaRegistro, nombreArea);
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }
    
    public void registrarVeterinarioCirujano(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro, String nombreArea, String tipo) throws IdDuplicado, LimiteAlcanzado {

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(veterinarios[i].getId())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < veterinarios.length) {
            this.veterinarios[this.indice] = new VeterinarioCirujano(id, clave, nombres, telefono, email, dni, fechaRegistro, nombreArea, tipo);
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public void eliminarVeterinario(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        int nuevoIndice = Eliminadores.eliminarElementoVeterinario(veterinarios, id);

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

    public Veterinario[] obtenerArreglo() {
        
        Veterinario[] veterinariosValidos = new Veterinario[this.indice];
        
        if (this.indice == 0) return null;
        
        for (int i = 0; i <= this.indice-1; i++) {
            veterinariosValidos[i] = this.veterinarios[i];
        }
        
        return veterinariosValidos;
    }
    
    public static String[] getCabecera () {
        return new String[] {
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
