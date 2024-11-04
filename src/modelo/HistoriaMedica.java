package modelo;

import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class HistoriaMedica {

    private String nombreAnimal, especie;
    private Date fechaCreacion;
    ArregloControlMedico controlesMedicos;
    ArregloControlOperacion controlesOperaciones;

    public HistoriaMedica(String nombreAnimal, String especie, Date fechaCreacion) {
        this.nombreAnimal = nombreAnimal;
        this.especie = especie;
        this.fechaCreacion = fechaCreacion;
        this.controlesMedicos = new ArregloControlMedico();
        this.controlesOperaciones = new ArregloControlOperacion();
    }

    public String agregarControlMedico(Object[] datosCtrlMedico, Object[] datosInformeMedico, Object[] datosDiagnostico, Object[] datosExamenFisico, Object[][] datosSintomas, Object[][] datosMedicamentos) {

        String resultado;

        try {
            controlesMedicos.registrarControlMedico(datosCtrlMedico, datosInformeMedico, datosDiagnostico, datosExamenFisico, datosSintomas, datosMedicamentos);
            resultado = "Control medico registrado con exito";
        } catch (IdDuplicado | LimiteAlcanzado e) {
            resultado = e.getMessage();
        }

        return resultado;
    }

    public String agregarControlOperaciones(String id,
            String nombreOperacion,
            String resultado,
            String descripcion,
            String anotaciones,
            String nombreVeterinario, Date fechaOperacion, Date fechaRegistro, Date fechaUltimaMod) {

        String result;

        try {
            controlesOperaciones.registrarControlOperacion(id,
                    nombreOperacion,
                    resultado,
                    descripcion, anotaciones, nombreVeterinario, fechaOperacion, fechaRegistro, fechaUltimaMod);

            result = "Control de operacion registrado con exito";
        } catch (IdDuplicado | LimiteAlcanzado e) {
            result = e.getMessage();
        }

        return result;

    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public String getEspecie() {
        return especie;
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
