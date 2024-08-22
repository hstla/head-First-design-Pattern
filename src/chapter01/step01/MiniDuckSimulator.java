package chapter01.step01;

import chapter01.step01.duck.Duck;
import chapter01.step01.duck.DuckMachine;
import chapter01.step01.duck.MallarDuck;
import chapter01.step01.duck.ModelDuck;
import chapter01.step01.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallarDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        // 오리 호출기
        DuckMachine duckMachine = new DuckMachine();
        duckMachine.performQuack();
    }
}