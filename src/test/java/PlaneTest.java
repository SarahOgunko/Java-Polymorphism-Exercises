import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest {

    Plane plane;
    Vehicle vehicle;

    @BeforeEach
    void setUp(){
        plane = new Plane("Easyjet","Jet Fuel",3);
    }

    @Test
    void canMakeNoise(){
        assertThat(plane.makeNoise()).isEqualTo("Whooosh");
    }

}
