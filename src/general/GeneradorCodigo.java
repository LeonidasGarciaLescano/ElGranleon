package general;

import java.util.Random;

/**
 * @author Leonidas Garcia Lescano
 */
public class GeneradorCodigo {

    private static final Random random = new Random();

    private static String generarCodigo(String prefijo) {
        int numero = random.nextInt(10000);
        return String.format("%s-%04d", prefijo, numero);
    }

    public static String generarClave() {
        int numero = random.nextInt(10000);
        return String.format("%04d", numero); 
    }
    
    public static String generarCodigoAdministrador() {
        return generarCodigo("ADM");
    }

    public static String generarCodigoVeterinario() {
        return generarCodigo("VET");
    }

    public static String generarCodigoAnimal() {
        return generarCodigo("ANI");
    }

    public static String generarCodigoControlMedico() {
        return generarCodigo("CMED");
    }

    public static String generarCodigoControlOperacion() {
        return generarCodigo("COPR");
    }

}
