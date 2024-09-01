package chapter03.beverage;

import chapter03.beverage.Beverage;
import chapter03.beverage.DarkRoast;
import chapter03.beverage.Espresso;
import chapter03.beverage.HouseBlend;
import chapter03.condimentDecorator.Mocha;
import chapter03.condimentDecorator.Soy;
import chapter03.condimentDecorator.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Espresso beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.GRANDE);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
