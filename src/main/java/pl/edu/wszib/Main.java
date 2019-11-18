package pl.edu.wszib;
import pl.edu.wszib.dataBase.DataBaseOperations;
import pl.edu.wszib.model.Medicine;
import pl.edu.wszib.dataBase.DataBaseConnector;

public class Main {

    public static void main(String[] args){
        DataBaseConnector.connect();
        Medicine ibuprom = new Medicine();

        ibuprom.setId(1);
        ibuprom.setMedicineName("Ibuprom");
        ibuprom.setPrice(5);
        ibuprom.setQuantity(20);
        ibuprom.setNeedPrescription(false);

        DataBaseOperations.addMedicines(ibuprom);

    }
}
