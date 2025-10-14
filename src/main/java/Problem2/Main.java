package Problem2;

public class Main {
    public static void main(String[] args) {
        // 1. Create a new bank account
        System.out.println("1. Account Creation:");
        BankAccount account = new BankAccount("123456", "John Doe", 0.0);
        account.getAccountDetails();
        System.out.println();

        // 2. Perform operations
        System.out.println("2. After Deposit:");
        account.deposit(1000.0);
        System.out.println();

        System.out.println("3. After Withdrawal:");
        account.withdraw(500.0);
        System.out.println();

        System.out.println("4. Checking Balance:");
        System.out.println("Current Balance: " + account.checkBalance() + " EGP");
        System.out.println();

        System.out.println("5. Attempt to Withdraw More Than Balance:");
        account.withdraw(600.0);
        System.out.println();

        System.out.println("6. Final Balance Check:");
        System.out.println("Current Balance: " + account.checkBalance() + " EGP");
        
    }
}