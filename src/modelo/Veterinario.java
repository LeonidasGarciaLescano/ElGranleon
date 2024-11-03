package modelo;

import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class Veterinario {

    private String id, clave, nombres, telefono, email, dni, nombreArea = "No asignado";
    protected String tipo;
    private Date fechaRegistro;

    public Veterinario(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro, String nombreArea, String tipo) {
        this.id = id;
        this.clave = clave;
        this.nombres = nombres;
        this.telefono = telefono;
        this.email = email;
        this.dni = dni;
        this.fechaRegistro = fechaRegistro;
        this.nombreArea = nombreArea;
        this.tipo = tipo;
    }
    
    public Veterinario(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro, String nombreArea) {
        this.id = id;
        this.clave = clave;
        this.nombres = nombres;
        this.telefono = telefono;
        this.email = email;
        this.dni = dni;
        this.fechaRegistro = fechaRegistro;
        this.nombreArea = nombreArea;
    }

    public boolean ingresar(String id, String clave) {

        boolean result = false;

        if (id.equals(this.id) && clave.equals(this.clave)) {
            result = true;
        }

        return result;
    }

    public Object[] obtenerDatosTabla() {
        return new Object[] {
            id,
            nombres,
            dni,
            nombreArea,
            tipo
        };
    }
    
    public String getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDni() {
        return dni;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public String getTipo() {
        return tipo;
    }
    
    

}
