package excepciones;

/**
 * @author Leonidas Garcia Lescano
 */

public class LimiteAlcanzado extends ArregloException {

    public LimiteAlcanzado() {
        super("El arreglo esta lleno");
    }
    
}