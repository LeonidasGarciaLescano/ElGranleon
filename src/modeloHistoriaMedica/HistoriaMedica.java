package modeloHistoriaMedica;

import modeloControlOperacion.ControlOperacion;
import modeloControlMedico.ControlMedico;
import modeloControlOperacion.ArregloControlOperacion;
import modeloControlMedico.ArregloControlMedico;
import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import java.io.Serializable;
import java.util.Date;
import modeloVeterinario.Veterinario;

/**
 * @author Leonidas Garcia Lescano
 */
public class HistoriaMedica implements Serializable {

    public static int id = 1;
    private int idHistoria;
    private String nombreAnimal;
    private Date fechaCreacion;
    ArregloControlMedico controlesMedicos;
    ArregloControlOperacion controlesOperaciones;

    public HistoriaMedica(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
        this.idHistoria = id;
        this.fechaCreacion = fechaCreacion;
        this.controlesMedicos = new ArregloControlMedico();
        this.controlesOperaciones = new ArregloControlOperacion();
        id++;
    }

    public int registrarControlMedico(Veterinario veterinario, String nombreAnimal, Date fechaRegistro, Date fechaUltimaMod) {

        int id;

        try {
            id = controlesMedicos.registrarControlMedico(veterinario, nombreAnimal, fechaRegistro, fechaUltimaMod);
            return id;
        } catch (IdDuplicado | LimiteAlcanzado e) {
            return -1;
        }
    }

    public String registrarControlOperaciones(Veterinario veterinario, String nombreAnimal, String id,
            String nombreOperacion,
            String resultado,
            String descripcion,
            String anotaciones,
            String nombreVeterinario, Date fechaOperacion) {

        String result;

        try {
            controlesOperaciones.registrarControlOperacion(veterinario,
                    nombreAnimal,
                    nombreOperacion,
                    resultado,
                    descripcion, anotaciones, fechaOperacion);

            result = "Control de operacion registrado con exito";
        } catch (IdDuplicado | LimiteAlcanzado e) {
            result = e.getMessage();
        }

        return result;

    }

    public ControlMedico buscarControlMedico(int id) {

        try {
            ControlMedico controlEncontrado = controlesMedicos.buscarControlMedico(id);
            return controlEncontrado;
        } catch (ArregloVacio | ElementoNoEncontrado e) {
            return null;
        }

    }

    public ControlOperacion buscarControlOperacion(int id) {
        try {
            ControlOperacion controlEncontrado = controlesOperaciones.buscarControlOperacion(id);
            return controlEncontrado;
        } catch (ArregloVacio | ElementoNoEncontrado e) {
            return null;
        }
    }

    public void eliminarControlMedico(int idCtrlMedico) {

        try {
            controlesMedicos.eliminarControlMedico(idCtrlMedico);
        } catch (ArregloVacio | ElementoNoEncontrado e) {
        }

    }

    public void eliminarControlOperacion(int idCtrlOperacion) {

        try {
            controlesOperaciones.eliminarControlOperacion(idCtrlOperacion);
        } catch (ArregloVacio | ElementoNoEncontrado e) {
            System.out.println("xd");
        }

    }

    public int getId() {
        return id;
    }

    public int getIdHistoria() {
        return idHistoria;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public ArregloControlMedico getControlesMedicos() {
        return controlesMedicos;
    }

    public ArregloControlOperacion getControlesOperaciones() {
        return controlesOperaciones;
    }

}
