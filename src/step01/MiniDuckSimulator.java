package step01;

import step01.duck.Duck;
import step01.duck.MallarDuck;
import step01.duck.ModelDuck;
import step01.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallarDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}