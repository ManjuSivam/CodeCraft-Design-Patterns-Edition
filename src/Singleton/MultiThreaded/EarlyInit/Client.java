package Singleton.MultiThreaded.EarlyInit;

public class Client {
    public static void main(String[] args) {
        DBConnection dbc1 = DBConnection.getInstance();
        System.out.println(dbc1.hashCode());

        DBConnection dbc2 = DBConnection.getInstance();
        System.out.println(dbc2.hashCode());

        // same hashcode means same object

    }
}
