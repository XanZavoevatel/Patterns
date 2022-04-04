package generative.abstractFactory.nissan;

import generative.abstractFactory.factory.Rudder;

public class NissanRudder implements Rudder {
    @Override
    public void spineTheRudder() {
        System.out.println("КРутим руль ниссана");
    }
}
