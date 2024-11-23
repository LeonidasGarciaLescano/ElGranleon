package modeloControlMedico;

import java.io.Serializable;
import modeloInformeMedico.InformeMedico;
import modeloDiagnostico.Diagnostico;
import java.util.Date;
import modeloVeterinario.Veterinario;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControlMedico implements Serializable {

    public static int id = 1;
    private int idCtrlMedico;
    private String nombreAnimal;
    private Date fechaRegistro;
    private Date fechaUltimaMod;
    private Veterinario veterinario;
    private Diagnostico diagnostico;
    private InformeMedico informeMedico;

    public ControlMedico(Veterinario veterinario, String nombreAnimal, Date fechaRegistro, Date fechaUltimaMod) {
        this.veterinario = veterinario;
        this.idCtrlMedico = id;
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimaMod = fechaUltimaMod;
        this.nombreAnimal = nombreAnimal;
        this.diagnostico = null;
        this.informeMedico = null;
        id++;
    }

    public ControlMedico(Veterinario veterinario, Date fechaRegistro, Date fechaUltimaMod, Diagnostico diagnostico,
            InformeMedico informeMedico) {
        this.veterinario = veterinario;
        this.idCtrlMedico = id;
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimaMod = fechaUltimaMod;
        this.diagnostico = diagnostico;
        this.informeMedico = informeMedico;
        id++;
    }

    
    
    public void registrarDiagnostico(String descripcion, String resultado) {
        diagnostico = new Diagnostico(descripcion, resultado);
    }

    public void registrarInformeMedico(double peso, double altura, String observaciones) {
        informeMedico = new InformeMedico(peso, altura, observaciones);
    }

    public void modificarDiagnostico(String descripcion, String resultado) {
        diagnostico.modificarDiagnostico(descripcion, resultado);
    }

    public void modificarInformeMedico(double peso, double altura, String observaciones) {
        informeMedico.setPeso(peso);
        informeMedico.setAltura(altura);
        informeMedico.setObservaciones(observaciones);
    }

    public Object[] obtenerDatosTabla() {
        return new Object[]{
            idCtrlMedico,
            nombreAnimal,
            veterinario.getNombres(),
            fechaRegistro,
            fechaUltimaMod
        };
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public int getIdCtrlMedico() {
        return idCtrlMedico;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public Date getFechaUltimaMod() {
        return fechaUltimaMod;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public InformeMedico getInformeMedico() {
        return informeMedico;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setFechaUltimaMod(Date fechaUltimaMod) {
        this.fechaUltimaMod = fechaUltimaMod;
    }

    
    
}
