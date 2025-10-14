package Problem2;
public class BankAccount {
    private String accountNumber; 
    private String holderName;       
    private double balance;          

    public BankAccount(String accountNumber, String holderName, double balance) { 
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) { 
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0){
            this.balance = balance;
        }
        else{
            this.balance = 0;
            System.out.println("enter a valid balance");
        }
    }
    
    public void getAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.holderName);
        System.out.println("Current Balance: " + this.balance + " EGP");
    }
    
    public double checkBalance(){
        return this.balance;
    }
    
    public void deposit(double amount){
        if(amount > 0){
            double n = this.getBalance() + amount;  
            this.setBalance(n);                     
            System.out.println("Deposit Amount: " + amount + " EGP");
            System.out.println("New Balance: " + this.getBalance() + " EGP"); 
        }
        else if(amount == 0){
            System.out.println("cann't deposit a 0 amount of money");
        }
        else{
            System.out.println("cann't deposit a negative amount of money");
        }
    }
    
    public void withdraw(double amount){
        if (this.balance >= amount && amount > 0){
            double n = this.getBalance() - amount;
            this.setBalance(n);
            System.out.println("Withdrawal Amount: " + amount + " EGP"); 
            System.out.println("New Balance: " + this.getBalance() + " EGP");
        }
        else if(amount <= 0){
            System.out.println("cann't withdraw a negative or zero amount of money");
        }
        else{
            System.out.println("insuffecient funds , withdrawal failed");
        }
    }
}