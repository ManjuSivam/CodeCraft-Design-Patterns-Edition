package Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        BankAPI bankAPI = BankAdaptorFactory.getBankAdapter(PartnerBanks.ICICIBANK);
        bankAPI.sendMoney("000350123456", "00035074115",8000);
        System.out.println(bankAPI.getBalance("00035074115"));
    }
}
