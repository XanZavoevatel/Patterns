package generative.abstractFactory.lada;

import generative.abstractFactory.factory.Wheels;

public class LadaWheels implements Wheels {
    @Override
    public void spinTheWheels() {
        System.out.println("Колеса лады крутятся");
    }
}
