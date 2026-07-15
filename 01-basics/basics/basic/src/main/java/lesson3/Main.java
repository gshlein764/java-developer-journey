package lesson3;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user = new User("German", LocalDate.of(2006, 7, 24), 247759);
        BankAccount bankAccount = new BankAccount(828332, 1_325_670, user);

        user.printInfo();
        bankAccount.deposit(5854.40);
        bankAccount.withdraw(500_000);
        bankAccount.showBalance();
    }
}
