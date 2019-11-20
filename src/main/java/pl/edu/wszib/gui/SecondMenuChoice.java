package pl.edu.wszib.gui;

import pl.edu.wszib.dataBase.DataBaseOperations;
import pl.edu.wszib.model.Medicine;

import java.util.Scanner;

public class SecondMenuChoice {

    public void addMedicine(){
        Scanner scanner = new Scanner(System.in);
        Medicine tempMedicine = new Medicine();
        System.out.println("Podaj nazwę leku");
        tempMedicine.setMedicineName();

        DataBaseOperations.addMedicines(tempMedicine);
    }
}
