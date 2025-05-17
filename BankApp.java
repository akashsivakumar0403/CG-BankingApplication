import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Bank bank = null;

        System.out.println("Enter bank type\n1. Nationalized\n2. Cooperative");
        int bankType = scn.nextInt();
        scn.nextLine();

        System.out.println("Enter bank name");
        String bankName = scn.nextLine();

        System.out.println("Enter branch name");
        String branchName = scn.nextLine();

        if (bankType == 1) {
            bank = new NationalizedBank(bankName, branchName);
        } else if (bankType == 2) {
            bank = new CooperativeBank(bankName, branchName);
        }

        
        System.out.println("Choose account type:\n1. Savings account\n2. Loan account\n3. Current account");
        int accountType = scn.nextInt();
        scn.nextLine();

        System.out.println("Enter Holder name");
        String holderName = scn.nextLine();

        Account account = null;

        if (accountType == 1) {
            account = new SavingsAccount(holderName);
        } else if (accountType == 2) {
            account = new LoanAccount(holderName);
        } else if (accountType == 3) {
            account = new CurrentAccount(holderName);
        }

        bank.openAccount(account);
        bank.displayBankInfo();
        account.showAccountType();
        while (true) {
            if (account instanceof AccountOperations) {
                AccountOperations ops = (AccountOperations) account;

                System.out.println("Choose action:\n1. Deposit\n2. Withdraw\n3. Balance enquiry");
                int action = scn.nextInt();

                if (action == 1) {
                    System.out.println("Enter amount to deposit:");
                    double amt = scn.nextDouble();
                    ops.deposit(amt);
                    System.out.println("Deposited successfully.");
                } else if (action == 2) {
                    System.out.println("Enter amount to withdraw:");
                    double amt = scn.nextDouble();
                    ops.withdraw(amt);
                    System.out.println("Withdrawn successfully.");
                } else if (action == 3) {
                    System.out.println("Balance: ₹" + ops.getBalance());
                }
            }

            System.out.println("Do you want to perform another account operation? (y/n)");
            scn.nextLine();
            String cont = scn.nextLine();
            if (!cont.equalsIgnoreCase("y")) {
                System.out.println("Thank you for using the Banking App!");
                break;
            }
        }
    }
}
