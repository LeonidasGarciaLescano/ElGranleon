package modelo;

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
    
    
    
}
