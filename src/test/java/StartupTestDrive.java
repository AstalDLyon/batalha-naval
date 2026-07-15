import controller.Startup;

import java.util.ArrayList;

public class StartupTestDrive {
    static void main() {
        Startup dot = new Startup();

        ArrayList<String> locations = new ArrayList<>();
        locations.add("A1");
        locations.add("A2");
        locations.add("A3"); // O motivo da repetição é pq o metodo ".add" não aceita a passagem de vários elementos de uma vez
        // Somente o elemento .add("Test") OU posição e elemento .add(index, "Test");
        dot.setLocationCells(locations);
        String userGuess = "A1";
        String result = dot.checkYourself(userGuess);
        boolean testResult;

        if (result.equals("Hit")) {
            testResult = true;
            System.out.println("Teste aceito");
        } else  {
            testResult = false;
            System.out.println("Teste falho");
        }
    }
}
