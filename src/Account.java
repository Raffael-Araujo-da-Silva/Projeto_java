import javax.swing.JOptionPane;;

public class Account {

    private String name;// variavel de instância
    private double balance;// variavel de instância

    //construtor de Account que recebe dois parâmetros
    public Account(String name, double balance){

        this.name = name;// atribui name à variável de instancia name

        // valida que o balance é maior que 0.00; se não for,
        // a variável de instâmcia balance mantém seu valor inicial padrão de 0.00

        if(balance > 0.00) // se o saldo for válido
            this.balance = balance; // O atribui a variavel de instancia balance
    }

    //método que deposita (adiciona) apenas uma quantia valida no saldo
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.00) // se depositAmount for valido
            balance  = balance + depositAmount; // O adiciona ao saldo
    }

    // metodo retorna o saldo da conta
    public double getBalance()
    {
        return balance;
    }

    // metodo que define o nome
    public void setName( String name)
    {
        this.name = name;
    }

    // metodo que retorna o nome
    public String getName()
    {
        return name;
    }
    
}
