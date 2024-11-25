package Conta;
import java.util.Scanner;

public class RealizarSaque extends ConsultarSaldo {

    Scanner sc = new Scanner(System.in);
    public double saque;

    public void realizarSaque(){
        System.out.println("Digite o valor que deseja sacar: ");
        saque = sc.nextDouble();
        double valorResultado;

        if(saldo>saque){
            valorResultado=saldo-saque;
            setnewvalue(valorResultado);
        }else{
            System.out.println("Você não tem o valor solicitado!");
        }

    }
}
