abstract public class AFuelCar extends ACar {

    private int kmPrLitre;

    public AFuelCar(String licensePlate, String brand, String model, int doors, int kmPrLitre) {
        super(licensePlate, brand, model, doors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType(); //Should return gasoline or diesel

    public int kmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + " Kilometers per litre: " + kmPrLitre() + ",";
    }
}
