package training.util;

import training.data.Car;
import training.data.Cars;

/**
 * Utility class to create object with predefined information, in tests.
 */
public class TestModelGenerator {

    /**
     * Get first test data.
     *
     * @return Cars object filled with data from resource files.
     */
    public static Cars getTestData1() {
        final Cars example = new Cars();

        final Car car = new Car();
        car.setNumber("123456");
        example.getCars().add(car);

        final Car car2 = new Car();
        car2.setNumber("5448393");
        example.getCars().add(car2);

        final Car car3 = new Car();
        car3.setNumber("93999399");
        example.getCars().add(car3);

        return example;
    }
}
