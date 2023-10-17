public class Plane extends Vehicle{

    public Plane(String name, String fuelType, int numberOfWheels){
        super(name,fuelType,numberOfWheels);
    }

    public String makeNoise(){
        return "Whooosh";
    }

}
