package mainpak;

public class MainClass {
    
    public static void main(String args[]) {
        DataBaseConnection DataBaseMainConnection = new DataBaseConnection();
        AuthorizationWindowView AuthorizationWindow = new AuthorizationWindowView();
        DataBaseMainConnection.DataBaseConnectionInitiating();
    }
    
}
