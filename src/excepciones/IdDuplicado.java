package excepciones;

/**
 * @author Leonidas Garcia Lescano
 */

public class IdDuplicado extends ArregloException {

    public IdDuplicado() {
        super("Este id ya esta registrado");
    }
    
}