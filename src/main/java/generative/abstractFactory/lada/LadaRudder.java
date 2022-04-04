package generative.abstractFactory.lada;

import generative.abstractFactory.factory.Rudder;

public class LadaRudder implements Rudder {
    @Override
    public void spineTheRudder() {
        System.out.println("Крутим руль лады");
    }
}
