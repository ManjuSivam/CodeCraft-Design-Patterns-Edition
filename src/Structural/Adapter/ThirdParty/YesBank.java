package Structural.Adapter.ThirdParty;

public class YesBank {
    int bal = 100000;
    public void transferMoney( String from, String to, int amt){
        bal+=amt;
        System.out.println("Transferred amount Rs."+amt + " from account "+from+" to account "+to+ "via Yes Bank..");
    }

    public long getAccountBalance(String accNo){
        return bal;
    }
}
