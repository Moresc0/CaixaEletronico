package Conta;

public class ConsultarSaldo {

    public double saldo = 1000;

    public void consultarSaldo(){
        System.out.println("Seu saldo é "+saldo);
    }

    public double getSaldo() {
        return saldo;
    }
    public void setnewvalue(double valorResultado){
        saldo = valorResultado;
    }

}
