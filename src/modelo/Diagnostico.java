package modelo;

import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class Diagnostico {

    private String descripcion, resultado;
    ExamenFisico examenFisico;
    ArregloSintoma sintomas;
    ArregloMedicamento medicamentos;

    public Diagnostico(String descripcion, String resultado) {
        this.descripcion = descripcion;
        this.resultado = resultado;
        examenFisico = null;
        sintomas = new ArregloSintoma();
        medicamentos = new ArregloMedicamento();
    }

    public void registrarExamenFisico(String estado, double temperaturaCorporal, int frecuenciaCardiaca, Date fechaExamen) {
        examenFisico = new ExamenFisico(estado, temperaturaCorporal, frecuenciaCardiaca, fechaExamen);
    }

    public String registrarSintoma(String sintoma, String gravedad) {

        String result;

        try {
            sintomas.registrarSintoma(sintoma, gravedad);
            result = "Sintoma registrado con exito";
        } catch (IdDuplicado | LimiteAlcanzado e) {
            result = e.getMessage();
        }

        return result;

    }

    public String eliminarSintoma(String nombre) {

        String result;

        try {

            sintomas.eliminarSintoma(nombre);
            result = "Sintoma eliminado con exito";

        } catch (ArregloVacio | ElementoNoEncontrado e) {
            result = e.getMessage();
        }

        return result;

    }

    public Sintoma buscarSintoma(String nombre) {

        try {

            return sintomas.buscarSintoma(nombre);

        } catch (ArregloVacio | ElementoNoEncontrado e) {
            return null;
        }

    }

    public String registrarMedicamento(String nombre, double cantidad, int intervaloHora, int dias) {

        String resultado;

        try {
            medicamentos.registrarMedicamento(nombre, cantidad, intervaloHora, dias);
            resultado = "Medicamento registrado con exito";
        } catch (IdDuplicado | LimiteAlcanzado e) {
            resultado = e.getMessage();
        }

        return resultado;

    }

    public String eliminarMedicamento(String nombre) {

        String resultado;

        try {

            medicamentos.eliminarMedicamento(nombre);
            resultado = "Sintoma eliminado con exito";

        } catch (ArregloVacio | ElementoNoEncontrado e) {
            resultado = e.getMessage();
        }

        return resultado;

    }

    public Medicamento buscarMedicamento(String nombre) {

        try {

            return medicamentos.buscarMedicamento(nombre);

        } catch (ArregloVacio | ElementoNoEncontrado e) {
            return null;
        }

    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getResultado() {
        return resultado;
    }

    public ExamenFisico getExamenFisico() {
        return examenFisico;
    }

    public ArregloSintoma getSintomas() {
        return sintomas;
    }

    public ArregloMedicamento getMedicamentos() {
        return medicamentos;
    }

}
