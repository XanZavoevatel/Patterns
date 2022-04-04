package generative.abstractFactory.nissan;

import generative.abstractFactory.factory.CarFactory;
import generative.abstractFactory.factory.Engine;
import generative.abstractFactory.factory.Rudder;
import generative.abstractFactory.factory.Wheels;

public class NissanFactory implements CarFactory {
    @Override
    public Engine getEngine() {
        return new NissanEngine();
    }

    @Override
    public Rudder getRudder() {
        return new NissanRudder();
    }

    @Override
    public Wheels getWheels() {
        return new NissanWheels();
    }
}
