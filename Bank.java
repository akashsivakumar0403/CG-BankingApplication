public abstract class Bank {
    String bankName, branchName,bankCode;
    static final String BANK_CODE_PREFIX="BANK-";
    static private int counter=1;

    public Bank(String bankname, String branchName){
        this.bankName=bankname;
        this.branchName=branchName;
        this.bankCode=generateBankCode();
        counter++;
    }

    abstract void openAccount(Account account);
    abstract void displayBankInfo();

    public String generateBankCode(){
        String bankCode=BANK_CODE_PREFIX.concat(String.valueOf(counter));
        return bankCode;
    }
}
