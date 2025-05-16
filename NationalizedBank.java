import java.util.ArrayList;

public class NationalizedBank extends Bank{
    public NationalizedBank(String bankName, String branchName){super(bankName,branchName);}
    private ArrayList<Account> accounts=new ArrayList<>();
    @Override
    void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Added nationalised account");
    }

    @Override
    void displayBankInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branchName);
        System.out.println("Bank Code: " + bankCode);
    }
}
