public class OnWater extends Vehicle {

    private int noEngines;
    private int cargoCapacity;

    public OnWater(String serialNumber, int noPersons){
        super(serialNumber,noPersons);
    }

    public OnWater(String serialNumber, int noPersons, String name){
        super(serialNumber,noPersons,name);
    }

    public OnWater(String serialNumber, int noPersons, String name, int noEngines){
        super(serialNumber,noPersons,name);
        this.noEngines = noEngines;
    }

    public OnWater(String serialNumber, int noPersons, String name, int noEngines, int cargoCapacity){
        super(serialNumber,noPersons,name);
        this.noEngines = noEngines;
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public boolean goTo(double positionX, double positionY) {
        System.out.println("Sailing the vessel to coordinates: [" + positionX + ", " + positionY + "]");
        return true;
    }

    @Override
    public boolean addFuel(double amount) {
        System.out.println("Adding " + amount + " l of fuel to the vessel");
        return true;
    }

    @Override
    public void prinInfo() {
        super.prinInfo();
        System.out.println("Drivind vehicle proporties: \n" +
                "- number of engines: " + this.noEngines +
                "\n- cargo capacity: " + this.cargoCapacity);
    }
}
