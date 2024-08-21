package Opgave2;

import java.util.ArrayList;

public class TextHandler {

    public ArrayList<String> sort(ArrayList<String> dataList) {
        ArrayList<String> sortedList = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++) {
            String data = dataList.get(i);
            if(sortedList.size() == 0){
                sortedList.add(data);
            }else{
                for(int j = 0; j < sortedList.size(); j++){
                    if(data.length() >= sortedList.get(j).length()){
                        sortedList.add(j, data);
                        break;
                    }
                }
            }
        }



        return sortedList;
    }
}
