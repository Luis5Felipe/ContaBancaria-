import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeCliente = ContaTerminal.lerNomeCliente(input);
        String agencia = ContaTerminal.lerAgencia(input);
        int numeroDaConta = ContaTerminal.lerNumeroDaConta(input);
        double saldo = ContaTerminal.lerSaldo(input);

        ContaTerminal conta = new ContaTerminal(numeroDaConta, agencia, nomeCliente, saldo);
        conta.imprimirInformacao();

        input.close();
    }
}