package general;

import excepciones.ArregloVacio;
import excepciones.ElementoNoEncontrado;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Animal;
import modelo.ArregloAnimal;
import modelo.ArregloVeterinario;
import modelo.Veterinario;

/**
 * @author Leonidas Garcia Lescano
 */

public class Utilidades {

    public static Object[][] generarDatosTablaVeterinarios(ArregloVeterinario[] arreglosVeterinarios) {
        
        int filas = 0;
        
        for (ArregloVeterinario arregloVet : arreglosVeterinarios) {
            filas += arregloVet.obtenerArreglo().length;
        }
        
        int columnas =  ArregloVeterinario.getCabecera().length;
        
        Object[][] data = new Object[filas][columnas];
        
        int i = 0;
        for (ArregloVeterinario arregloVet : arreglosVeterinarios) {
            for (Veterinario veterinario : arregloVet.obtenerArreglo()) {
                data[i] = veterinario.obtenerDatosTabla();
                i++;
            }
        }
        
        return data;
        
    }
    
    public static Object[][] generarDatosTablaAnimales(ArregloAnimal[] arreglosAnimales) {
        
        int filas = 0;
        
        for (ArregloAnimal arregloAni : arreglosAnimales) {
            filas += arregloAni.obtenerArreglo().length;
        }
        
        int columnas =  ArregloAnimal.getCabecera().length;
        
        Object[][] data = new Object[filas][columnas];
        
        int i = 0;
        for (ArregloAnimal arregloAni : arreglosAnimales) {
            for (Animal animal : arregloAni.obtenerArreglo()) {
                data[i] = animal.obtenerDatosTabla();
                i++;
            }
        }
        
        return data;
        
    }
    
    public static void llenarTabla(JTable tabla, String[] columnas, Object[][] data) {
        
        DefaultTableModel model = new DefaultTableModel(data, columnas);
        
        tabla.setModel(model);
        
    }
    
    public static Animal buscarAnimal(ArregloAnimal[] arreglosAnimales, String id) {
        
        Animal animalEncontrado = null;
        
        for (ArregloAnimal arregloAni : arreglosAnimales) {
            
            try {
                animalEncontrado = arregloAni.buscarAnimal(id);
            } catch (ElementoNoEncontrado | ArregloVacio e) {
                System.out.println(e.getMessage());
            }
            
        }
        
        return animalEncontrado;
    }
    
}
