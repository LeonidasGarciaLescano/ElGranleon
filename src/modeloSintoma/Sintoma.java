package modeloSintoma;

import java.io.Serializable;

/**
 * @author Leonidas Garcia Lescano
 */
public class Sintoma implements Serializable {

    private String nombre, gravedad;

    public Sintoma(String sintoma, String gravedad) {
        this.nombre = sintoma;
        this.gravedad = gravedad;
    }

    public Object[] obtenerDatosTabla() {
        return new Object[]{
            nombre,
            gravedad
        };
    }

    public String getNombre() {
        return nombre;
    }

    public String getGravedad() {
        return gravedad;
    }

}
