package Opgave3;

public class Main {
    public static void main(String[] args) {
        MenneskeSpiller menneskeSpiller = new MenneskeSpiller();
        ComputerSpiller computerSpiller = new ComputerSpiller();
        Gættespil spil = new Gættespil(100);

        spil.tur(menneskeSpiller);

        /*int menneskeGæt = menneskeSpiller.gætEtTal(20);
        System.out.println(menneskeGæt);

        int computerGæt = computerSpiller.gætEtTal(20);
        System.out.println(computerGæt);*/

    }
}
