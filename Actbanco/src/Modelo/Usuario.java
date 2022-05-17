
package Modelo;

public class Usuario {
    private String nombre;
    private String apellido;
    private String cc;
    private char sexo;

    public Usuario(String nombre, String apellido, String cc, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        return "\n\nDatos del Usuario:"+"\nNombre: "+this.getNombre()+"\nApellido: "+this.getApellido()
              +"\nCedula: "+this.getCc()+"\nSexo: "+this.getSexo();
    }
}
