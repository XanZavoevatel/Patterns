package generative.abstractFactory;

import generative.abstractFactory.factory.CarFactory;
import generative.abstractFactory.factory.Engine;
import generative.abstractFactory.factory.Rudder;
import generative.abstractFactory.factory.Wheels;
import generative.abstractFactory.lada.LadaFactory;
import generative.abstractFactory.nissan.NissanFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory car = createCar("nissan");
        Engine carEngine = car.getEngine();
        Rudder carRudder = car.getRudder();
        Wheels carWheels = car.getWheels();

        carEngine.workEngine();
        carRudder.spineTheRudder();
        carWheels.spinTheWheels();

    }
    static CarFactory createCar(String brand) {
        if (brand.equalsIgnoreCase("lada")) {
            return  new LadaFactory();
        } else if (brand.equalsIgnoreCase("nissan")) {
            return new NissanFactory();
        } else {
            throw new RuntimeException("нет такой машины");
        }
    }
}
