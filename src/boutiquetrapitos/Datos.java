
package boutiquetrapitos;

/**
* Constructor de la clase datos
* @author Daniel Serna
*/

public class Datos {
   /**
    * Metodo Booleano para validar usuario
    * @param usuario
    * @param contraseña
    * @return true = Verdadero e ingresa al aplicativo.
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
