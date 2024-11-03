package modelo;

import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import general.Eliminadores;
import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class ArregloControlMedico {

    private int indice;
    private ControlMedico[] controlesMedicos;

    public ArregloControlMedico() {
        this.indice = 0;
        controlesMedicos = new ControlMedico[10];
    }

    public void registrarControlMedico(Object[] datosCtrlMedico,
            Object[] datosDiagnostico,
            Object[] datosExamenFisico, Object[][] datosSintomas, Object[][] datosMedicamentos) throws IdDuplicado, LimiteAlcanzado {

        String id, idAnimal, idVeterinario;
        Date fechaRegistro, fechaUltimaMod;

        id = (String) datosCtrlMedico[0];
        idAnimal = (String) datosCtrlMedico[1];
        idVeterinario = (String) datosCtrlMedico[2];
        fechaRegistro = (Date) datosCtrlMedico[3];
        fechaUltimaMod = (Date) datosCtrlMedico[4];

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(controlesMedicos[i].getId())) {
                throw new IdDuplicado();
            }
        }

        if (this.indice < this.controlesMedicos.length) {
            this.controlesMedicos[this.indice] = new ControlMedico(id, idAnimal, idVeterinario, fechaRegistro, fechaUltimaMod);
            controlesMedicos[this.indice].registrarDiagnostico(datosDiagnostico, datosExamenFisico, datosSintomas, datosMedicamentos);
            this.indice++;
        } else {
            throw new LimiteAlcanzado();
        }

    }

    public String modificarControlMedico(String idMod, Object[] datosCtrlMedico,
            Object[] datosDiagnostico,
            Object[] datosExamenFisico, Object[][] datosSintomas, Object[][] datosMedicamentos) {

        String resultado;

        String id, idAnimal, idVeterinario;
        Date fechaRegistro, fechaUltimaMod;

        id = (String) datosCtrlMedico[0];
        idAnimal = (String) datosCtrlMedico[1];
        idVeterinario = (String) datosCtrlMedico[2];
        fechaRegistro = (Date) datosCtrlMedico[3];
        fechaUltimaMod = (Date) datosCtrlMedico[4];

        try {
            ControlMedico controlMedico = buscarControlMedico(idMod);

            controlMedico = new ControlMedico(id, idAnimal, idVeterinario, fechaRegistro, fechaUltimaMod);
            controlMedico.registrarDiagnostico(datosDiagnostico, datosExamenFisico, datosSintomas, datosMedicamentos);
            resultado = "Control medico modificado correctamente";

        } catch (ElementoNoEncontrado | ArregloVacio e) {
            resultado = e.getMessage();
        }

        return resultado;

    }

    public void eliminarControlMedico(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        int nuevoIndice = Eliminadores.eliminarElementoControlMedico(controlesMedicos, id);

        if (nuevoIndice != this.indice) {
            this.indice = nuevoIndice;
        } else {
            throw new ElementoNoEncontrado();
        }

    }

    public ControlMedico buscarControlMedico(String id) throws ElementoNoEncontrado, ArregloVacio {

        if (this.indice == 0) {
            throw new ArregloVacio();
        }

        for (int i = 0; i < this.indice; i++) {
            if (id.equals(controlesMedicos[i].getId())) {
                return controlesMedicos[i];
            }
        }

        throw new ElementoNoEncontrado();

    }

}
