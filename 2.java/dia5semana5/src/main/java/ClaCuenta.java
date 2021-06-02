/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 56982
 */
public class ClaCuenta {
    private String Nombre;
    private int Numero;
    private int Saldo;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }
    public ClaCuenta(){
        
    }

    public String getNombre() {
        return Nombre;
    }

    public int getNumero() {
        return Numero;
    }

    public int getSaldo() {
        return Saldo;
    }
    public ClaCuenta(String Nombre, int Numero, int Saldo) {
        this.Nombre = Nombre;
        this.Numero = Numero;
        this.Saldo = Saldo;
    }
    public void Deposito(int monto){
        Saldo=Saldo+monto;
    }
    
    public int Interes(){
        int aux;
        double saldoaux;
        saldoaux=Saldo*0.1;
        aux=(int)saldoaux;
        return aux;
    }
    
        
    public void Giro(int monto){
        if(TieneMonto(monto)){
            Saldo=Saldo-monto;
        }else{
            Saldo=Saldo-monto-Interes();
        }
    }
    
    public boolean TieneMonto(int monto){
        if(Saldo-monto>0){
            return true;
        }else{
            return false;
        }
    }
    public void Transferencia(ClaCuenta destino,int monto,int numcuenta) {
        if(TieneMonto(monto)){
            if(destino.getNumero()==numcuenta){
                destino.Deposito(monto);
                this.Giro(monto);
            }
        }
    }   
        
        
    
    
}
