package modelo;

import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class Animal {

    private String id, nombre, especie, clase, sexo, nombreArea;
    private Date fechaNacimiento;
    HistoriaMedica historiaMedica;

    public Animal(String id, String nombre, String especie, String clase, String sexo, Date fechaNacimiento, String nombreArea) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.clase = clase;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.historiaMedica = new HistoriaMedica(nombre, especie, fechaNacimiento);
        this.nombreArea = nombreArea;
    }

    public Object[] obtenerDatosTabla() {
        return new Object[] {
            id,
            nombre,
            especie,
            nombreArea
        };
    }
    
    public HistoriaMedica verHistoriaMedica() {
        return this.historiaMedica;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

}
