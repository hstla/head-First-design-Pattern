package chapter01.step01.duck;

import chapter01.step01.fly.FlyWithWings;
import chapter01.step01.quack.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
