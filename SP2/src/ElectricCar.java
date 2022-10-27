public class ElectricCar extends ACar{

    //Fields
    private int batteryCapacity;
    private int maxRange;


    //Constructor
    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    //Newly added methods
    public int getBatteryCapacityKWh(){ // returns the battery capacity in kilowatt hours
        return batteryCapacity;
    }
    public int getMaxRangeKm(){return maxRange;}
    public int getWhPrKm(){ // returns the power consumption in watt hours per driven kilometre.
        return batteryCapacity/maxRange;
    }

    @Override
    public int getRegistrationFee() {
       double convert = (int) (100 / (getWhPrKm()/91.25));

        if (convert >= 20 && convert <= 50){
            return 330;
        } else if (convert >= 15 && convert <= 20) {
            return 1050;
        } else if (convert >= 10 && convert <= 15) {
            return 2340;
        } else if (convert>= 5 && convert <= 10) {
            return 5500;
        } else if (convert > 5) {
            return 10470;
        }
        return getRegistrationFee();
    }

    @Override
    public String toString() {
        return "ElectricCar" +
                ", registrationNumber = " + registrationNumber +
                ", make = " + make +
                ", model = " + model +
                ", numberOfDoors = " + numberOfDoors +
                ", batteryCapacity = " + batteryCapacity +
                ", maxRange = " + maxRange +
                "\n";
    }
}

