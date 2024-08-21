package Opgave1;

public class TimelønnetMedarbejder implements Betaling{
    private float antalTimer;
    private float timeLøn;

    public TimelønnetMedarbejder(float antalTimer, float timeLøn) {
        this.antalTimer = antalTimer;
        this.timeLøn = timeLøn;
    }

    @Override
    public double beregnLøn() {
        double løn = this.antalTimer * this.timeLøn;
        return løn;
    }
}
