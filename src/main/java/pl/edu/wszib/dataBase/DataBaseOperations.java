package pl.edu.wszib.dataBase;

import pl.edu.wszib.model.Medicine;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseOperations {
    public static void addMedicines(Medicine medicine){
        String sql = " INSERT INTO lekarstwa (id, medicinename, quantity, price, needpre) VALUES (?, ?, ?, ?, ?)";

        try{
            PreparedStatement preparedStatement = DataBaseConnector.connection.prepareStatement(sql);
            preparedStatement.setInt(1, medicine.getId());
            preparedStatement.setString(2, medicine.getMedicineName());
            preparedStatement.setInt(3, medicine.getQuantity());
            preparedStatement.setDouble(4, medicine.getPrice());
            preparedStatement.setBoolean(5, medicine.isNeedPrescription());

            preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
