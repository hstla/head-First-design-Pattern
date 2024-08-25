package chapter03.condimentDecorator;

import chapter03.beverage.Beverage;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 우유";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}
