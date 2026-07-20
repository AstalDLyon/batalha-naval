package controller;
import java.util.*;

public class GameHelper {
        private static final String ALPHABET = "abcdefg";
        private static final int  GRID_LENGTH = 7;
        private static final int  GRID_SIZE =  49;
        private static final int  MAX_ATTEMPTS =  200;
        static final int HORIZONTAL_INCREMENT = 1;
        static final int VERTICAL_INCREMENT = GRID_LENGTH;

        private final int[] grid = new int[GRID_SIZE];
        private final Random random = new Random();
        private int startupCount = 0;

        public String getUserInput(String prompt){
            System.out.print(prompt + ": ");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine().toLowerCase();
        }

        public ArrayList<String> placeStartup(int startupSize){
            int[] startupCoords = new int[startupSize];
            int attempts = 0;
            boolean success = false;

            startupCount++;
            int increment = getIncrement();

            while(!success  &  attempts++ < MAX_ATTEMPTS){
                int location = random.nextInt(GRID_SIZE);

                for(int i = 0; i < startupCoords.length; i++){
                    startupCoords[i] = location;
                    location += increment;
                }
                //System.out.println("Tentando: " + Arrays.toString(startupCoords));

                if (startupFits(startupCoords, increment)){
                    success = coodsAvailable(startupCoords);
                }
            }

            savePositionToGrid(startupCoords);
            ArrayList<String> alphaCells = convertCoordsToAlphaFormat(startupCoords);
            //System.out.println("Colocada em: " + alphaCells);
            return alphaCells;
        }


}
