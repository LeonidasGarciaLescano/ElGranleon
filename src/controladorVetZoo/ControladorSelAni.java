package controladorVetZoo;

import general.Sistema;
import general.Utilidades;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modeloAnimal.Animal;
import modeloAnimal.ArregloAnimal;
import vista.frmSelAnimalAreaCtrlMedico;
import vista.frmSelCtrlMedico;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorSelAni {
    
    private frmSelAnimalAreaCtrlMedico vistaSelAnimal;
    
    public ControladorSelAni() {
        vistaSelAnimal = new frmSelAnimalAreaCtrlMedico();
        
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
                        ControladorRegCtrlMed ctrlGenCtrlMed = new ControladorRegCtrlMed(animalSel);
                        ctrlGenCtrlMed.run();
                    }
                    
                }
            }
        });
        
    }
    
    public void run() {
        vistaSelAnimal.setVisible(true);
    }
    
}
