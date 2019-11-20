package pl.edu.wszib.dataBase;

//import com.mysql.jdbc.Connection;
import org.apache.commons.codec.digest.DigestUtils;
import pl.edu.wszib.model.Medicine;

import java.sql.*;

public class DataBaseConnector {

    public static Connection connection = null;
    public static void connect(){
        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connectin DB..");
            DataBaseConnector.connection = DriverManager.
                    getConnection("jdbc:mysql://localhost/Apteka?user=root&password=");
            System.out.println("Connection is done!");
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
