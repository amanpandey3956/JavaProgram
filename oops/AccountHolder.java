interface Reservebank {
    void deposit();
}

interface SBI extends Reservebank {
    void withdraw();
}

public class AccountHolder implements SBI {
    public void deposit() {

        System.out.println("Deposit");
    }

    public void withdraw() {
        System.out.println("withdraw");
    }

    public static void main(String[] args) {
        AccountHolder A1 = new AccountHolder();
        A1.deposit();
        A1.withdraw();
    }
}