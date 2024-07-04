package Creational.Singleton.MultiThreaded.DoubleCheckLock;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    String userName;
    String password;
    String url;
    private static DBConnection dbc = null;
    static ReentrantLock lock = new ReentrantLock();
    private DBConnection(){

    }

    public static DBConnection getInstance() {
        if (dbc == null) { // Check if dbc (DBConnection instance) is null
            lock.lock(); // Acquire the lock to ensure thread safety

            try {
                if (dbc == null) { // Double-checking to ensure dbc is still null inside the synchronized block
                    dbc = new DBConnection(); // Create a new DBConnection instance
                }
            } finally {
                lock.unlock(); // Release the lock
            }
        }
        return dbc; // Return the singleton instance of DBConnection
    }


}
