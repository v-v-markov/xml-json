package training.parser.jsonparser;

import training.data.Car;

/**
 * Created with IntelliJ IDEA.
 * User: azhiltsov
 * Date: 14.01.14
 * Time: 15:50
 */
public class JacksonCarBuilder {
    private String number;

    public JacksonCarBuilder() {

    }

    public JacksonCarBuilder withNumber(final String number) {
        this.number = number;
        return this;
    }

    public Car build() {
        final Car car = new Car();
        car.setNumber(number);
        return car;
    }

}
