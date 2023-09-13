import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        String agencia = "", nomeCliente = "";
        double saldo;

        System.out.print("Bem vindo ao Banco Dio, digite seus dados para criar uma conta ");
        System.out.println("");
        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = entrada.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        agencia = entrada.nextLine();

        System.out.print("Por favor, digite um número para sua conta: ");
        numero = entrada.nextInt();

        System.out.print("Por favor, deposite um valor para finalizar seu cadastro: ");
        saldo = entrada.nextDouble();


        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
