package application;

public class Account {

    private int numberAccount;
    private String name;
    private double balance;

    public Account(Integer numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }

    public Account(Integer numberAccount, String name, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.name = name;
        deposit(initialDeposit);
    }


    public Integer getNumberAccount() {
        return numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5;
    }


    @Override
    public String toString() {
        return "numberAccount = "
                + numberAccount
                +", name = "
                + name
                +", value = "
                +String.format("%.2f", balance);
    }
}
