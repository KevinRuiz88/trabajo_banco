
package Modelo;

public class Sede {
    private String nombre;
    private String direccion;
    private String ciudad;
    private int nummaxdeCuenta;
    private int codigoSede;

    public Sede(String nombre, String direccion, String ciudad, int nummaxdeCuenta, int codigoSede) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.nummaxdeCuenta = nummaxdeCuenta;
        this.codigoSede = codigoSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNummaxdeCuenta() {
        return nummaxdeCuenta;
    }

    public void setNummaxdeCuenta(int nummaxdeCuenta) {
        this.nummaxdeCuenta = nummaxdeCuenta;
    }

    public int getCodigoSede() {
        return codigoSede;
    }

    public void setCodigoSede(int codigoSede) {
        this.codigoSede = codigoSede;
    }

    
    
    @Override
   public String toString (){
   return 
   "\n\nDatos de la sede:"+"\nNombre: "+this.getNombre()+"\nDirección: "+this.getDireccion()
  +"\nCiudad: "+this.getCiudad()+"\nNumero maximo de cuentas: "+this.getNummaxdeCuenta()+"\nCodigo de sede: "+getCodigoSede();
   }          
    
}
