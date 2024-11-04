package modelo;

import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControlOperacion {

    private String id, nombreOperacion, resultado, descripcion, anotaciones, nombreVeterinario;
    private Date fechaOperacion, fechaRegistro, fechaUltimaMod;

    public ControlOperacion(String id,
            String nombreOperacion,
            String resultado,
            String descripcion,
            String anotaciones,
            String nombreVeterinario, Date fechaOperacion, Date fechaRegistro, Date fechaUltimaMod) {
        this.id = id;
        this.nombreOperacion = nombreOperacion;
        this.resultado = resultado;
        this.descripcion = descripcion;
        this.anotaciones = anotaciones;
        this.nombreVeterinario = nombreVeterinario;
        this.fechaOperacion = fechaOperacion;
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimaMod = fechaUltimaMod;
    }

    public String getId() {
        return id;
    }

    public String getNombreOperacion() {
        return nombreOperacion;
    }

    public String getResultado() {
        return resultado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public Date getFechaUltimaMod() {
        return fechaUltimaMod;
    }

}
