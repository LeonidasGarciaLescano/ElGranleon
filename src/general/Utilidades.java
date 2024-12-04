package general;

import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modeloAnimal.Animal;
import modeloAnimal.ArregloAnimal;
import modeloControlMedico.ArregloControlMedico;
import modeloHistoriaMedica.ArregloHistoriaMedica;
import modeloMedicamento.ArregloMedicamento;
import modeloVeterinario.ArregloVeterinario;
import modeloControlMedico.ControlMedico;
import modeloControlOperacion.ArregloControlOperacion;
import modeloControlOperacion.ControlOperacion;
import modeloHistoriaMedica.HistoriaMedica;
import modeloMedicamento.Medicamento;
import modeloSintoma.ArregloSintoma;
import modeloSintoma.Sintoma;
import modeloVeterinario.Veterinario;

/**
 * @author Leonidas Garcia Lescano
 */
public class Utilidades {

    public static void llenarTablaVerCtrlMed(JTable tablaCtrlMed) {

        DefaultTableModel model = new DefaultTableModel(ArregloControlMedico.getColumnas(), 0);

        System.out.println(Sistema.veterinarioSesion.getHistoriasMedicas().obtenerArreglo());

        if (Sistema.veterinarioSesion.getHistoriasMedicas().obtenerArreglo() != null) {
            for (HistoriaMedica hist : Sistema.veterinarioSesion.getHistoriasMedicas().obtenerArreglo()) {
                if (hist.getControlesMedicos().obtenerArreglo() != null) {
                    for (ControlMedico ctrlMed : hist.getControlesMedicos().obtenerArreglo()) {
                        model.addRow(ctrlMed.obtenerDatosTabla());
                    }
                }
            }
        }

        tablaCtrlMed.setModel(model);

    }

    public static void llenarTablaVerCtrlOpr(JTable tablaCtrlOpr) {

        DefaultTableModel model = new DefaultTableModel(ArregloControlOperacion.getColumnas(), 0);

        if (Sistema.veterinarioSesion.getHistoriasMedicas().obtenerArreglo() != null) {
            for (HistoriaMedica hist : Sistema.veterinarioSesion.getHistoriasMedicas().obtenerArreglo()) {
                if (hist.getControlesOperaciones().obtenerArreglo() != null) {
                    for (ControlOperacion ctrlOpr : hist.getControlesOperaciones().obtenerArreglo()) {
                        model.addRow(ctrlOpr.obtenerDatosTabla());
                    }
                }

            }
        }

        tablaCtrlOpr.setModel(model);

    }

    public static void llenarTablaAnimales(JTable tablaAnimales) {
        DefaultTableModel model = new DefaultTableModel(ArregloAnimal.getCabecera(), 0);

        for (Animal animal : Sistema.areaVeterinario.getAnimales().obtenerArreglo()) {
            model.addRow(animal.obtenerDatosTabla());
        }

        tablaAnimales.setModel(model);

    }

    public static void llenarTablaMedicamentos(JTable tablaMedicamentos, ArregloMedicamento medicamentos) {
        DefaultTableModel model = new DefaultTableModel(ArregloMedicamento.getColumnas(), 0);

        if (medicamentos.obtenerArreglo() != null) {
            for (Medicamento medicamento : medicamentos.obtenerArreglo()) {
                model.addRow(medicamento.obtenerDatosTabla());
            }
        }

        tablaMedicamentos.setModel(model);

    }

    public static void llenarTablaSintomas(JTable tablaSintomas, ArregloSintoma sintomas) {
        DefaultTableModel model = new DefaultTableModel(ArregloSintoma.getColumnas(), 0);

        if (sintomas.obtenerArreglo() != null) {
            for (Sintoma sintoma : sintomas.obtenerArreglo()) {
                model.addRow(sintoma.obtenerDatosTabla());
            }
        }

        tablaSintomas.setModel(model);

    }

}
