package Util;

public class Bank {
    private int account;
    private String name;
    private double deposit;

    public Bank( int account, double deposit){
        this.account = account;
        this.deposit = deposit;
    }
    public Bank(String name, int account, double deposit) {
        this.name = name;
        this.account = account;
        this.deposit = deposit;
    }
    public double getDeposit() {
        return deposit;
    }
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAccount() {
        return account;
    }
    public Bank(int account){
        this.account = account;
    }
    public void addDeposit(double deposit){
        this.deposit += deposit;
    }
    public void withdraw(double deposit){
        this.deposit -= deposit + 5;
    }
    public void totalAccount(double deposit) {
        this.deposit = deposit;
    }
    public String toString(){
        return account
              + ", "
              + "Holder "
              + name
              +", "
              +"Balance "
              +"$ "
              + String.format("%.2f", deposit);
    }

    }

