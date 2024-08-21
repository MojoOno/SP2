package Opgave3;

import java.util.Random;

public class ComputerSpiller implements Spiller{

    @Override
    public int gætEtTal(int max) {
        Random rand = new Random();
        int guess = rand.nextInt(max);
        return guess;
    }

}

