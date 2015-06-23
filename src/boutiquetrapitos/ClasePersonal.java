package boutiquetrapitos;
/**
*Clase Persona de los metodos privados...
* @author Daniel Serna
* @version 23-06-2014
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
     * Constructor.
     * @param Documento
     * @param TipoDoc
     * @param Nombre
     * @param Fecha
     * @param Ciudad
     * @param TipoSangre
     * @param RH
     * @param FechaContrato
     * @param TipoContrato
     * @param Cargo
     * @param Direccion
     * @param Telefono
     * @param Celular
     * @param Correo 
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
     * Son los metodos Get.
     * @return Documento.
     */
    public String getDocumento(){
        return Documento;
    }
    /**
     *  los constructores
     * @param Documento 
     */
    public void setDocumento(String Documento){
        this.Documento = Documento;
    }
    
    public int getTipoDoc(){
        return TipoDoc;
    }
    
    public void setTipoDoc(int TipoDoc){
        this.TipoDoc = TipoDoc;
    }
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getFecha(){
        return Fecha;
    }
    
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }
    public String getCiudad(){
        return Ciudad;
    }
    
    public void setCiudad(String Ciudad){
        this.Ciudad = Ciudad;
    }
    
    public int getTipoSangre(){
        return TipoSangre;
    }
    
    public void setTipoSangre(int TipoSangre){
        this.TipoSangre = TipoSangre;
    }
    
    public int getRH(){
        return RH;
    }
    
    public void setRH(int RH){
        this.RH = RH;
    }
    
    public String getFechaContrato(){
        return FechaContrato;
    }
    
    public void setFechaContrato(String FechaContrato){
        this.FechaContrato = FechaContrato;
    }
    
    public String getTipoContrato(){
        return TipoContrato;
    }
    
    public void setTipoContrato(String TipoContrato){
        this.TipoContrato = TipoContrato;
    }
    
    public String getCargo(){
        return Cargo;
    }
    
    public void setCargo(String Cargo){
        this.Cargo = Cargo;
    }
    
    public String getDireccion(){
        return Direccion;
    }
    
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    
    public String getTelefono(){
        return Telefono;
    }
    
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }
    
    public String getCelular(){
        return Celular;
    }
    
    public void setCelular(String Celular){
        this.Celular = Celular;
    }
    
    public String getCorreo(){
        return Correo;
    }
    
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }
 
}
