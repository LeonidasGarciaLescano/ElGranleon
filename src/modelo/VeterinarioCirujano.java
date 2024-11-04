package modelo;

import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */

public class VeterinarioCirujano extends Veterinario {
    
    private HistoriaMedica[] historiasCirujano;
    
    public VeterinarioCirujano(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro, String nombreArea, String tipo) {
        super(id, clave, nombres, telefono, email, dni, fechaRegistro, nombreArea, tipo);
    }
    
    public VeterinarioCirujano(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro, String nombreArea) {
        super(id, clave, nombres, telefono, email, dni, fechaRegistro, nombreArea);
        this.tipo = "Cirujano";
    }
    
    public void registrarControlOperacion() {
        
    }
    
    public void modificarControlOperacion() {
        
    }
    
    public void eliminarControlOperacion() {
        
    }
    
    public ControlOperacion buscarControlOperacion() {
        return null;
    }
    
}
