package Singleton.SingleThreaded;

public class DBConnection {
    String userName;
    String password;
    String url;
    private static DBConnection dbc = null;
    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(dbc==null){
            dbc= new DBConnection();
        }
        return dbc;
    }
}
