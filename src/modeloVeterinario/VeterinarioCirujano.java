package modeloVeterinario;

import modeloVeterinario.Veterinario;
import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import java.util.Date;
import modeloControlOperacion.ControlOperacion;

/**
 * @author Leonidas Garcia Lescano
 */
public class VeterinarioCirujano extends Veterinario {

    public VeterinarioCirujano(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro) {
        super(id, clave, nombres, telefono, email, dni, fechaRegistro);
    }
    
}
