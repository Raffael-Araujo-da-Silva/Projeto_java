import java.util.Scanner;

public class AccountTest {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Account myAccount = new Account("Rafael Araújo");

        System.out.println("digite seu nome: ");

        //String theName = input.nextLine();
        //myAccount.setName(theName);

        System.out.printf("nome é %s ",myAccount.getName());
    }
}
