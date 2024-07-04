package Creational.Singleton.MultiThreaded.DoubleCheckLock;

public class Client {
    public static void main(String[] args) {
        DBConnection dbc1 = DBConnection.getInstance();
        DBConnection dbc2 = DBConnection.getInstance();
        System.out.println(dbc1.equals(dbc2)); //true; because same object.
    }
}
