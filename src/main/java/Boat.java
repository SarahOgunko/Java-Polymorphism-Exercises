
public class Boat implements Waterable{

    String name;

    public Boat(String name) {
        this.name = name;
    }

    public String  capacityNumber(int capacity){
        return this.name + " has a capacity of " + capacity + " people";
    }


}
