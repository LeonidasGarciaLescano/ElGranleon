package controladorVetCir;

import controladorVetZoo.ControladorVerModCtrlMedico;
import general.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import vista.frmMenuCtrlMedico;
import vista.frmMenuCtrlOperacion;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorMainMenu {

    private frmMenuCtrlOperacion vistaMenuCtrlOperacion;

    public ControladorMainMenu() {
        vistaMenuCtrlOperacion = new frmMenuCtrlOperacion();

        setSaludo(Sistema.veterinarioSesion.getNombres());

        vistaMenuCtrlOperacion.BtnVerCtrlOpr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorVerCtrlOperaciones ctrlVerCtrlOprs = new ControladorVerCtrlOperaciones();
                ctrlVerCtrlOprs.run();

            }
        });

        vistaMenuCtrlOperacion.BtnGenCtrlOpr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorSelAni ctrlSelAni = new ControladorSelAni();
                ctrlSelAni.run();

            }
        });

        vistaMenuCtrlOperacion.BtnModCtrlOpr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorVerModCtrlOperacion ctrlVerModCtrlMed = new ControladorVerModCtrlOperacion();
                ctrlVerModCtrlMed.run();

            }
        });

        vistaMenuCtrlOperacion.BtnDelCtrlOpr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorElimCtrlOperacion ctrlDelCtrlMed = new ControladorElimCtrlOperacion();
                ctrlDelCtrlMed.run();

            }
        });

    }

    public void run() {
        vistaMenuCtrlOperacion.setVisible(true);
    }

    private void setSaludo(String nombre) {
        LocalTime currentTime = LocalTime.now();
        String saludo;

        if (currentTime.isBefore(LocalTime.NOON)) {
            saludo = "¡Buenos días, " + nombre + "!";
        } else if (currentTime.isBefore(LocalTime.of(18, 0))) {
            saludo = "¡Buenas tardes, " + nombre + "!";
        } else {
            saludo = "¡Buenas noches, " + nombre + "!";
        }

        vistaMenuCtrlOperacion.LblSaludo.setText(saludo);
    }

}
