import java.util.ArrayList;

public class CooperativeBank extends Bank{
    public CooperativeBank(String bankName,String branchName){
        super(bankName,branchName);
    }
    private ArrayList<Account> accounts=new ArrayList<>();
    @Override
    void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Added cooperative account");
    }

    @Override
    void displayBankInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branchName);
        System.out.println("Bank Code: " + bankCode);
    }
}
