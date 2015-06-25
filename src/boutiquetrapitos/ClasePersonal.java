/**
 * Paquete Boutiquetrapitos donde estan todas las clases.
 * @autor Julian Andres Guzman.
 * @version 20-05-2014.
 */
package boutiquetrapitos;
/**
 * Clase Personal con las variables privadas.
 * @author Julian Andres Guzman.
 */
public class ClasePersonal {
    private String Documento;
    private int TipoDoc;
    private String Nombre;
    private String Fecha;
    private String Ciudad;
    private int TipoSangre;
    private int RH;
    private String FechaContrato;
    private String TipoContrato;
    private String Cargo;
    private String Direccion;
    private String Telefono;
    private String Celular;
    private String Correo;

    /**
     * La clase personal donde se asignan las variables del formulario personal.
     * @param Documento Tipo string que recibe el documento del personal.
     * @param TipoDoc Tipo int que recibe el tipo de documento del personal.
     * @param Nombre Tipo string que recibe el nombre del personal.
     * @param Fecha Tipo string que recibe la fecha de nacimiento del personal.
     * @param Ciudad Tipo string que recibe la ciudad del personal.
     * @param TipoSangre Tipo int que recibe el tipo de sangre del personal.
     * @param RH Tipo int que recibe el tipo de RH del personal.
     * @param FechaContrato Tipo string que recibe la fecha del contrato del personal.
     * @param TipoContrato Tipo string que recibe el tipo de contrato del personal.
     * @param Cargo Tipo string que recibe el cargo del personal.
     * @param Direccion Tipo string que recibe la dirrección del personal.
     * @param Telefono Tipo string que recibe el número telefonico del personal.
     * @param Celular Tipo string que recibe el número de celular del personal.
     * @param Correo Tipo string que recibe el correo del personal.
     */
    public ClasePersonal(String Documento, int TipoDoc, String Nombre, String Fecha, String Ciudad, int TipoSangre, int RH, String FechaContrato, String TipoContrato, String Cargo, String Direccion, String Telefono, String Celular, String Correo){
        
        this.Documento = Documento;
        this.TipoDoc = TipoDoc;
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Ciudad = Ciudad;
        this.TipoSangre = TipoSangre;
        this.RH = RH;
        this.FechaContrato = FechaContrato;
        this.TipoContrato = TipoContrato;
        this.Cargo = Cargo;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.Correo = Correo;
    }
    /**
     * El método get para el documento del personal.
     * @return El documento ingresado por el usuario.
     */
    public String getDocumento(){
        return Documento;
    }
    /**
     * El método set del documento del personal.
     * @param Documento Tipo String
     */
    public void setDocumento(String Documento){
        this.Documento = Documento;
    }
    /**
     * El método get para el tipo de documento del personal.
     * @return El tipo de documento ingresado por el usuario.
     */
    public int getTipoDoc(){
        return TipoDoc;
    }
    /**
     * El método set del tipo de documento del personal.
     * @param TipoDoc Tipo int.
     */
    public void setTipoDoc(int TipoDoc){
        this.TipoDoc = TipoDoc;
    }
    /**
     * El método get para el nombre del personal.
     * @return El nombre del personal ingresado por el usuario.
     */
    public String getNombre(){
        return Nombre;
    }
    /**
     * El método set del nombre del personal.
     * @param Nombre Tipo String.
     */
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    /**
     * El método get para la fecha de nacimiento del personal.
     * @return La fecha de nacimiento del personal ingresada por el usuario.
     */
    public String getFecha(){
        return Fecha;
    }
    /**
     * El método set de la fecha de nacimiento del personal.
     * @param Fecha Tipo String.
     */
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }
    /**
     * El método get para la ciudad del personal.
     * @return La cuidad del personal ingresada por el usuario.
     */
    public String getCiudad(){
        return Ciudad;
    }
    /**
     * El método set de la ciudad del personal.
     * @param Ciudad Tipo String.
     */
    public void setCiudad(String Ciudad){
        this.Ciudad = Ciudad;
    }
    /**
     * El método get para el tipo de sangre del personal.
     * @return El tipo de sangre del personal ingresado por el usuario.
     */
    public int getTipoSangre(){
        return TipoSangre;
    }
    /**
     * El método set del tipo de sangra del personal.
     * @param TipoSangre Tipo int.
     */
    public void setTipoSangre(int TipoSangre){
        this.TipoSangre = TipoSangre;
    }
    /**
     * El método get para el RH del personal.
     * @return El RH del personal ingresado por el usuario.
     */
    public int getRH(){
        return RH;
    }
    /**
     * El método set del RH del personal.
     * @param RH Tipo int.
     */
    public void setRH(int RH){
        this.RH = RH;
    }
    /**
     * El método get de la fecha de contrato del personal.
     * @return La fecha de contrato ingresada por el usuario.
     */
    public String getFechaContrato(){
        return FechaContrato;
    }
    /**
     * El método set de la fecha del contrato del personal.
     * @param FechaContrato Tipo String.
     */
    public void setFechaContrato(String FechaContrato){
        this.FechaContrato = FechaContrato;
    }
    /**
     * El método get del tipo de contrato del personal.
     * @return El tipo de contrato del personal ingresado por el usuario.
     */
    public String getTipoContrato(){
        return TipoContrato;
    }
    /**
     * El método set del tipo de contrato del personal.
     * @param TipoContrato Tipo String.
     */
    public void setTipoContrato(String TipoContrato){
        this.TipoContrato = TipoContrato;
    }
    /**
     * El método get del cargo del empleado.
     * @return El tipo de cargo del empleado ingresado por el usuario.
     */
    public String getCargo(){
        return Cargo;
    }
    /**
     * El método set del tipo de cargo del personal.
     * @param Cargo Tipo String.
     */
    public void setCargo(String Cargo){
        this.Cargo = Cargo;
    }
    /**
     * El método get de la dirección del personal.
     * @return La dirección del personal ingreada por el usuario.
     */
    public String getDireccion(){
        return Direccion;
    }
    /**
     * El método set de la dirección del personal.
     * @param Direccion Tipo String.
     */
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    /**
     * El método get del número telefonico del personal.
     * @return El número telefonico del personal ingresado por el usuario.
     */
    public String getTelefono(){
        return Telefono;
    }
    /**
     * El método set del número telefonico del personal.
     * @param Telefono Tipo String.
     */
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }
    /**
     * El método get del número de celular del personal.
     * @return El número del celular del personal ingresado por el usuario.
     */
    public String getCelular(){
        return Celular;
    }
    /**
     * El método set del número de celular del personal.
     * @param Celular Tipo String.
     */
    public void setCelular(String Celular){
        this.Celular = Celular;
    }
    /**
     * El método get del correo del personal.
     * @return El correo del personal ingresado por el usuario.
     */
    public String getCorreo(){
        return Correo;
    }
    /**
     * El método set del correo del personal.
     * @param Correo Tipo String.
     */
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }
}