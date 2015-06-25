/**
 * Paquete Boutiquetrapitos donde estan todas las clases.
 * @autor Daniel Serna, Julian Andres Guzman.
 * @version 04-04-2014.
 */
package boutiquetrapitos;
/**
 * Clase usuarios con las variables privadas.
 * @author Daniel Serna.
 */
public class ClaseUsuarios {
    private String NumCedula;
    private String NomUsuario;
    private String Correo;
    private String PreguntaSecreta;
    private String Respuesta;
    private String Contraseña;
    private int Perfil;
    
    /**
     * La clase usuarios donde se asignan las variables del formulario Usuarios.
     * @param NumCedula Tipo string que recibe el número de cedula.
     * @param NomUsuario Tipo string que recibe el nombre.
     * @param Correo Tipo string que recibe el correo.
     * @param PreguntaSecreta Tipo string que recibe la pregunta secreta. 
     * @param Respuesta Tipo string que recibe la respuesta de la pregunta secreta.
     * @param Contraseña Tipo string que recibe la contraseña.
     * @param Perfil Tipo int que recibe el perfil.
     */

    public ClaseUsuarios(String NumCedula, String NomUsuario, String Correo, String PreguntaSecreta, String Respuesta, String Contraseña, int Perfil) {
        this.NumCedula = NumCedula;
        this.NomUsuario = NomUsuario;
        this.Correo = Correo;
        this.PreguntaSecreta = PreguntaSecreta;
        this.Respuesta = Respuesta;
        this.Contraseña = Contraseña;
        this.Perfil = Perfil;
    }

    /**
     * El método get para el número de la cedula del usuario.
     * @return El número de cedula ingresado por el usuario.
     */
    public String getNumCedula() {
        return NumCedula;
    }
    /**
    * El método set del número de cedula. 
    * @param NumCedula Tipo String.
    */
    public void setNumCedula(String NumCedula) {
        this.NumCedula = NumCedula;
    }
    /**
     *El método get del nombre del usuario. 
     * @return el nombre ingresado por el usuario.
     */

    public String getNomUsuario() {
        return NomUsuario;
    }
    /**
     * El método set del nombre del usuario
     * @param NomUsuario Tipo String.
     */

    public void setNomUsuario(String NomUsuario) {
        this.NomUsuario = NomUsuario;
    }
    /**
     * El método get del correo del usuario.
     * @return el correo ingresado por usuario.
     */

    public String getCorreo() {
        return Correo;
    }
    /**
     * El método set del correo del usuario.
     * @param Correo Tipo String.
     */

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    /**
     * El método get de la pregunta secreta.
     * @return la pregunta secreta ingresada por el usuario.
     */

    public String getPreguntaSecreta() {
        return PreguntaSecreta;
    }
    /**
     * El método set de la pregunta secreta del usuario.
     * @param PreguntaSecreta Tipo String.
     */

    public void setPreguntaSecreta(String PreguntaSecreta) {
        this.PreguntaSecreta = PreguntaSecreta;
    }
    /**
     * El método get de la respuesta secreta. 
     * @return la respuesta secreta ingresada por el usuario.
     */

    public String getRespuesta() {
        return Respuesta;
    }
    /**
     * El método set de la respuesta secreta del usuario.
     * @param Respuesta Tipo String.
     */

    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }
    /**
     * El método get de la contraseña del usuario.   
     * @return la contraseña ingresada por el usuario.
     */

    public String getContraseña() {
        return Contraseña;
    }
    /**
     * El método set de la contraseña del usuario.
     * @param Contraseña Tipo String. 
     */

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    /**
     * El método get del perfil.
     * @return el perfil del usuario.
     */

    public int getPerfil() {
        return Perfil;
    }
    /**
     * El método set del perfil del usuario.
     * @param Perfil Tipo String.
     */

    public void setPerfil(int Perfil) {
        this.Perfil = Perfil;
    }
}