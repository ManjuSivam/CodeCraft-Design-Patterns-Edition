package Creational.Singleton.MultiThreaded.EarlyInit;

public class DBConnection {
    String userName;
    String password;
    String url;
    private static DBConnection dbc = new DBConnection(); //creates obj in compile time itself

    //issue is, cant pass attr in constructor, since it happens in the compiletime;
    // will work only when the credentials are hardcoded
    private DBConnection(){

    }

    public static DBConnection getInstance(){
        return dbc;
    }
}
