package modelo;

import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class Zoologico {

    private String nombre, direccion;
    private int aforo;
    private Date horaApertura, horaCierre;

    ArregloArea areas;

    public Zoologico(String nombre, String direccion, int aforo, Date horaApertura, Date horaCierre) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.aforo = aforo;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.areas = new ArregloArea();
    }

    public String registrarArea(String nombreArea, ArregloAnimal animales, ArregloVeterinario veterinarios) {

        String resultado;

        try {
            areas.registrarArea(nombreArea, animales, veterinarios);
            resultado = "Area registrada con exito";
        } catch (IdDuplicado | LimiteAlcanzado e) {
            resultado = e.getMessage();
        }

        return resultado;
    }

    public String eliminarArea(String nombreArea) {

        String resultado;

        try {

            areas.eliminarArea(nombreArea);
            resultado = "Area eliminada con exito";

        } catch (ArregloVacio | ElementoNoEncontrado e) {
            resultado = e.getMessage();
        }

        return resultado;

    }

    public Area buscarArea(String nombreArea) {

        try {

            return areas.buscarArea(nombreArea);

        } catch (ArregloVacio | ElementoNoEncontrado e) {
            return null;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getAforo() {
        return aforo;
    }

    public Date getHoraApertura() {
        return horaApertura;
    }

    public Date getHoraCierre() {
        return horaCierre;
    }

    public ArregloArea getAreaArreglo() {
        return areas;
    }

}
