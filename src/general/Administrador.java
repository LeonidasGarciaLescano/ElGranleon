package general;

/**
 * @author Leonidas Garcia Lescano
 */
public class Administrador {

    private String id, clave;

    public Administrador(String id, String clave) {
        this.id = id;
        this.clave = clave;
    }

    public boolean ingresar(String id, String clave) {

        boolean result = false;

        if (id.equals(this.id) && clave.equals(this.clave)) {
            result = true;
        }

        return result;
    }

    public String getId() {
        return id;
    }

    public String getClave() {
        return clave;
    }

}
