package bankApp;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testCreatAccount(){
        Account account = new Account("Justina","1234" , "12345678912");
        assertEquals("123456789012",account.getAccountnumber());
    }

    @Test
    public void testGeneratePin(){
        Account account = new Account();
        account.GeneratePin("8975");
        assertEquals("8975",account.getPin());
    }

    @Test
    public void testAccount(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testdeposit(){
        Account account = new Account();
        account.deposit(5_000);
        assertEquals(5_000, account.getBalance());
    }

    @Test
    public void testdeposits(){

        Account account = new Account();

        account.deposit(-5_000);

        assertEquals(-5_000, account.getBalance());

    }



    @Test
    public void testwithdraw(){

        Account account = new Account();

        account.deposit(5_000);
        account.withdraw(3000);

        assertEquals(2000, account.getBalance());



    }







}

