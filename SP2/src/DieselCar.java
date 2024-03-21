public class DieselCar extends AFuelCar{
    private boolean particleFilter;

    public DieselCar(String licensePlate, String brand, String model, int doors, int kmPrLitre, boolean particleFilter) {
        super(licensePlate, brand, model, doors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    @Override
    String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int regFee;
        int dieselFee;
        int result = 0;
        if(!hasParticleFilter()){
            result += 1000;
        }
        if(kmPrLitre()<5){
            regFee = 10470;
            dieselFee = 15260;
            result += regFee + dieselFee;
        } else if(kmPrLitre()<10){
            regFee = 5500;
            dieselFee = 2770;
            result += regFee + dieselFee;
        } else if(kmPrLitre()<15){
            regFee = 2340;
            dieselFee = 1850;
            result += regFee + dieselFee;
        } else if(kmPrLitre()<20){
            regFee = 1050;
            dieselFee = 1390;
            result += regFee + dieselFee;
        } else{
            regFee = 330;
            dieselFee = 130;
            result += regFee + dieselFee;
        }
        return result;
    }

    public boolean hasParticleFilter(){
        return particleFilter;
    }

    @Override
    public String toCSV() {
        return getRegistrationNumber() + ", " +
                getMake() + ", " +
                getModel() + ", " +
                getNumberOfDoors() + ", " +
                kmPrLitre() + ", " +
                hasParticleFilter() + ", " +
                ", "   //Battery
                ;   //Range
    }

    @Override
    public String toString() {
        return "Motor: " + getFuelType() + "," +
                super.toString() +
                (particleFilter ? " Has" : " No") + " particle filter";
    }
}
