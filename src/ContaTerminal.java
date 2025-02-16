import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite um numero !");
        int numero = sc.nextInt();
        sc.nextLine();
 
        System.out.println("Por favor, digite o número da Agência");

        String agencia = sc.next();
        sc.nextLine();

        System.out.println("Por favor digite o seu nome !");

        String nomeCliente = sc.nextLine();
        

        System.out.println("Digite o saldo da conta !");

        double saldoDaConta = sc.nextDouble();

        System.out.println("Olá " + nomeCliente +" , obrigado por criar uma conta em nosso banco, sua agência é: " + agencia+", conta: " + numero +" e seu saldo: "+ saldoDaConta +"  já está disponível para saque");
sc.close();
//Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque

    }
}
