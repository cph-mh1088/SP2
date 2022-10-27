public class GasolineCar extends AFuelCar{

    //Field
    public String getFuelType;

    //Constructor
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, String getFuelType) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.getFuelType = getFuelType;
    }

    //Implements the two abstract methods. No longer abstract class, therefore can fill method body.
    @Override
    public String getFuelType() {
        return getFuelType;
    }

    @Override
    public int getRegistrationFee() {
        if (kmPrLitre >= 20 && kmPrLitre <= 50){
            return 330;
        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            return 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            return 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            return 5500;
        } else if (kmPrLitre > 5) {
            return 10470;
        }
        return getRegistrationFee();
    }

    @Override
    public String toString() {
        return "GasolineCar" +
                ", registrationNumber = " + registrationNumber +
                ", make = " + make +
                ", model = " + model +
                ", numberOfDoors = " + numberOfDoors +
                ", kmPrLitre = " + kmPrLitre +
                ", getFuelType = " + getFuelType +
                "\n";

    }
}
