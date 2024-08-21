public class Whisk extends Utensil{
    public Whisk(String useCase) {
        super(useCase);
        if(useCase.equalsIgnoreCase("Fine Dining")){
            setUseCase("Cooking");
        }
    }

    @Override
    public String toString() {
        return "Is this whisk clean?" + super.toString();
    }
}