public class ElectricCar extends ACar{
    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String licensePlate, String brand, String model, int doors, int batteryCapacity, int maxRange) {
        super(licensePlate, brand, model, doors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    @Override
    public int getRegistrationFee() {
        int kmPrL = 9125/this.getWhPrKm();
        int regFee;
        int result = 0;
        if(kmPrL<5){
            regFee = 10470;
            result += regFee;
        } else if(kmPrL<10){
            regFee = 5500;
            result += regFee;
        } else if(kmPrL<15){
            regFee = 2340;
            result += regFee;
        } else if(kmPrL<20){
            regFee = 1050;
            result += regFee;
        } else{
            regFee = 330;
            result += regFee;
        }
        return result;
    }
    public int getBatteryCapacityKWh(){
        return this.batteryCapacity;
    }
    public int getMaxRangeKm(){
        return this.maxRange;
    }
    public int getWhPrKm(){
        return (this.batteryCapacity*1000) / this.maxRange;
    }

    @Override
    public String toCSV() {
        return getRegistrationNumber() + ", " +
                getMake() + ", " +
                getModel() + ", " +
                getNumberOfDoors() + ", " +
                ", " + //kmPrLitre()
                ", " +  //hasParticleFilter
                getBatteryCapacityKWh() + ", " +  //Battery
                getMaxRangeKm();   //Range
    }

    @Override
    public String toString() {
        return "Motor: Electric" + "," + super.toString() +
                " BatteryCapacity: " + batteryCapacity +
                ", Max Range: " + maxRange;
    }

}
