package training.parser.jsonparser;

import training.data.Car;
import training.data.Cars;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: azhiltsov
 * Date: 14.01.14
 * Time: 15:14
 */
public class JacksonCarsListBuilder {
    private List<Car> car = new ArrayList<Car>();

    public JacksonCarsListBuilder() {

    }

    public JacksonCarsListBuilder withCars(final List<Car> cars) {
        car = cars;
        return this;
    }

    public Cars build() {
        final Cars cars = new Cars();
        cars.getCars().addAll(car);
        return cars;
    }

}
