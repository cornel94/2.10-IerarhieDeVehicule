public class Vehicle {

    private final String serialNumber;
    private int noPersons;
    private String name;

    public Vehicle(String serialNumber, int noPersons){
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
    }

    public Vehicle(String serialNumber, int noPersons, String name){
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
        this.name = name;
    }

    public final String getSerialNumber(){
        return this.serialNumber;
    }

    public boolean goTo(double positionX, double positionY){
        System.out.println("Error: unknown vehicle cannot move…");
        return false;
    }

    public boolean addFuel(double amount){
        System.out.println("Error: unknown type of vehicle…");
        return false;
    }

    public void prinInfo(){
        System.out.println("Vehicle proporties: \n" +
                "- serial number: " + this.serialNumber +
                "\n- capacity: " + this.noPersons + " persons\n" +
                "- name: " + this.name);
    }
}
