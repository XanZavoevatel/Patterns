package generative.factory.cars;

import generative.factory.cars.Cars;

public class Lada implements Cars {


    @Override
    public void printMaxSpeed() {
        System.out.println("120 km/h");
    }
}
