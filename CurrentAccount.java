public class CurrentAccount extends Account implements AccountOperations{
    public CurrentAccount(String holderName){
        super(holderName);
    }
    @Override
    void showAccountType() {
        System.out.println("Account type: Current");
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public double getBalance(){
        return balance;
    }
}
