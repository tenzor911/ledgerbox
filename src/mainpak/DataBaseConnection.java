package mainpak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.derby.jdbc.ClientDriver;

public class DataBaseConnection {
    
    private String dbHost = "jdbc:derby://localhost:1527/accounting";
    private String uName = "root";
    private String uPass = "root";
    
    void DataBaseConnectionInitiating() {
        try {
            Connection dbConnection = DriverManager.getConnection(dbHost, uName, uPass);
            System.out.println("Connect to " + dbConnection.getCatalog() + " a success!");
        }
        catch (SQLException err) {
            System.err.println("Error!!! Connection was unsuccessfull !!!");  
        }
    }
}
