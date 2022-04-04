package generative.abstractFactory.factory;

public interface CarFactory {
    Rudder getRudder();
    Engine getEngine();
    Wheels getWheels();
}
