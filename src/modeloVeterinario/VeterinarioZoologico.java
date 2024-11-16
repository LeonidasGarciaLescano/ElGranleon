package modeloVeterinario;

import modeloVeterinario.Veterinario;
import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class VeterinarioZoologico extends Veterinario {

    public VeterinarioZoologico(String id, String clave, String nombres, String telefono, String email, String dni, Date fechaRegistro) {
        super(id, clave, nombres, telefono, email, dni, fechaRegistro);
    }

}
