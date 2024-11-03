package controlador;

import excepciones.IdDuplicado;
import excepciones.LimiteAlcanzado;
import general.GeneradorCodigo;
import general.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import vista.frmRegVet;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorRegVet {

    frmRegVet vistaRegVet;

    public ControladorRegVet() {

        vistaRegVet = new frmRegVet();

        vistaRegVet.BtnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombres, dni, telefono, email, tipo, id, clave;

                nombres = vistaRegVet.TxtNombre.getText();
                dni = vistaRegVet.TxtDni.getText();
                telefono = vistaRegVet.TxtTel.getText();
                email = vistaRegVet.TxtEmail.getText();
                tipo = (String) vistaRegVet.CmbEsp.getSelectedItem();
                
                id = GeneradorCodigo.generarCodigoVeterinario();
                clave = GeneradorCodigo.generarClave();

                String mensaje = "Usuario registrado con id: " + id + " y clave:" + clave;
                
                if ("Cirujano".equals(tipo)) {
                    
                    try {
                        Sistema.veterinariosNoAsignados.registrarVeterinarioCirujano(id, clave, nombres, telefono, email, dni, new Date(), "No asignado");
                    } catch (IdDuplicado | LimiteAlcanzado err) {
                        mensaje = err.getMessage();
                    }
                    
                } else {
                 
                    try {
                        Sistema.veterinariosNoAsignados.registrarVeterinarioZoologico(id, clave, nombres, telefono, email, dni, new Date(), "No asignado");
                    } catch (IdDuplicado | LimiteAlcanzado err) {
                        mensaje = err.getMessage();
                    }
                    
                }
                
                JOptionPane.showMessageDialog(null, mensaje);
                
                
            }
        });

    }

    public void run() {
        vistaRegVet.setVisible(true);
    }

}
