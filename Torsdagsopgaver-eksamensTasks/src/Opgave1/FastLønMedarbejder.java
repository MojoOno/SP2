package Opgave1;

public class FastLønMedarbejder implements Betaling{
    private double månedsløn;

    public FastLønMedarbejder(double månedsløn) {
        this.månedsløn = månedsløn;
    }

    @Override
    public double beregnLøn() {
        double løn = this.månedsløn;
        return løn;
    }
}
