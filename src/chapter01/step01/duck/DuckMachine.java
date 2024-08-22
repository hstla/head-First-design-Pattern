package chapter01.step01.duck;

import chapter01.step01.quack.Quack;
import chapter01.step01.quack.QuackBehavior;

public class DuckMachine {
    QuackBehavior quack;

    public DuckMachine() {
        this.quack = new Quack();
    }

    public void performQuack() {
        quack.quack();
    }
}
