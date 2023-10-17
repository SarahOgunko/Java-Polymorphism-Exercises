public abstract class Vehicle {

    private String name;
    private String fuelType;
    private int numberOfWheels;

    public Vehicle(String name, String fuelType, int numberOfWheels){
        this.name = name;
        this.fuelType = fuelType;
        this.numberOfWheels = numberOfWheels;

    }
    public abstract String makeNoise();

}
