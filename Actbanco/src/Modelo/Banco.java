
package Modelo;

public class Banco {
    private String nomBanco;
    private int nummaxSedes;
    private Sede arreglo[];
    private int n;

    public Banco(String nomBanco, int nummaxSedes) {
        this.nomBanco = nomBanco;
        this.nummaxSedes = nummaxSedes;
        this.arreglo = new Sede [this.nummaxSedes];
        this.n = 0;
    }

    public String getNomBanco() {
        return nomBanco;
    }

    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }

    public int getNummaxSedes() {
        return nummaxSedes;
    }

    public void setNummaxSedes(int nummaxSedes) {
        this.nummaxSedes = nummaxSedes;
    }

    public Sede[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Sede[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

   
    
    @Override
   public String toString (){
   return 
   "\n\nDatos del banco:"+"\nNombre del banco: "+this.getNomBanco()+"\nNumero maximo de sedes: "+this.getNummaxSedes();
   }
}
