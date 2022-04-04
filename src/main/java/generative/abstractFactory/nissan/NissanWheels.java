package generative.abstractFactory.nissan;

import generative.abstractFactory.factory.Wheels;

public class NissanWheels implements Wheels {
    @Override
    public void spinTheWheels() {
        System.out.println("Колеса ниссана крутятся");
    }
}
