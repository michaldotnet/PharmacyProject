package pl.edu.wszib.gui;

import pl.edu.wszib.dataBase.DataBaseOperations;
import pl.edu.wszib.model.Medicine;

import java.util.Scanner;

public class ShowInfoAboutMedicineGUI {


    public void showMedicineInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę leku, o ktrórym chcesz zobaczyć informacje:");
        String medicineNameFromUser = scanner.nextLine();
        Medicine medicine = DataBaseOperations.getMedicines(medicineNameFromUser);
        try {
            System.out.println(medicine.toString());
        }catch(NullPointerException e){
            System.out.println("Nie ma takiego leku.");
        }
    }
}
