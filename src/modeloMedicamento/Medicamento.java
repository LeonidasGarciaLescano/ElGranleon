package modeloMedicamento;

/**
 * @author Leonidas Garcia Lescano
 */

public class Medicamento {
    private String nombre;
    private double cantidad;
    private int intervaloHora, dias;

    public Medicamento(String nombre, double cantidad, int intervaloHora, int dias) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.intervaloHora = intervaloHora;
        this.dias = dias;
    }

    public Object[] obtenerDatosTabla() {
        return new Object[]{
            nombre,
            cantidad,
            intervaloHora,
            dias
        };
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public int getIntervaloHora() {
        return intervaloHora;
    }

    public int getDias() {
        return dias;
    }
    
    
    
}
