package modelo;

/**
 * @author Leonidas Garcia Lescano
 */
public class InformeMedico {

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

}
