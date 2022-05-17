
package Modelo;

public class Cuenta {
    private int numCuenta;
    private String tipoCuenta;
    private String titular;
    private Double saldoinicial;
    private Double saldo;

    public Cuenta(int numCuenta, String tipoCuenta, String titular, Double saldoinicial, Double saldo) {
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
        this.titular = titular;
        this.saldoinicial = saldoinicial;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldoinicial() {
        return saldoinicial;
    }

    public void setSaldoinicial(Double saldoinicial) {
        this.saldoinicial = saldoinicial;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

   
    
     @Override
   public String toString (){
   return 
   "\n\nDatos de la cuenta:"+"\nNumero de cuenta: "+this.getNumCuenta()+"\nTipo de cuenta: "+this.getTipoCuenta()
  +"\nTitular: "+this.getTitular()+"\nSaldo inicial: "+this.getSaldoinicial()+"\nSaldo: "+getSaldo();
   }
}
