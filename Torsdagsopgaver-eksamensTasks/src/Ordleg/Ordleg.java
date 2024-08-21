package Ordleg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ordleg {

    public ArrayList<String> ordleg(ArrayList<String> ordListe, int k) throws Exception {
        if(ordListe == null){
            throw new NullPointerException("Ordlisten må ikke være \"null\"");
        }
        if(k <= 0){
            throw new IllegalArgumentException("k skal være et heltal og større ned 0");
        }
        ArrayList<String> gentagneOrd = new ArrayList<>();
        for(String ord : ordListe){
            for(int i = 0 ; i < k; i++){
                gentagneOrd.add(ord);
            }
        }
        return gentagneOrd;

    }

    public ArrayList<String> sorteretOgTrimmet(ArrayList<String> ordListe)throws Exception{
        if(ordListe == null){
            throw new NullPointerException("Sorteringslisten må ikke være \"null\"");
        }
        ArrayList<String> lengthSortList = new ArrayList<>();

        for(String ord : ordListe){
            if(!lengthSortList.contains(ord)){
                lengthSortList.add(ord);
            }

        }
        Comparator<String> længdeComparator = Comparator.comparingInt(String::length);
        Collections.sort(lengthSortList, længdeComparator);
        return lengthSortList;
    }

}
