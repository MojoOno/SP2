package Menuvalg;

import java.util.ArrayList;
import java.util.Scanner;

public class MinBrugerDialog1 {
    public class MinBrugerDialog {
        int i;
        ArrayList<String> menuList;


        public int menuValg (ArrayList<String> menuList){
            udskrivMenu(menuList);

            int valg = læsBrugerensInput(menuList);

            return valg;

        }

        private void udskrivMenu(ArrayList<String> menuList){
            for(i = 0; i < menuList.size(); i++){
                System.out.println((i + 1) + ". " + menuList.get(i));
            }
        }
    }

    private int læsBrugerensInput(ArrayList<String> menuList){
        Scanner scan = new Scanner(System.in);
        int valg = 0;
        try{
            valg = scan.nextInt();
            if(valg < 1 || valg > menuList.size()){
                throw new Exception("Ugyldigt valg");
            }

        } catch(Exception e){
            System.out.println("Ugyldigt valg");
        }
        return valg;
    }
}
