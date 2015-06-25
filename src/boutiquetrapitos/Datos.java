/**
 * Paquete Boutiquetrapitos donde estan todas las clases.
 * @autor Daniel Serna, Julian Andres Guzman
 * @version 04-04-2014
 */
package boutiquetrapitos;

/**
* Clase datos: donde hay un método para validar el ingreso del usuario.
* @author Daniel Serna
*/

public class Datos {
   /**
    * Metodo Booleano para validar usuario.
    * @param usuario tipo string que recibe el usuario.
    * @param contraseña tipo string que recibe la contraseña.
    * @return true = Verdadero e ingresa al aplicativo o false y no ingresa.
    */
    public boolean validarIngreso(String usuario, String contraseña){
        if(usuario.equals("we") && contraseña.equals("123")){
            return true;
        }
        else{
            return false;
        }
    }  
} 
