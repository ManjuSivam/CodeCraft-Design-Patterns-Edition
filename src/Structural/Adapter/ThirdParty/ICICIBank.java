package Structural.Adapter.ThirdParty;

public class ICICIBank {
    int bal = 100000;
    public void makePayment(String to, String from, int amt){
        bal+=amt;
        System.out.println("Transferred amount Rs."+amt + " from account "+from+" to account "+to+ "via ICICIBank..");
    }

    public long getAccountBalance(String accNo){
        return bal;
    }
}
