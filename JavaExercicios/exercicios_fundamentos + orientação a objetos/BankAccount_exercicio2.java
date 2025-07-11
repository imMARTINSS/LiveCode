public class BankAccount_exercicio2 {
    private final String name;
    private final int accountNumber;
    private double saldo;

    public BankAccount_exercicio2(String name, int accountNumber, double saldo){
        this.name = name;
        this.accountNumber = accountNumber;
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(int valor){
        this.saldo += valor;
    }

    public void sacar(int valor){
        if(saldo > 0 && valor <= saldo) saldo -= valor;
        else {System.out.println("Saldo da conta insuficiente");}
    }

    public String dadosConta(){
        return String.format("Name: %s\nNumero da Conta: %d\nSaldo %.2f\n", name, accountNumber, saldo);
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nNumero da Conta: %d\nSaldo %.2f\n", name, accountNumber, saldo);
    }

    public static void main(String[] args){
        var client = new BankAccount_exercicio2("martins", 32423, 10000);

        System.out.println(client.dadosConta());
        client.sacar(100);
        System.out.println(client.dadosConta());
        client.depositar(100);
        System.out.println(client.dadosConta());


    }
}
