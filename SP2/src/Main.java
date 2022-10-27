import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FleetOfCars carFleet = new FleetOfCars();
        GasolineCar gasolineCar0 = new GasolineCar("JW 20 990", "Opel","Kadett",3, 15, "Gasoline");
        DieselCar dieselCar0 = new DieselCar("MD 21 233", "VW", "Golf", 5, 25, "Diesel", true);
        DieselCar dieselCar1 = new DieselCar("BY 37 433", "Peugeot", "208", 5, 33,"Diesel", false);
        ElectricCar electricCar0 = new ElectricCar("HG 30 202", "Renault","Zoe",3,22,400);

        carFleet.addCar(gasolineCar0);
        carFleet.addCar(dieselCar0);
        carFleet.addCar(dieselCar1);
        carFleet.addCar(electricCar0);

        System.out.println(carFleet);
        System.out.println("The total cost of registration fees comes to: " + carFleet.getTotalRegistrationFeeForFleet() + " kr.");
    }
}
