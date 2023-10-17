public class Car extends Vehicle{

    public int passengerNumber;

    public Car(String name,String fuelType, int numberOfWheels, int passengerNumber) {
        super(name, fuelType, numberOfWheels);
        this.passengerNumber = passengerNumber;
    }


    public String makeNoise() {
        return "Honk Honk";
    }

    public String makeNoise(String message ){
        return "I am a car " + message;
    }

    public void addPassengers(int passengers){
        this.passengerNumber += passengers;
    }

    public int getPassengerNumber(){
        return passengerNumber;
    }

}
