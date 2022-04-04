package generative.factory.carsFactory;

import generative.factory.cars.Cars;
import generative.factory.cars.Lada;

public class LadaFactory implements CarsFactory{
    @Override
    public Cars createCar() {
        return new Lada();
    }
}
