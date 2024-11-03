package controlador;

import general.Sistema;
import general.Utilidades;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import modelo.Animal;
import modelo.ArregloAnimal;
import vista.frmSelAnimal;

/**
 * @author Leonidas Garcia Lescano
 */
public class ControladorVerHist {

    frmSelAnimal vistaSelAni;

    public ControladorVerHist() {
        this.vistaSelAni = new frmSelAnimal();

        Object[][] data = Utilidades.generarDatosTablaAnimales(Sistema.animales);
        Utilidades.llenarTabla(vistaSelAni.TblAnimales, ArregloAnimal.getCabecera(), data);

        vistaSelAni.TblAnimales.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = vistaSelAni.TblAnimales.rowAtPoint(e.getPoint()); // Obtener la fila donde se hizo clic
                int column = 0;

                // Si se hizo doble clic en una celda
                if (e.getClickCount() == 1 && row >= 0) {
                    Animal animalSel = Utilidades.buscarAnimal(Sistema.animales, (String) vistaSelAni.TblAnimales.getValueAt(row, column));
                    ControladorSelTipoCtrl controladorSelTipoCtrl = new ControladorSelTipoCtrl(animalSel);
                    controladorSelTipoCtrl.run();
                }
            }
        });
        
    }

    public void run() {
        vistaSelAni.setVisible(true);
    }

}
