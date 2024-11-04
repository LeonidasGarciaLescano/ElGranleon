package modelo;

import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class VeterinarioZoologico extends Veterinario {

    private HistoriaMedica[] historiasCirujano;

    public VeterinarioZoologico(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro, String nombreArea, String tipo) {
        super(id, clave, nombres, telefono, email, dni, fechaRegistro, nombreArea, tipo);
    }

    public VeterinarioZoologico(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro, String nombreArea) {
        super(id, clave, nombres, telefono, email, dni, fechaRegistro, nombreArea);
        tipo = "Zoologico";
    }

    public void registrarControlMedico() {

    }

    public void modificarControlMedico() {

    }

    public void eliminarControlMedico() {

    }

    public ControlMedico buscarControlMedico() {
        return null;
    }

}
