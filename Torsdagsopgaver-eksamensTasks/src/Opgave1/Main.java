package Opgave1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Betaling> lønListe = new ArrayList<>();


        ProvisionsMedarbejder pm1 = new ProvisionsMedarbejder(20000, 10000, 20);
        FastLønMedarbejder flm1 = new FastLønMedarbejder(40000);
        FastLønMedarbejder flm2 = new FastLønMedarbejder(100000);
        TimelønnetMedarbejder tlm1 = new TimelønnetMedarbejder(160, 155);

        lønListe.add(pm1);
        lønListe.add(flm1);
        lønListe.add(flm2);
        lønListe.add(tlm1);

       for(Betaling b : lønListe){
           System.out.println(b.beregnLøn());
       }


    }
}
