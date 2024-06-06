import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " +
                numero + " e seu saldo " + saldo + " já está disponível para saque.");



    }
}
