import controller.GameHelper;
import controller.Startup;

import java.util.ArrayList;

public class StartupBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numeroDePalpites = 0;

    private void setUpGame() {
        Startup one = new Startup();
        one.setName("poniez");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Seu objetivo é afundar três empresas");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Tente afundar todas usando o menor número  de palpites");

        for (Startup startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!startups.isEmpty()) {
            String userGuess =  helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numeroDePalpites++;
        String result =  "Miss";

        for (Startup startupToTest : startups) {
            result = startupToTest.checkYourself(userGuess);

            if (result.equals("Hit")) {
                break;
            }

            if (result.equals("Kill")) {
                startups.remove(startupToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Todas as empresas afundaram");

        if (numeroDePalpites <=18) {
            System.out.println("Você  so precisou de: " + numeroDePalpites +  " palpites.");
            System.out.println("Você foi bem");
        }  else {
            System.out.println("Demorou mas foi, você  usou:  "  + numeroDePalpites + " palpites.");
            System.out.println("Tente denovo");
        }
    }

    static void main (String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    }
}
