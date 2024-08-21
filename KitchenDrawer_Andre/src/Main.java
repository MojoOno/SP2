public class Main {
    public static void main(String[] args) {
        Knife knife1 = new Knife("Fine Dining");
        Knife knife2 = new Knife("Fine Dining");
        Knife knife3 = new Knife("Cooking");
        Fork fork1 = new Fork("Fine Dining");
        Fork fork2 = new Fork("Fine Dining");
        Fork fork3 = new Fork("Fine Dining");
        Spoon spoon1 = new Spoon("Fine Dining");
        Spoon spoon2 = new Spoon("Fine Dining");
        Spoon spoon3 = new Spoon("Fine Dining");
        Whisk whisk1 = new Whisk("Cooking");
        Whisk whisk2 = new Whisk("Cooking");
        Whisk whisk3 = new Whisk("Fine Dining");
        System.out.println(whisk3);
        whisk3.forFineDining(); //false


        KitchenDrawer kd1 = new KitchenDrawer();

        kd1.addUtensil(knife1);
        kd1.addUtensil(knife2);
        kd1.addUtensil(knife3);
        kd1.addUtensil(fork1);
        kd1.addUtensil(fork2);
        kd1.addUtensil(fork3);
        kd1.addUtensil(spoon1);
        kd1.addUtensil(spoon2);
        kd1.addUtensil(spoon3);
        kd1.addUtensil(whisk1);
        kd1.addUtensil(whisk2);
        kd1.addUtensil(whisk3);




        Spoon favouriteSpoon = kd1.getSpoon();
        favouriteSpoon.use();
        kd1.addUtensil(favouriteSpoon);
        System.out.println(kd1.checkIfDrawerIsClean());
        kd1.cleanAll();
        kd1.polishFineDiningUtensils();
        kd1.displayUtensils();

        try{
            kd1.removeUtensil(knife1);
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println(kd1.getRandom());


    }
}