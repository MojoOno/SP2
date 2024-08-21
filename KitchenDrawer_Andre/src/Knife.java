public class Knife extends Utensil{
    public Knife(String useCase) {
        super(useCase);
    }

    @Override
    public String toString() {
        return "Is this knife clean?" + super.toString();
    }
}