import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Ford Fiesta", "petrol", 4, 7);
    }

    @Test
    void canMakeNoise() {
        assertThat(car.makeNoise()).isEqualTo("Honk Honk");
    }

    @Test
    public void canMakeNoise__withArguments() {
        String expected = "I am a car and I go, Honk Honk!";
        String actual = car.makeNoise("and I go, Honk Honk!");
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void addPassengers() {
        car.addPassengers(1);
        assertThat(car.getPassengerNumber()).isEqualTo(8);

    }

    @Test
    public void getPassengers() {
        car.getPassengerNumber();
        assertThat(car.getPassengerNumber()).isEqualTo(7);

    }
}
