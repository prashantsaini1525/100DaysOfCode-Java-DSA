
public class code2 {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("123456789");
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Current Balance: " + account.getBalance());
        account.withdraw(400); // Attempt to withdraw more than the balance
    }
}

class BankAccount {

    private String accountNumber;
    private double balance;

    // Public method to set account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Public method to check balance
    public double getBalance() {
        return balance;
    }
}
