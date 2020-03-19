package pooudemy019;

public class Conta {

    private int numeroConta;
    private String titular;
    private double saldo;

    
    public Conta (int numeroConta, String titular, double depositarDinheiro){
        
        this.numeroConta = numeroConta;
        this.titular = titular;
        depositarDinheiro(depositarDinheiro);
    }
      
    public Conta(int numeroConta, String titular){
        
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void depositarDinheiro(double montante){
        saldo += montante;
    }
    
    public void retirarDinheiro(double montante){
       saldo -= montante;
    }

}
