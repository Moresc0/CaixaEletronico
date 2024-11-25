import Conta.ConsultarSaldo;
import Conta.RealizarSaque;

import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsultarSaldo saldo = new ConsultarSaldo();
        RealizarSaque saque = new RealizarSaque();
        int opcao;

        do{
            System.out.println("**********************************");
            System.out.println("* Bem vindo ao ratatouille bank! *");
            System.out.println("*  1 - Consultar Saldo           *");
            System.out.println("*  2 - Realizar Saque            *");
            System.out.println("*  3 - Realizar Depósito         *");
            System.out.println("*  0 - Sair                      *");
            System.out.println("**********************************");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                        saldo.consultarSaldo();
                    break;
                case 2:
                        saque.realizarSaque();
                    break;
                case 3:

                    break;
                case 0:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }while (opcao != 0);


        sc.close();
    }
}
