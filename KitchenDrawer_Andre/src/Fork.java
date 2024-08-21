public class Fork extends Utensil{
    public Fork(String useCase) {
        super(useCase);
    }

    @Override
    public String toString() {
        return "Is this fork clean?" + super.toString();
    }
}