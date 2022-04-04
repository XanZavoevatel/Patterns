package generative.factory.cars;

import generative.factory.cars.Cars;

public class Nissan implements Cars {

    @Override
    public void printMaxSpeed() {
        System.out.println("180 km/h");
    }
}
