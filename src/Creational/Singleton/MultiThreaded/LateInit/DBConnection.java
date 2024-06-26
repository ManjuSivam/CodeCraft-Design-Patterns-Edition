package Singleton.MultiThreaded.LateInit;

public class DBConnection {
    String userName;
    String password;
    String url;
    private static DBConnection dbc = null;
    private DBConnection(){

    }

    public static synchronized DBConnection getInstance(){ //making method sync,
        //still, there is a high chance we get 2 instances
        if(dbc==null){
            dbc= new DBConnection();
        }
        return dbc;
    }
}
