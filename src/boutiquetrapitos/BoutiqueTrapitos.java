/**
 * Paquete boutiquetrapitos donde estan todas las clases.
 * @author Daniel Serna.
 * @version 06-04-2014.
 */
package boutiquetrapitos;

import Ventanas.VentanaIngreso;

/**
 * Clase BoutiqueTrapitos la cual muestra la ventana principal.
 * @author Daniel Serna.
 */
public class BoutiqueTrapitos {
    public static void main(String[] args) {
        VentanaIngreso vIngreso = new VentanaIngreso();
        vIngreso.setLocationRelativeTo(null);
        vIngreso.setVisible(true);
    }
}