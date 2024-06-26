import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;      

        System.out.print("Informe o número da conta: ");
        numero = scanner.nextInt();

        System.out.print("Informe a agência: ");
        agencia = scanner.next();

        System.out.print("Informe o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.print("Informe o saldo inicial: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
