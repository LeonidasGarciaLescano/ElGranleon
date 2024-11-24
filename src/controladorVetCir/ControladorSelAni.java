package controladorVetCir;

import controladorVetZoo.ControladorRegCtrlMed;
import estilos.Fuente;
import general.Sistema;
import general.Utilidades;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modeloAnimal.Animal;
import modeloAnimal.ArregloAnimal;
import vista.frmSelAnimalAreaCtrlOperacion;

/**
 * @author Leonidas Garcia Lescano
 */

public class ControladorSelAni {

    private frmSelAnimalAreaCtrlOperacion vistaSelAnimal;
    
    public ControladorSelAni() {
        vistaSelAnimal = new frmSelAnimalAreaCtrlOperacion();
        Fuente.inicializarFuentes("/estilos/resources/Adlam.ttf","/estilos/resources/Geologica.ttf",48f);
        Fuente.aplicarFuentesSelectivas(vistaSelAnimal.getContentPane());
        vistaSelAnimal.LblTitulo.setText("Animales de " + Sistema.areaVeterinario.getNombreArea());
        
        Utilidades.llenarTablaAnimales(vistaSelAnimal.TblAnimalesArea);
        
        vistaSelAnimal.TblAnimalesArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = vistaSelAnimal.TblAnimalesArea.rowAtPoint(e.getPoint());
                
                if (fila >= 0) {
                    String id = (String) vistaSelAnimal.TblAnimalesArea.getValueAt(fila, 0);
                    
                    ArregloAnimal animalesArea = Sistema.areaVeterinario.getAnimales();
                    
                    Animal animalSel = null;
                    
                    for (Animal animal : animalesArea.obtenerArreglo()) {
                        if (animal.getId().equals(id)) {
                            animalSel = animal;
                            break;
                        }
                    }
                    
                    if (animalSel != null) {
                        ControladorRegCtrlOpr ctrlGenCtrlOpr = new ControladorRegCtrlOpr(animalSel);
                        ctrlGenCtrlOpr.run();
                    }
                    
                }
            }
        });
        
    }
    
    public void run() {
        vistaSelAnimal.setVisible(true);
    }
    
}
