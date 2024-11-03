package controlador;

import general.Administrador;
import general.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Area;
import modelo.Veterinario;
import modelo.VeterinarioCirujano;
import modelo.VeterinarioZoologico;
import vista.frmInicioSesion;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorInicio {

    private frmInicioSesion vistaInicio;

    public ControladorInicio() {
        vistaInicio = new frmInicioSesion();

        vistaInicio.BtnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = vistaInicio.TxtId.getText();
                String clave = new String(vistaInicio.TxtClave.getPassword());

                Area areaSesion = null;
                
                boolean sesionAdministrador = false;
                boolean sesionVeterinarioCirujano = false;
                boolean sesionVeterinarioZoologico = false;
                
                for (Administrador administrador : Sistema.administradores) {
                    if (administrador.ingresar(id, clave)) {
                        Sistema.administrador = administrador;
                        sesionAdministrador = true;
                    }
                }

                if (!sesionAdministrador) {
                    for (Area area : Sistema.zoo.getAreaArreglo().getAreas()) {
                        for (Veterinario veterinario : area.getArregloVeterinarios().obtenerArreglo()) {
                            if (veterinario.ingresar(id, clave)) {
                                areaSesion = area;
                                if (veterinario instanceof VeterinarioZoologico) {
                                    sesionVeterinarioZoologico = true;
                                    Sistema.veterinarioZoologico = (VeterinarioZoologico) veterinario;
                                } else {
                                    sesionVeterinarioCirujano = true;
                                    Sistema.veterinarioCirujano = (VeterinarioCirujano) veterinario;
                                }
                                
                            }
                        }
                    }
                    
                } else {
                    ControladorAdmin controladorAdmin = new ControladorAdmin(Sistema.administrador);
                    controladorAdmin.run();
                    vistaInicio.dispose();
                }

                if (sesionVeterinarioCirujano) {
                    ControladorVetCir controladorVetCir = new ControladorVetCir(Sistema.veterinarioCirujano, areaSesion);
                    controladorVetCir.run();
                    vistaInicio.dispose();
                } else if (sesionVeterinarioZoologico) {
                    ControladorVetZoo controladorVetZoo = new ControladorVetZoo(Sistema.veterinarioZoologico, areaSesion);
                    controladorVetZoo.run();
                    vistaInicio.dispose();
                } else {
                    //CONTROLAR CREDENCIALES NO COINCIDENTES
                }

            }
        });

    }

    public void run() {
        vistaInicio.setVisible(true);
    }

}
