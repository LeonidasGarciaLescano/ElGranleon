package modeloInformeMedico;

import java.io.Serializable;

/**
 * @author Leonidas Garcia Lescano
 */
public class InformeMedico implements Serializable {

    private double peso, altura;
    private String observaciones;

    public InformeMedico(double peso, double altura, String observaciones) {
        this.peso = peso;
        this.altura = altura;
        this.observaciones = observaciones;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    

}
