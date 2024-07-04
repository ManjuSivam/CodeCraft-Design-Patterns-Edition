package Structural.Adapter;

import Structural.Adapter.ThirdParty.YesBank;

public class YesBankAdapter implements BankAPI{
    YesBank yesBank = new YesBank();
    @Override
    public void sendMoney(String from, String to, int amount) {
        yesBank.transferMoney(from, to, amount);
    }

    @Override
    public long getBalance(String accNo) {
        return yesBank.getAccountBalance(accNo);
    }
}
