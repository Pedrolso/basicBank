package application;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account ac;

        System.out.println("digite numero da conta");
        int numeroConta = sc.nextInt();

        sc.nextLine();
        System.out.println("digite seu nome");
        String nome = sc.nextLine();

        System.out.println("voce quer fazer deposito inicial (y/n)?");
        String confirmacao = sc.nextLine();


        if(confirmacao.equals("y")){
            System.out.println("digite valor para depositar");
            double valor = sc.nextDouble();
            ac = new Account(numeroConta, nome, valor);
        }else{
            ac = new Account(numeroConta, nome);
        }

        System.out.println(ac);

        System.out.println("digite valor de deposito atual: ");
        ac.deposit(sc.nextDouble());

        System.out.println(ac);

        System.out.println("digite valor do saque: ");
        ac.withdraw(sc.nextDouble());

        System.out.println(ac);

        sc.close();

    }
}
