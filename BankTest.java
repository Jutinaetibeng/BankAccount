import bankApp.Bank;
import org.junit.jupiter.api.Test;

public class BankTest {

    @Test
    public void createAccount(){
        Bank bank = new Bank();
        bank.createAccount();
    }
}

