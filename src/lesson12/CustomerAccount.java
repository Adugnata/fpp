package lesson12;

class WithdrawExceedBalanceException extends Exception {
    public WithdrawExceedBalanceException(String message) {
        super(message);
    }
}

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

public class CustomerAccount {
    private String cus_name;
    private String acc_no;
    private double balance;

    public CustomerAccount() {
        this(null, null, 0.0);
    }

    public CustomerAccount(String cus_name, String acc_no, double balance) {
        this.cus_name = cus_name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0)
            return false;
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        try {
            if (amount > balance)
                throw new WithdrawExceedBalanceException("Insufficient balance!");
            balance -= amount;
            return true;
        } catch (WithdrawExceedBalanceException e) {
            System.out.println(e);
        }
        return false;
    }

    public double getBalance() {
        try {
            if (balance < 100)
                throw new LowBalanceException("Your balance is " + balance + ", below 100");
        } catch (LowBalanceException e) {
            System.out.println(e);
        }
        return balance;
    }

    public static void main(String[] args) {
        CustomerAccount ca = new CustomerAccount("Jacob", "10000", 400);
        System.out.println("Deposited: " + ca.deposit(-10));
        System.out.println("Withdraw: " + ca.withdraw(100));
        System.out.println("Withdraw: " + ca.withdraw(250));
        System.out.println("Withdraw: " + ca.withdraw(51));
        System.out.println(ca.getBalance());
    }
}
