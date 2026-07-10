import controller.SimpleStartup;

public class SimpleStartupTestDrive {
    static void main() {
        SimpleStartup dot = new SimpleStartup();

        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        int userGuess = 2;
        String result = dot.checkYourself(userGuess);
        boolean testResult = false;

        if (result.equals("hit")) {
            testResult = true;
            System.out.println("Teste aceito");
        } else  {
            testResult = false;
            System.out.println("Teste falho");
        }
    }
}
