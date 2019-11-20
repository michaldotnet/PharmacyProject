package pl.edu.wszib.gui;

import java.util.*;
public class Menu {

    public void initializeMenu(){
        System.out.println("Witaj w aptece, co chciałbyś zrobić?");
        Scanner input = new Scanner(System.in);
        int menuChoice = input.nextInt();
        while(true) {
            switch (menuChoice) {

                case 1:

                    break;

                case 2:

                    break;

                case 3:
                    System.exit(0);
                    break;

                default:

                    break;
            }
        }

    }

    public void printMenu(){

        System.out.println("1) Dodaj lek");
        System.out.println("2) Informacje o danym leku");
        System.out.println("3) Sprzedaj lek");
        System.out.println("3) Wyjście");

    }
}
