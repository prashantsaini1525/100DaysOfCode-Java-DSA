
public class code {

    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "prashant1525";
        // myAcc.password = "mypassword"; // Error: password has private access in BankAccount
        myAcc.setPassword("mypassword"); // Use setter to set password
        System.out.println("Username: " + myAcc.username);
        System.out.println("Password set successfully.");
    }
}

class BankAccount {

    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
