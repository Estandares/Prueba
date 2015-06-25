/**
 * Paquete Boutiquetrapitos donde estan todas las clases.
 * @autor Daniel Serna, Julian Andres Guzman.
 * @version 14-05-2014.
 */
package boutiquetrapitos;

/**
 * Clase Proveedores con las variables privadas.
 * @author Daniel Serna, Julian Andres Guzman.
 */
public class ClaseProveedores {
    private String Nit;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Fax;
    private String Correo;
    private String NomContacto;
    private String TelContacto;
    private String CelContacto;
    private String Oficina;
    private String CorreoContacto;
    
    /**
     * La clase proveedores donde se asignan las variables del formulario proveedores.
     * @param Nit Tipo string que recibe el nit del proveedor.
     * @param Nombre Tipo string que recibe el nombre del proveedor.
     * @param Direccion Tipo string que recibe la dirección del proveedor.
     * @param Telefono Tipo string que recibe el número telefonico del proveedor.
     * @param Fax Tipo string que recibe el fax del proveedor.
     * @param Correo Tipo string que recibe el correo del proveedor.
     * @param NomContacto Tipo string que recibe el nombre de contacto del proveedor.
     * @param TelContacto Tipo string que recibe el número telefonico del contacto del proveedor.
     * @param CelContacto Tipo string que recibe el número celular del contacto del proveedor.
     * @param Oficina Tipo string que recibe la oficina del proveedor.
     * @param CorreoContacto Tipo string que recibe el correo del contacto del proveedor.
     */
    
    public ClaseProveedores(String Nit, String Nombre, String Direccion, String Telefono, String Fax, String Correo, String NomContacto, 
            String TelContacto, String CelContacto, String Oficina, String CorreoContacto){
        this.Nit = Nit;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Fax = Fax;
        this.Correo = Correo;
        this.NomContacto = NomContacto;
        this.TelContacto = TelContacto;
        this.CelContacto = CelContacto;
        this.Oficina = Oficina;
        this.CorreoContacto = CorreoContacto;
    }
    /**
     * El método get para el nit del proveedor.
     * @return El nit del proveedor ingresado por el usuario.
     */
    public String getNit(){
        return Nit;
    }
    /**
     * * El método set del nit del proveedor.
     * @param Nit Tipo String.
     */
    public void setNit(String Nit){
        this.Nit = Nit;
    }
    /**
    * El método get para el nombre del proveedor.
    * @return Nombre del proveedor ingresado por el usuario.
    */
    public String getNombre(){
        return Nombre;
    }
    /**
     * El método set del nombre del proveedor.
     * @param Nombre Tipo String.
     */
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    /**
     * El método get para la dirección del proveedor.
     * @return Dirección del proveedor ingresada por el usuario.
     */
    public String getDireccion(){
        return Direccion;
    }
    /**
     * El método set de la dirección del proveedor.
     * @param Direccion Tipo String.
     */
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    /**
     * El método get para el número telefonico del proveedor.
     * @return Número telefonico del proveedor ingresada por el usuario.
     */
    public String getTelefono(){
        return Telefono;
    }
    /**
     * El método set  del número telefonico del proveedor.
     * @param Telefono Tipo String.
     */
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }
    /**
     * El método get del fax del proveedor.
     * @return Fax del proveedor ingresado por el usuario.
     */
    public String getFax(){
        return Fax;
    }
    /**
     * El método set del fax del proveedor.
     * @param Fax Tipo String.
     */
    public void setFax(String Fax){
        this.Fax = Fax;
    }
    /**
     * El método get del correo del proveedor.
     * @return Correo del proveedor ingresado por el usuario.
     */
    public String getCorreo(){
        return Correo;
    }
    /**
     * El método set del correo del proveedor.
     * @param Correo Tipo String.
     */
    public void setCorreo(String Correo){
        this.Correo= Correo;
    }
    /**
     * El método get del nombre del contacto del proveedor.
     * @return Nombre del Contacto ingresado por el usuario.
     */
    public String getNomContacto(){
        return NomContacto;
    }
    /**
     * El método set del nombre del contacto del proveedor.
     * @param NomContacto Tipo String.
     */
    public void setNomContacto(String NomContacto){
        this.NomContacto = NomContacto;
    }
    /**
     * El método get del número telefonico del contacto del proveedor.
     * @return Número telefonico del contacto del proveedor ingresado por el usuario.
     */
    public String getTelContacto(){
        return TelContacto;
    }
    /**
     * El método set del número del contacto del proveedor.
     * @param TelContacto Tipo String.
     */
    public void setTelContacto(String TelContacto){
        this.TelContacto = TelContacto;
    }
    /**
     * El método get del número de celular del contacto del proveedor.
     * @return Número celular del contacto ingresado por el usuario.
     */
    public String getCelContacto(){
        return CelContacto;
    }
    /**
     * El método set del número de celular del proveedor.
     * @param CelContacto Tipo String.
     */
    public void setCelContacto(String CelContacto){
        this.CelContacto = CelContacto;
    }
    /**
     * El método get de la oficina del proveedor.
     * @return La oficina del proveedor ingresado por el usuario.
     */
    public String getOficina(){
        return Oficina;
    }
    /**
     * El método set de la oficina del proveedor.
     * @param Oficina Tipo String.
     */
    public void setOficina(String Oficina){
        this.Oficina = Oficina;
    }
    /**
     * El método get del correo del contacto del proveedor.
     * @return EL correo del contacto del proveedor.
     */
    public String getCorreoContacto(){
        return CorreoContacto;
    }
    /**
     * El método set del correo del contacto del proveedor.
     * @param CorreoContacto Tipo String.
     */
    public void setCorreoContacto(String CorreoContacto){
        this.CorreoContacto = CorreoContacto;
    }
}