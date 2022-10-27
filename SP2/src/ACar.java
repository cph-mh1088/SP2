public abstract class ACar implements Car {

    //Fields
    public String registrationNumber; //Not final. Can change over time.
    public final String make;
    public final String model;
    public final int numberOfDoors;

    //Constructor
    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    //Inherited methods from Car (minus getRegistrationFee()).
    @Override
    public String getRegistrationNumber() {return null;}
    @Override
    public String getMake() {return null;}
    @Override
    public String getModel() {return null;}
    @Override
    public int getNumberOfDoors() {return 0;}

    @Override
    public String toString() {
        return "ACar{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}


