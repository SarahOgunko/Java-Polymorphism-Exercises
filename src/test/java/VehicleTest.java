import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class VehicleTest {

    Vehicle vehicle;
    Plane plane;

    @BeforeEach
    void setUp(){
        vehicle = new Plane("plane", "petrol",3);


    }
    @Test
    void canMakeNoise(){
        assertThat(plane.makeNoise()).isEqualTo("Whooosh");
    }



}
