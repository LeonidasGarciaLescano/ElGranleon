package controladorVetZoo;

import estilos.Fuente;
import general.Sistema;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import modeloAnimal.Animal;
import modeloControlMedico.ArregloControlMedico;
import modeloControlMedico.ControlMedico;
import modeloDiagnostico.Diagnostico;
import modeloExamenFisico.ExamenFisico;
import modeloHistoriaMedica.HistoriaMedica;
import modeloInformeMedico.InformeMedico;
import modeloMedicamento.Medicamento;
import modeloSintoma.Sintoma;
import vista.frmRegCtrlMedico;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorRegCtrlMed {

    private frmRegCtrlMedico vistaRegCtrlMed;

    public ControladorRegCtrlMed(Animal animalSel) {
        vistaRegCtrlMed = new frmRegCtrlMedico();
        Fuente.inicializarFuentes("/estilos/resources/Adlam.ttf","/estilos/resources/Geologica.ttf",48f);
        Fuente.aplicarFuentesSelectivas(vistaRegCtrlMed.getContentPane());
        
        vistaRegCtrlMed.TxtAnimal.setText(animalSel.getNombre());

        vistaRegCtrlMed.BtnAñadirDiagnostico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorRegDiag ctrlRegDiag = new ControladorRegDiag(vistaRegCtrlMed.ChbDiagnostico, vistaRegCtrlMed.ChbSintoma,
                        vistaRegCtrlMed.ChbReceta);
                ctrlRegDiag.run();
            }
        });

        vistaRegCtrlMed.BtnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (validarCamposRegMedico()) {
                    String nombreAnimal = vistaRegCtrlMed.TxtAnimal.getText().trim();
                    Double peso = Double.valueOf(vistaRegCtrlMed.TxtPeso.getText().trim());
                    Double talla = Double.valueOf(vistaRegCtrlMed.TxtTalla.getText().trim());
                    String observaciones = String.valueOf(vistaRegCtrlMed.TxtAreaObservaciones.getText().trim());

                    int idNuevo = animalSel.getHistoriaMedica().registrarControlMedico(Sistema.veterinarioSesion, nombreAnimal,
                            new Date(), new Date());

                    ControlMedico ctrlMedico = animalSel.getHistoriaMedica().buscarControlMedico(idNuevo);

                    ctrlMedico.registrarInformeMedico(peso, talla, observaciones);

                    if (vistaRegCtrlMed.ChbDiagnostico.isSelected()) {
                        ctrlMedico.registrarDiagnostico(Sistema.nuevoDiagnostico.getDescripcion(), Sistema.nuevoDiagnostico.getResultado());

                        Diagnostico diagnosticoNuevo = ctrlMedico.getDiagnostico();

                        ExamenFisico examenFisico = Sistema.nuevoDiagnostico.getExamenFisico();

                        if (examenFisico != null) {
                            diagnosticoNuevo.registrarExamenFisico(examenFisico.getEstado(), examenFisico.getTemperaturaCorporal(),
                                    examenFisico.getFrecuenciaCardiaca(), new Date());
                        }

                        if (vistaRegCtrlMed.ChbReceta.isSelected()) {
                            for (Medicamento medicamento : Sistema.nuevoDiagnostico.getMedicamentos().obtenerArreglo()) {
                                diagnosticoNuevo.registrarMedicamento(medicamento.getNombre(), medicamento.getCantidad(),
                                        medicamento.getIntervaloHora(), medicamento.getDias());
                            }
                        }

                        if (vistaRegCtrlMed.ChbSintoma.isSelected()) {
                            for (Sintoma sintoma : Sistema.nuevoDiagnostico.getSintomas().obtenerArreglo()) {
                                diagnosticoNuevo.registrarSintoma(sintoma.getNombre(), sintoma.getGravedad());
                            }
                        }

                    }

                    Sistema.veterinarioSesion.registrarHistoriaMedica(animalSel.getHistoriaMedica());

                    JOptionPane.showMessageDialog(vistaRegCtrlMed, "El control médico se ha registrado correctamente");

                    Sistema.nuevoDiagnostico = null;
                    Sistema.nuevoInformeMedico = null;

                    vistaRegCtrlMed.dispose();
                } else {
                    JOptionPane.showMessageDialog(vistaRegCtrlMed, "Los datos ingresados no son validos");
                    limpiarCamposRegMedico();
                }

            }
        });

    }

    public void run() {
        vistaRegCtrlMed.setVisible(true);
    }

    public boolean validarCamposRegMedico() {
        boolean esValido = true;

        // Obtener valores de los campos
        String nombreAnimal = vistaRegCtrlMed.TxtAnimal.getText().trim();
        String pesoTexto = vistaRegCtrlMed.TxtPeso.getText().trim();
        String tallaTexto = vistaRegCtrlMed.TxtTalla.getText().trim();
        String observaciones = vistaRegCtrlMed.TxtAreaObservaciones.getText().trim();

        // Validar Nombre del Animal
        if (nombreAnimal.isEmpty()) {
            vistaRegCtrlMed.TxtAnimal.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaRegCtrlMed.TxtAnimal.setBackground(Color.WHITE);
        }

        // Validar Peso
        try {
            Double peso = Double.valueOf(pesoTexto);
            vistaRegCtrlMed.TxtPeso.setBackground(Color.WHITE);
        } catch (NumberFormatException e) {
            vistaRegCtrlMed.TxtPeso.setBackground(Color.RED);
            esValido = false;
        }

        // Validar Talla
        try {
            Double talla = Double.valueOf(tallaTexto);
            vistaRegCtrlMed.TxtTalla.setBackground(Color.WHITE);
        } catch (NumberFormatException e) {
            vistaRegCtrlMed.TxtTalla.setBackground(Color.RED);
            esValido = false;
        }

        // Validar Observaciones
        if (observaciones.isEmpty()) {
            vistaRegCtrlMed.TxtAreaObservaciones.setBackground(Color.RED);
            esValido = false;
        } else {
            vistaRegCtrlMed.TxtAreaObservaciones.setBackground(Color.WHITE);
        }

        return esValido;
    }

    public void limpiarCamposRegMedico() {

        vistaRegCtrlMed.TxtAnimal.setBackground(Color.WHITE);

        vistaRegCtrlMed.TxtPeso.setBackground(Color.WHITE);

        vistaRegCtrlMed.TxtTalla.setBackground(Color.WHITE);

        vistaRegCtrlMed.TxtAreaObservaciones.setBackground(Color.WHITE);
    }

}
