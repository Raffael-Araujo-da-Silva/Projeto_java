import java.util.Scanner;

public class AccountTest {
    
    public static void main(String[] args){

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account("Rafael Araújo", 600.00);

        // Exibe saldo inicial de cada objeto
        System.out.printf("nome: %s%nsaldo: %.2f%n", myAccount.getName(), myAccount.getBalance());

        System.out.print("Digite um valor para deposito: ");// prompt        
              

        Double depositAmount = input.nextDouble();// obtém a entrada do usuário

        myAccount.deposit(depositAmount); // adiciona o saldo de account1ÿ

        // Exibe saldo inicial de cada objeto
        System.out.printf("nome: %s%nsaldo: %.2f", myAccount.getName(), myAccount.getBalance());
    }
}
