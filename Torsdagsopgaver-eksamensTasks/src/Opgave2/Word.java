package Opgave2;

import java.util.ArrayList;

public class Word {

    ArrayList<String> animalList = new ArrayList<>();
    FileIO io = new FileIO();
    private String path = "docs/Task2.csv";


    public void saveWordToFile(){
        ArrayList<String> dataList = new ArrayList<>();
        String header = "Verdens dyr";
        for(String s : animalList){
            String data = s.toString();
            dataList.add(data);
        }
        io.saveData(header, dataList, path);
    }


}
