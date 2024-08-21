public class Spoon extends Utensil{
    public Spoon(String useCase) {
        super(useCase);
    }

    @Override
    public String toString() {
        return "Is this spoon clean?" + super.toString();
    }
}