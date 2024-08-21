package Opgave2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String path = "docs/Task2.csv";
        FileIO io = new FileIO();
        ArrayList<String> result = io.readData(path);
        for(String s : result){
            System.out.println(s);
        }

    }
}

