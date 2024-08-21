import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Exception;


public class KitchenDrawer {

    ArrayList<Utensil> utensilsList = new ArrayList<>();
    Random random = new Random();

    public void addUtensil(Utensil u) {
        utensilsList.add(u);
    }

    public void removeUtensil(Utensil u) throws Exception {
        if (utensilsList.contains(u)) {
            utensilsList.remove(u);
        } else {
            throw new Exception("There is no " + "\"" + u + "\" in our drawer. If you want to remove something, pick something in here, stupid");
        }

    }
    //Metoden under er til at fjerne ved hjælp af index nummer.
    /*public void removeUtensil(int indexNumber) {
        if (indexNumber >= 0 && indexNumber < utensilsList.size()) {
            utensilsList.remove(indexNumber);
        } else {
            System.out.println("Index is out of bounds");

        }

    }*/

    public void displayUtensils() {
        for (Utensil u : utensilsList) {
            System.out.println(u);
        }
    }

    public Utensil getUtensil(int indexNumber) {
        if (indexNumber >= 0 && indexNumber < utensilsList.size()) {
            return utensilsList.get(indexNumber);
        } else {
            System.out.println("Index is out of bounds");
            return null;
        }
    }

    public Knife getKnife() {
        for (Utensil k : utensilsList) {
            if (k instanceof Knife) {
                try{
                    removeUtensil(k);
                }catch (Exception e){
                    System.out.println(e);
                }
                return (Knife) k;
            }
        }
        return null;
    }

    public Fork getFork() {
        for (Utensil f : utensilsList) {
            if (f instanceof Fork) {
                try {
                    removeUtensil(f);
                } catch (Exception e) {
                    System.out.println(e);
                }
                return (Fork) f;
            }
        }
        return null;
    }

    public Spoon getSpoon() {
        for (Utensil s : utensilsList) {
            if (s instanceof Spoon) {
                try{
                    removeUtensil(s);
                }catch (Exception e){
                    System.out.println(e);
                }
                return (Spoon) s;
            }
        }
        return null;
    }

    public boolean checkIfDrawerIsClean() {
        for (Utensil u : utensilsList) {
            if (!u.isClean()) {
                return false;
            }
        }
        return true;
    }

    public void cleanAll() {
        for (Utensil u : utensilsList) {
            if(!u.isClean()){
                u.clean();
            }
        }

    }

    public void polishFineDiningUtensils() {
        for (Utensil u : utensilsList) {
            if (u.forFineDining()) {
                u.polish();
            }
        }

    }
    public Utensil getRandom(){
        if(utensilsList.isEmpty()){
            System.out.println("Drawer is empty");
            return null;
        }else{
            int randomIndex = random.nextInt(utensilsList.size());
            return utensilsList.get(randomIndex);
        }
    }

    @Override
    public String toString() {
        return "KitchenDrawer{" +
                "utensilsList=" + utensilsList +
                ", random=" + random +
                '}';
    }
}