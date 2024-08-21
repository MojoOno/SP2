package Opgave3;

import java.util.Random;

public class Gættespil {
    private int theNumber;
    private int max;

    public Gættespil(int max){
        this.theNumber = 10;
        this.max = max;
    }

    public boolean tur(Spiller spiller){
        int guess = spiller.gætEtTal(this.max);
        System.out.println(guess);
        if(guess == this.theNumber){
            System.out.println("Det er rigtigt");
            return true;
        }else{
            System.out.println("Det er forkert, prøv igen");
            return false;
        }

    }
}
