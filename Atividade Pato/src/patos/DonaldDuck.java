package patos;

import voos.FlyWithWings;
import Quack.Quack;

public class DonaldDuck extends Duck {

    public DonaldDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Sou um pato Donald!");
    }
}