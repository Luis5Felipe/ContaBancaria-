import java.util.Scanner;

public class ContaTerminal {
    private final int numeroDaConta;
    private final String agencia;
    private final String nomeCliente;
    private final double saldo;

    public ContaTerminal(int numeroDaConta, String agencia, String nomeCliente, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void imprimirInformacao() {
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma " +
                "conta em nosso banco, " + "sua agência é " + this.agencia + " ," +
                " conta " + this.numeroDaConta + " e seu saldo " + this.saldo + " já está disponível para saque");
    }

    public static int lerNumeroDaConta(Scanner input) {
        while (true) {
            System.out.println("Digite o seu Número da Conta");
            int numeroDaConta = input.nextInt();
            if (numeroDaConta >= 0) {
                System.out.println("Número da conta cadastrado.");
                return numeroDaConta;
            } else {
                System.out.println("Você digitou um número inválido. Tente novamente!");
            }
        }
    }

    public static String lerAgencia(Scanner input) {
        System.out.println("Digite o Nome da agência");
        return input.nextLine();
    }

    public static String lerNomeCliente(Scanner input) {
        System.out.println("Digite o Seu nome");
        return input.nextLine();
    }

    public static double lerSaldo(Scanner input) {
        while (true) {
            System.out.println("Digite o seu saldo");
            double saldo = input.nextDouble();
            if (saldo >= 0) {
                System.out.println("Saldo cadastrado.");
                return saldo;
            } else {
                System.out.println("Você digitou um número inválido. Tente novamente!");
            }
        }
    }
}