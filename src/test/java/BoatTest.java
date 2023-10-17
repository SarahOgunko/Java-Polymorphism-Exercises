import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoatTest {

    Boat boat;

    @BeforeEach
    public void setUp(){
        boat = new Boat("Boat");
    }

    @Test
    public void capacityNumber(){
        String result = boat.capacityNumber(50);
        assertThat(result).isEqualTo( "Boat has a capacity of 50 people");
    }




}
