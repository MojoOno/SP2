import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Trophy t1 = new Trophy(1992, "Champ", "Blockbuster Gamer of the Year");
        Trophy t2 = new Trophy(1993, "Champ", "Blockbuster Gamer of the Year");
        Trophy t3 = new Trophy(1990, "Yo", "Yo");

        TrophyShelf myTrophies = new TrophyShelf();

        myTrophies.addTrophy(t1);
        myTrophies.addTrophy(t2);
        myTrophies.removeTrophy(t3);

        myTrophies.displayShelf();
        System.out.println(myTrophies);




    }
}