package Structural.Adapter;

import Structural.Adapter.ThirdParty.ICICIBank;

public class ICICIBankAdapter implements BankAPI{


    ICICIBank iciciBank = new ICICIBank();
    @Override
    public void sendMoney(String from, String to, int amount) {

        iciciBank.makePayment(to, from, amount);
    }

    @Override
    public long getBalance(String accNo) {

        return iciciBank.getAccountBalance(accNo);
    }
}
