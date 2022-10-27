import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();
    public void addCar (Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int test = 0;
        for (int i = 0; i < fleet.size(); i++) {
            test += fleet.get(i).getRegistrationFee();
        }
            return test;
    }

    @Override
    public String toString() {
        return "FleetOfCars:" + "\n"+ fleet;
    }
}
