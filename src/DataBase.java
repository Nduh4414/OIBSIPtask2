
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class DataBase {
    
    String username;
    TrainManager train;
    int referenceNumber;
private HashMap<String, String> users;

    public DataBase() {
        users = new HashMap<>();
        // Add default admin user
        users.put("admin", "password");
    }

    public void registerUser(String username, String password) {
        users.put(username, password);
    }

    public boolean isUserRegistered(String username, String password) {
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }
    public DataBase(String username, TrainManager train, int referenceNumber) {
        this.username = username;
        this.train = train;
        this.referenceNumber = referenceNumber;
    }

        
}

