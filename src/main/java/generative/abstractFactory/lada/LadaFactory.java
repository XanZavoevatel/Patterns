package generative.abstractFactory.lada;

import generative.abstractFactory.factory.CarFactory;
import generative.abstractFactory.factory.Engine;
import generative.abstractFactory.factory.Rudder;
import generative.abstractFactory.factory.Wheels;

public class LadaFactory implements CarFactory {
    @Override
    public Engine getEngine() {
        return new LadaEngine();
    }

    @Override
    public Rudder getRudder() {
        return new LadaRudder();
    }

    @Override
    public Wheels getWheels() {
        return new LadaWheels();
    }
}
