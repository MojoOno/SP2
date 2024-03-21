public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        Car gasolineCar1 = new GasolinCar("DJ 40048", "Toyota", "Yaris", 5, 22);
        Car gasolineCar2 = new GasolinCar("YO 00001", "Porsche", "Panamera", 5, 11);
        Car dieselCar1 = new DieselCar("AB 12345", "Ford", "Mustang", 3, 18, true);
        Car dieselCar2 = new DieselCar("IB 04081", "Fiat", "Multipla", 7, 18, false);
        Car electricCar1 = new ElectricCar("BI 01337", "Tesla", "Candy", 5, 75, 576);
        Car electricCar2 = new ElectricCar("SO 44444", "Audi", "Q7", 5, 60, 600);

        fleet.addCar(gasolineCar1);
        fleet.addCar(gasolineCar2);
        fleet.addCar(dieselCar1);
        fleet.addCar(dieselCar2);
        fleet.addCar(electricCar1);
        fleet.addCar(electricCar2);

        System.out.println(fleet);

        System.out.println("Registration fee of entire fleet: " + fleet.getTotalRegistrationFeeForFleet() + ",-");

        fleet.saveFleetToFile();

    }
}