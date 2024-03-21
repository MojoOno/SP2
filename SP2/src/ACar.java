abstract public class ACar implements Car {

    private String licensePlate;
    private String brand;
    private String model;
    private int doors;

    public ACar(String licensePlate, String brand, String model, int doors) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.doors = doors;
    }



    @Override
    public String getRegistrationNumber() {
        return licensePlate;
    }

    @Override
    public String getMake() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return doors;
    }

    @Override
    public String toString() {  //Skal fixes så det ser pænere ud
        return  " Car: " + brand  +
                ", " + model  +
                ", " + licensePlate  +
                ", " + doors + ",";
    }
}
