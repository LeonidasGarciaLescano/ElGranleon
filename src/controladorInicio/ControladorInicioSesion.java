package controladorInicio;

import general.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modeloArea.Area;
import modeloVeterinario.Veterinario;
import modeloVeterinario.VeterinarioCirujano;
import vista.frmInicioSesion;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorInicioSesion {

    private frmInicioSesion vistaInicioSesion;

    public ControladorInicioSesion() {
        vistaInicioSesion = new frmInicioSesion();

        vistaInicioSesion.BtnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Area areaDeVet = null;
                Veterinario vet = null;

                String id = vistaInicioSesion.TxtId.getText();

                char[] password = vistaInicioSesion.TxtClave.getPassword();
                String clave = new String(password);

                for (Area area : Sistema.areas.obtenerArreglo()) {
                    for (Veterinario veterinario : area.getArregloVeterinarios().obtenerArreglo()) {
                        if (veterinario.ingresar(id, clave)) {
                            vet = veterinario;
                            areaDeVet = area;
                            break;
                        }
                    }
                }

                if (vet != null) {
                    Sistema.veterinarioSesion = vet;
                    Sistema.areaVeterinario = areaDeVet;

                    vistaInicioSesion.dispose();

                    if (vet instanceof VeterinarioCirujano) {
                        controladorVetCir.ControladorMainMenu ctrlMainCtrlOpr = new controladorVetCir.ControladorMainMenu();
                        ctrlMainCtrlOpr.run();
                    } else {
                        controladorVetZoo.ControladorMainMenu ctrlMainCtrlMed = new controladorVetZoo.ControladorMainMenu();
                        ctrlMainCtrlMed.run();
                    }
                } else {
                    JOptionPane.showMessageDialog(vistaInicioSesion, "Las crendenciales son invalidas");
                }

            }
        });

    }

    public void run() {
        vistaInicioSesion.setVisible(true);
    }

}
