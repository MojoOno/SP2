package Ordleg;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ordleg ord = new Ordleg();
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Hello");
        wordList.add("World");

        try {
            System.out.println(ord.ordleg(wordList, 3));
        } catch (Exception e) {
            System.out.println(e);
        }

        try{
            System.out.println(ord.sorteretOgTrimmet(wordList));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
