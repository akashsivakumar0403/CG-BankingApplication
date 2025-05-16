public abstract class Account {
    String accountNumber;
    private String holderName;
    protected double balance;
    protected static int accountCounter=0;

    public Account(String holderName){
        accountNumber=holderName.concat(String.valueOf(accountCounter));
        this.holderName=holderName;
        accountCounter++;
        balance=0;
    }

    abstract void showAccountType();
}
