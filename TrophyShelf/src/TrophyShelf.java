import java.util.ArrayList;

public class TrophyShelf {
    private ArrayList<Trophy> trophyList = new ArrayList<>();

    public void addTrophy(Trophy t){
        trophyList.add(t);

    }
    public void removeTrophy(Trophy t){
        if(trophyList.contains(t)){
            trophyList.remove(t);
        } else {
            System.out.println("\"" + t + "\" not found. Please try again.");
        }

    }
    public void displayShelf(){
        for(Trophy t : trophyList){
            System.out.println(t);
        }

    }

    @Override
    public String toString() {
    StringBuilder output = new StringBuilder("My Trophyshelf\n");
    for(Trophy t : trophyList){
        output.append(t).append("\n");
    }
        return output.toString();
    }
}
