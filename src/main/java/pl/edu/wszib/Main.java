package pl.edu.wszib;
import pl.edu.wszib.dataBase.DataBaseOperations;
import pl.edu.wszib.model.Medicine;
import pl.edu.wszib.dataBase.DataBaseConnector;

public class Main {

    public static void main(String[] args){
        DataBaseConnector.connect();
        /*
        Medicine ibuprom = new Medicine();

        ibuprom.setId(1);
        ibuprom.setMedicineName("Apap");
        ibuprom.setPrice(7);
        ibuprom.setQuantity(50);
        ibuprom.setNeedPrescription(true);

        //DataBaseOperations.addMedicines(ibuprom);
        DataBaseOperations.addMedicines(ibuprom);

       Medicine lek = DataBaseOperations.getMedicines("Apap");
        System.out.println(lek);
         */
        System.out.println("aa");
        System.out.flush();

    }
}
