package modeloControlOperacion;

import java.io.Serializable;
import java.util.Date;
import modeloVeterinario.Veterinario;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControlOperacion implements Serializable {

    public static int id = 1;
    private int idCtrlOpr;
    private String nombreAnimal, nombreOperacion, resultado, descripcion, anotaciones;
    private Date fechaOperacion, fechaRegistro, fechaUltimaMod;
    private Veterinario veterinario;

    public ControlOperacion(Veterinario veterinario,
            String nombreAnimal,
            String nombreOperacion,
            String resultado,
            String descripcion,
            String anotaciones,
            Date fechaOperacion, Date fechaRegistro, Date fechaUltimaMod) {
        this.idCtrlOpr = id;
        this.nombreAnimal = nombreAnimal;
        this.nombreOperacion = nombreOperacion;
        this.resultado = resultado;
        this.descripcion = descripcion;
        this.anotaciones = anotaciones;
        this.fechaOperacion = fechaOperacion;
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimaMod = fechaUltimaMod;
        this.veterinario = veterinario;
        id++;
    }

    public void modificarControlOperacion(
            String nombreOperacion,
            String resultado,
            String descripcion,
            String anotaciones,
            Date fechaOperacion) {
        this.nombreOperacion = nombreOperacion;
        this.resultado = resultado;
        this.descripcion = descripcion;
        this.anotaciones = anotaciones;
        this.fechaOperacion = fechaOperacion;

    }

    public Object[] obtenerDatosTabla() {
        return new Object[]{
            idCtrlOpr,
            nombreAnimal,
            veterinario.getNombres(),
            fechaRegistro,
            fechaUltimaMod
        };
    }

    public int getIdCtrlOpr() {
        return idCtrlOpr;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
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
