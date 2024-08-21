package Opgave1;

public class ProvisionsMedarbejder implements Betaling{
    private double grundløn;
    private double salg;
    private double provisionProcent;

    public ProvisionsMedarbejder(double grundløn, double salg, double provisionProcent) {
        this.grundløn = grundløn;
        this.salg = salg;
        this.provisionProcent = provisionProcent;
    }

    @Override
    public double beregnLøn() {
        double løn = grundløn + ((provisionProcent*salg)/100);
        return løn;
    }
}
