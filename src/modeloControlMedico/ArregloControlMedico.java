package modeloControlMedico;

import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import general.Eliminadores;
import general.Sistema;
import java.io.Serializable;
import java.util.Date;
import modeloDiagnostico.Diagnostico;
import modeloInformeMedico.InformeMedico;
import modeloVeterinario.Veterinario;

/**
 * @author Leonidas Garcia Lescano
 */
public class ArregloControlMedico implements Serializable {

    private int indice;
    private final ControlMedico[] controlesMedicos;

    public ArregloControlMedico() {
        this.indice = 0;
        controlesMedicos = new ControlMedico[10];
    }

    public int registrarControlMedico(Veterinario veterinario, String nombreAnimal, Date fechaRegistro, Date fechaUltimaMod) throws IdDuplicado, LimiteAlcanzado {

        int id = -1;

        if (this.indice < controlesMedicos.length) {
            id = ControlMedico.id;
            this.controlesMedicos[this.indice] = new ControlMedico(veterinario, nombreAnimal, fechaRegistro, fechaUltimaMod);
            this.indice++;
            return id;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public String modificarControlMedico(int id, Date fechaRegistro, Date fechaUltimaMod) {

        try {
            ControlMedico controlMedicoEncontrado = buscarControlMedico(id);

            Veterinario veterinario = controlMedicoEncontrado.getVeterinario();
            Diagnostico diagnostico = controlMedicoEncontrado.getDiagnostico();
            InformeMedico informe = controlMedicoEncontrado.getInformeMedico();

            controlMedicoEncontrado = new ControlMedico(veterinario, fechaRegistro, fechaUltimaMod, diagnostico, informe);

            return "Control medico modificado con exito";

        } catch (ArregloVacio | ElementoNoEncontrado e) {
            return e.getMessage();
        }

    }

    public void eliminarControlMedico(int id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        int nuevoIndice = Eliminadores.eliminarElementoControlMedico(controlesMedicos, this.indice, id);

        if (nuevoIndice != this.indice) {
            this.indice = nuevoIndice;
        } else {
            throw new ElementoNoEncontrado();
        }

    }

    public ControlMedico buscarControlMedico(int id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        for (int i = 0; i < this.indice; i++) {
            if (id == controlesMedicos[i].getIdCtrlMedico()) {
                return controlesMedicos[i];
            }
        }

        throw new ElementoNoEncontrado();

    }

    public ControlMedico[] obtenerArreglo() {

        ControlMedico[] controlesMedicosValidos = new ControlMedico[this.indice];

        if (this.indice == 0) {
            return null;
        }

        for (int i = 0; i <= this.indice - 1; i++) {
            controlesMedicosValidos[i] = this.controlesMedicos[i];
        }

        return controlesMedicosValidos;
    }

    public static String[] getColumnas() {
        return new String[]{
            "ID de control medico",
            "Nombre del animal",
            "Nombre veterinario",
            "Fecha de registro",
            "Fecha de ultima modificacion"
        };
    }

}
