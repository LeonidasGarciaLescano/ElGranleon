package modeloExamenFisico;

import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */

public class ExamenFisico {
    private String estado;
    private double temperaturaCorporal;
    private int frecuenciaCardiaca;
    private Date fechaExamen;
    
    public ExamenFisico(String estado, double temperaturaCorporal, int frecuenciaCardiaca, Date fechaExamen) {
        this.estado = estado;
        this.temperaturaCorporal = temperaturaCorporal;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.fechaExamen = fechaExamen;
    }

    public String getEstado() {
        return estado;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public Date getFechaExamen() {
        return fechaExamen;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public void setFechaExamen(Date fechaExamen) {
        this.fechaExamen = fechaExamen;
    }
    
    
    
}
