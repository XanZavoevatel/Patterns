package generative.abstractFactory.lada;
import generative.abstractFactory.factory.*;

public class LadaEngine implements Engine{
    @Override
    public void workEngine() {
        System.out.println("Двигатель Лады запущен");
    }
}
