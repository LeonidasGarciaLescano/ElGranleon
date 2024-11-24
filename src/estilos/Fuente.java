/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estilos;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class Fuente {
    private static Font fuentePrincipal; // Fuente personalizada
    private static Font fuenteSecundaria; // Otra fuente o predeterminada

    // Método para inicializar fuentes
    public static void inicializarFuentes(String rutaFuentePrincipal, String rutaFuenteSecundaria, float tamañoPorDefecto) {
        try (InputStream isPrincipal = Fuente.class.getResourceAsStream(rutaFuentePrincipal); InputStream isSecundaria = Fuente.class.getResourceAsStream(rutaFuenteSecundaria)) {

            fuentePrincipal = Font.createFont(Font.TRUETYPE_FONT, isPrincipal).deriveFont(tamañoPorDefecto);
            fuenteSecundaria = Font.createFont(Font.TRUETYPE_FONT, isSecundaria).deriveFont(tamañoPorDefecto);

        } catch (FontFormatException | IOException e) {
            System.err.println("Error al cargar las fuentes: " + e.getMessage());
            fuentePrincipal = new Font("SansSerif", Font.PLAIN, (int) tamañoPorDefecto);
            fuenteSecundaria = new Font("Serif", Font.PLAIN, (int) tamañoPorDefecto); // Fuente alternativa
        }
    }

    // Obtener la fuente principal
    public static Font obtenerFuentePrincipal(float tamaño) {
        return fuentePrincipal.deriveFont(tamaño);
    }

    // Obtener la fuente secundaria
    public static Font obtenerFuenteSecundaria(float tamaño) {
        return fuenteSecundaria.deriveFont(tamaño);
    }

    // Aplicar fuentes de forma selectiva
    public static void aplicarFuentesSelectivas(Component componente) {
        float tamañoFuente = componente.getFont() != null ? componente.getFont().getSize2D() : 14f;
        switch (componente) {
            case JLabel label -> label.setFont(obtenerFuentePrincipal(tamañoFuente));
            case JButton boton -> boton.setFont(obtenerFuenteSecundaria(tamañoFuente));
            case JTable tabla -> tabla.setFont(obtenerFuenteSecundaria(tamañoFuente));
            default -> componente.setFont(obtenerFuentePrincipal(tamañoFuente));
        }
        if (componente instanceof Container container) {
            for (Component child : container.getComponents()) {
                aplicarFuentesSelectivas(child);
            }
        }
    }
}
