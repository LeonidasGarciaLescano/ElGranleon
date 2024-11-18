package controladorVetZoo;

import general.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import modeloArea.Area;
import modeloVeterinario.Veterinario;
import modeloVeterinario.VeterinarioCirujano;
import vista.frmMenuCtrlMedico;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorMainMenu {
    
    private frmMenuCtrlMedico vistaMenuCtrlMed;
    
    public ControladorMainMenu() {
        vistaMenuCtrlMed = new frmMenuCtrlMedico();
        
        setSaludo(Sistema.veterinarioSesion.getNombres());
        
        vistaMenuCtrlMed.BtnVerCtrlMed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ControladorVerCtrlMedicos ctrlVerCtrlMed = new ControladorVerCtrlMedicos();
                ctrlVerCtrlMed.run();
                
            }
        });
        
        vistaMenuCtrlMed.BtnGenCtrlMed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ControladorSelAni ctrlSelAni = new ControladorSelAni();
                ctrlSelAni.run();
                
            }
        });
        
        vistaMenuCtrlMed.BtnModCtrlMed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ControladorVerModCtrlMedico ctrlVerModCtrlMed = new ControladorVerModCtrlMedico();
                ctrlVerModCtrlMed.run();
                
            }
        });
        
        vistaMenuCtrlMed.BtnDelCtrlMed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ControladorElimCtrlMedico ctrlDelCtrlMed = new ControladorElimCtrlMedico();
                ctrlDelCtrlMed.run();
                
            }
        });
        
    }
    
    public void run() {
        vistaMenuCtrlMed.setVisible(true);
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
        
        vistaMenuCtrlMed.LblSaludo.setText(saludo);
    }
    
}
