package generative.factory;

import generative.factory.cars.Cars;
import generative.factory.cars.Lada;
import generative.factory.cars.Nissan;
import generative.factory.carsFactory.CarsFactory;
import generative.factory.carsFactory.LadaFactory;
import generative.factory.carsFactory.NissanFactory;

public class Main {
    public static void main(String[] args) {
        CarsFactory carsFactory = createCar("nissan");
        Cars car = carsFactory.createCar();
        car.printMaxSpeed();

    }
    private static CarsFactory createCar(String brand) {
        if (brand.equalsIgnoreCase("lada")) {
            return new LadaFactory();
        } else if (brand.equalsIgnoreCase("nissan")) {
            return new NissanFactory();
        } else {
            throw new RuntimeException("нет такой машины");
        }

    }
}
