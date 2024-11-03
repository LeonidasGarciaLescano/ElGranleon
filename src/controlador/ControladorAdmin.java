package controlador;

import general.Administrador;
import general.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Area;
import modelo.ArregloArea;
import modelo.Zoologico;
import vista.frmMenuAdmin;

/**
 * @author Leonidas Garcia Lescano
 */

public class ControladorAdmin {

    Administrador administrador;
    frmMenuAdmin vistaAdmin;
     
    
    public ControladorAdmin(Administrador administrador) {
        this.administrador = administrador;
        vistaAdmin = new frmMenuAdmin();        
        
        vistaAdmin.BtnGesVet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ControladorGestVet controladorGestVet = new ControladorGestVet();
               controladorGestVet.run();
            }
        });
             
        vistaAdmin.BtnRegVet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ControladorRegVet controladorRegVet = new ControladorRegVet();
               controladorRegVet.run();
            }
        });
        
        vistaAdmin.BtnVerHist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ControladorVerHist ControladorVerHist = new ControladorVerHist();
               ControladorVerHist.run();
            }
        });
        
    }
    
    public void run () {
        vistaAdmin.setVisible(true);
    }

    
    
}
