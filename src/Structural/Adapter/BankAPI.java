package Structural.Adapter;

public interface BankAPI {
    void sendMoney(String from, String to, int amount);
    long getBalance(String accNo);
}
