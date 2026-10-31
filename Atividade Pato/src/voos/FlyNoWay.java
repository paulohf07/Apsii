package voos;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Quack, não voou mano!");
    }
}