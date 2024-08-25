package chapter03.condimentDecorator;

import chapter03.beverage.Beverage;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 두유";
	}

	public double cost() {
		double cost = beverage.cost() + .15;
//		if (beverage.getSize() == Size.TALL) {
//			cost += .10;
//		} else if (beverage.getSize() == Size.GRANDE) {
//			cost += .15;
//		} else if (beverage.getSize() == Size.VENTI) {
//			cost += .20;
//		}
		return cost;
	}
}
