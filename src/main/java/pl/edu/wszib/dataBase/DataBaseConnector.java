package pl.edu.wszib.dataBase;

import org.apache.commons.codec.digest.DigestUtils;
import pl.edu.wszib.model.Medicine;

import java.sql.*;

public class DataBaseConnector {

    public static Connection connection = null;
    public static void connect(){
        try{

            Class.forName("com.mysql.jdbc.Driver");
            DataBaseConnector.connection = DriverManager.
                    getConnection("jdbc:mysql://localhost/wszib?user=root&password=");
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
