import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {


    Garage garage;
    Vehicle vehicle;

    @BeforeEach
    void setUp(){
        garage = new Garage();
        vehicle = new Car("car", "petrol",4, 7);
    }

    @Test
    void canCountVehicles() {
        assertThat(garage.countVehicles()).isEqualTo(0);
    }

    @Test
    void canAddVehicles(){
        garage.addVehicles(vehicle);
        assertThat(garage.countVehicles()).isEqualTo(1);
    }


}
