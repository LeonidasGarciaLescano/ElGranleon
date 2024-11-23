package modeloAnimal;

import java.io.Serializable;
import java.util.Date;
import modeloHistoriaMedica.HistoriaMedica;
import modeloVeterinario.Veterinario;

/**
 * @author Leonidas Garcia Lescano
 */
public class Animal implements Serializable {

    private String id, nombre, especie, clase, sexo;
    private Date fechaNacimiento;
    HistoriaMedica historiaMedica;

    public Animal(String id, String nombre, String especie, String clase, String sexo, Date fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.clase = clase;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.historiaMedica = new HistoriaMedica(nombre);
    }

    public int registrarControlMedico(Veterinario veterinario, String nombreAnimal) {
        return historiaMedica.registrarControlMedico(veterinario, nombreAnimal, new Date(), new Date());
    }

    public void registrarControlOperacion(Veterinario veterinario, String nombreAnimal, String id,
            String nombreOperacion,
            String resultado,
            String descripcion,
            String anotaciones,
            String nombreVeterinario, Date fechaOperacion, Date fechaRegistro, Date fechaUltimaMod) {
        historiaMedica.registrarControlOperaciones(veterinario, id,
                nombreAnimal,
                nombreOperacion,
                resultado,
                descripcion, anotaciones, nombreVeterinario, fechaOperacion);
    }

    public Object[] obtenerDatosTabla() {
        return new Object[]{
            id,
            nombre,
            especie
        };
    }

    public HistoriaMedica getHistoriaMedica() {
        return this.historiaMedica;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

}
