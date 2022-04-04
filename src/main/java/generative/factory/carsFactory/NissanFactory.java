package generative.factory.carsFactory;

import generative.factory.cars.Cars;
import generative.factory.cars.Nissan;

public class NissanFactory implements CarsFactory{

    @Override
    public Cars createCar() {
        return new Nissan();
    }
}
