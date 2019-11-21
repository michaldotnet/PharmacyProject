package pl.edu.wszib.gui;

import pl.edu.wszib.dataBase.DataBaseOperations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SellMedicineGUI {

    public void sellMedicine(){
        Scanner scanner = new Scanner(System.in);
        int quantityOfMedicineToSell = 0;
        System.out.println("Podaj nazwę leku, który sprzedajesz:");
        String medicineForSellName = scanner.nextLine();
        System.out.println("Ile opakowań leku sprzedajesz?");
        do {
            try {
                quantityOfMedicineToSell = scanner.nextInt();
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Zła liczba opakowań, wprowadź poprawną:");
            }
        }while(quantityOfMedicineToSell<=0);

        DataBaseOperations.sellMedicine(medicineForSellName, quantityOfMedicineToSell);
    }
}
