public class OnAir extends Vehicle {

    private int noTurbines;
    boolean hasFirstClass;

    public OnAir(String serialNumber, int noPersons) {
        super(serialNumber, noPersons);
    }

    public OnAir(String serialNumber, int noPersons, String name) {
        super(serialNumber, noPersons, name);
    }

    public OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
        super(serialNumber, noPersons, name);
        this.noTurbines = noTurbines;
    }

    public OnAir(String serialNumber, int noPersons, String name, int noTurbines, boolean hasFirstClass) {
        super(serialNumber, noPersons, name);
        this.noTurbines = noTurbines;
        this.hasFirstClass = hasFirstClass;
    }

    @Override
    public boolean goTo(double positionX, double positionY) {
        System.out.println("Flying the airplane to coordinates: [" + positionX + ", " + positionY + "]");
        return true;
    }

    @Override
    public boolean addFuel(double amount) {
        System.out.println("Adding " + amount + "l of fuel to the airplane");
        return true;
    }

    @Override
    public void prinInfo() {
        super.prinInfo();
        if (this.hasFirstClass == true) {
            System.out.println("Drivind vehicle proporties: \n" +
                    "- number of turbines: " + this.noTurbines +
                    "\n- has first class");
        }
        if (this.hasFirstClass == false) {
            System.out.println("Drivind vehicle proporties: \n" +
                    "- number of turbines: " + this.noTurbines +
                    "\n- does not have first class");
        }
    }
}
