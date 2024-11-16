package modeloVeterinario;

import modeloHistoriaMedica.HistoriaMedica;
import modeloHistoriaMedica.ArregloHistoriaMedica;
import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class Veterinario {

    protected ArregloHistoriaMedica historiasMedicas;

    protected String id, clave, nombres, telefono, email, dni;
    protected Date fechaRegistro;

    public Veterinario(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro) {
        this.id = id;
        this.clave = clave;
        this.nombres = nombres;
        this.telefono = telefono;
        this.email = email;
        this.dni = dni;
        this.fechaRegistro = fechaRegistro;
        historiasMedicas = new ArregloHistoriaMedica();
    }

    public boolean ingresar(String id, String clave) {

        boolean result = false;

        if (id.equals(this.id) && clave.equals(this.clave)) {
            result = true;
        }

        return result;
    }

    public void registrarHistoriaMedica(HistoriaMedica nuevaHistoriaMedica) {

        try {
            historiasMedicas.registrarHistoriaMedica(nuevaHistoriaMedica);
        } catch (IdDuplicado | LimiteAlcanzado e) {

        }

    }

    public HistoriaMedica buscarHistoraMedica(String id) {

        try {
            return historiasMedicas.buscarHistoriaMedica(id);
        } catch (Exception e) {
            return null;
        }

    }

    public void eliminarHistoriaMedica(int id) {

        try {
            historiasMedicas.eliminarHistoriaMedica(id);
        } catch (ArregloVacio | ElementoNoEncontrado e) {

        }

    }

    public Object[] obtenerDatosTabla() {
        return new Object[]{
            id,
            nombres,
            dni
        };
    }

    public ArregloHistoriaMedica getHistoriasMedicas() {
        return historiasMedicas;
    }

    public String getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDni() {
        return dni;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

}
