package pl.edu.wszib;
import pl.edu.wszib.dataBase.DataBaseOperations;
import pl.edu.wszib.gui.Menu;
import pl.edu.wszib.model.Medicine;
import pl.edu.wszib.dataBase.DataBaseConnector;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        DataBaseConnector.connect();

        Menu menu = new Menu();
        menu.initializeMenu();

    }
}
