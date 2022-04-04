package generative.abstractFactory.nissan;

import generative.abstractFactory.factory.Engine;

public class NissanEngine implements Engine {
    @Override
    public void workEngine() {
        System.out.println("Двигатель ниссана запущен");
    }
}
