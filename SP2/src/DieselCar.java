public class DieselCar extends AFuelCar {

    //Fields
    public String getFuelType;
    public boolean particleFilter;

    //Constructor
    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre,String getFuelType, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.getFuelType = getFuelType;
        this.particleFilter = particleFilter;
    }

    //Method to check for particle filter
    public boolean hasParticleFilter(){ return particleFilter;}

    //Implements the two abstract methods
    @Override
    public String getFuelType() {return getFuelType;}
    @Override
    public int getRegistrationFee() {
        int extraFee = 0;
        if (!hasParticleFilter()) extraFee = 1000;
        if (kmPrLitre >= 20 && kmPrLitre <= 50){
                return 330 + 130 +extraFee; // + udligningsudgift. Hardcoded ind? Dårlig stil og ikke særlig fleksibelt ift. prisstigninger.
            } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
                return 1050 + 1390 + extraFee;
            } else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
                return 2340 + 1850 + extraFee;
            } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
                return 5500 + 2770 + extraFee;
            } else if (kmPrLitre > 5) {
                return 10470 + 15260 + extraFee;
            }
            return getRegistrationFee();
        }

    @Override
    public String toString() {
        return "DieselCar" +
                ", registrationNumber = " + registrationNumber +
                ", make = " + make +
                ", model = " + model +
                ", numberOfDoors = " + numberOfDoors +
                ", kmPrLitre = " + kmPrLitre +
                ", getFuelType = " + getFuelType +
                ", particleFilter = " + particleFilter +
                "\n";
    }
}
