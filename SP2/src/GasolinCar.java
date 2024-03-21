public class GasolinCar extends AFuelCar{
    public GasolinCar(String licensePlate, String brand, String model, int doors, int kmPrLitre) {
        super(licensePlate, brand, model, doors, kmPrLitre);
    }

    @Override
    String getFuelType() {
        return "Benzin";
    }

    @Override
    public int getRegistrationFee() {
        int result = 0;
        int regFee;
        if(kmPrLitre()<5){
            regFee = 10470;
            result += regFee;
        } else if(kmPrLitre()<10){
            regFee = 5500;
            result += regFee;
        } else if(kmPrLitre()<15){
            regFee = 2340;
            result += regFee;
        } else if(kmPrLitre()<20){
            regFee = 1050;
            result += regFee;
        } else{
            regFee = 330;
            result += regFee;
        }
        return result;
    }

    @Override
    public String toCSV() {
        return getRegistrationNumber() + ", " +
                getMake() + ", " +
                getModel() + ", " +
                getNumberOfDoors() + ", " +
                kmPrLitre() + ", " +
                ", " +  //hasParticleFilter
                ", "  //Battery
                ;   //Range

    }

    @Override
    public String toString() {
        return "Motor: " + getFuelType() + "," +
                super.toString();
    }
}
