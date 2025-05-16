public class SavingsAccount extends Account implements AccountOperations{
    public SavingsAccount(String holderName){
        super(holderName);
    }
    @Override
    void showAccountType() {
        System.out.println("Account type: Savings");
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
