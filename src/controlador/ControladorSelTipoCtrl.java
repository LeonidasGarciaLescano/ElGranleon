package controlador;

import modelo.Animal;
import vista.frmSelTipoCtrl;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorSelTipoCtrl {

    private frmSelTipoCtrl vistaSelTipoCtrl;
    Animal animalSel;

    public ControladorSelTipoCtrl(Animal animalSel) {
        vistaSelTipoCtrl = new frmSelTipoCtrl();
        this.animalSel = animalSel;
        //System.out.println(animalSel.getNombre());

    }

    public void run() {
        vistaSelTipoCtrl.setVisible(true);
    }

}
