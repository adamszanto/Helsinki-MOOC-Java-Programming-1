
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account account = new Account("Adam's account", 100.0);
        account.deposit(20.0);
        System.out.println(account);
        System.out.println(account.toString());
       
    }
}
