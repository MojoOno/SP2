import util.FileIO;

import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleetList = new ArrayList<>();
    private FileIO io = new FileIO();
    private String path = "data/cars.csv";

    public void addCar(Car car) {
        fleetList.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;
        for (Car c : fleetList) {
            totalFee += c.getRegistrationFee();
        }
        return totalFee;
    }


    public void saveFleetToFile() {
        ArrayList<String> dataList = new ArrayList<>();
        String header = "License plate, Brand, Model, Doors, Km/L, Particle, Battery, Range";
        for (Car c : fleetList) {
            String data = c.toCSV();
            dataList.add(data);
        }
        io.saveData(header, dataList, path);
    }



    @Override
    public String toString() { //Læs op på nedenstående!
        StringBuilder output = new StringBuilder("Cars in fleet:\n");
        for (Car c : fleetList) {
            output.append(c.toString()).append("\n");
        }
        return output.toString();
    }
}
