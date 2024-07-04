package Structural.Adapter;

public class BankAdaptorFactory {
    public static BankAPI getBankAdapter(PartnerBanks bank){
        if(bank.equals(PartnerBanks.ICICIBANK)){
            return new ICICIBankAdapter();
        } else if (bank.equals(PartnerBanks.YESBANK)) {
            return new YesBankAdapter();
        }
        throw new IllegalArgumentException("No adapter found for bank: " + bank);
    }
}
