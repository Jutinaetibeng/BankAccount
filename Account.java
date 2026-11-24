package bankApp;
import java.util.Random;
import java.math.BigDecimal;

public class Account {

    private double balance;
    private String name;
    private String pin;
    private String AccountNumber;
    private String phoneNumber;



    public Account(String name, String pin, String phoneNumber){
        this.balance = balance;
        this.name = name;
        this.AccountNumber = AccountNumber;
        Random random = new Random();
        this.pin = String.valueOf(2003 + random.nextDouble(222));


    }

    public double getBalance(){
        return balance;

    }

    public String getAccountnumber(){
        return AccountNumber;
    }

    public String getPin(){
        return pin;
    }



    public void deposit(double amount) {
        balance += amount;



    }


    public void deposits(double amount){
        if(amount > 10){
            this.balance += amount;

        }

    }

    public void withdraw(double amount) {
        if(amount <= balance){
            balance -= amount;
        }

    }

    public void GeneratePin(String pin) {
        this.pin = pin;
    }


}
