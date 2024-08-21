package Opgave3;

import java.util.Scanner;

public class MenneskeSpiller implements Spiller{

    @Override
    public int gætEtTal(int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make a guess");
        String input = scanner.nextLine();
        int guess = Integer.parseInt(input);

        return guess;
    }
}
