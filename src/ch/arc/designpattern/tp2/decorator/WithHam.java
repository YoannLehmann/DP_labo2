package ch.arc.designpattern.tp2.decorator;

public class WithHam extends PizzaDecorator {

	public WithHam(Pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getPrice() + 2;
	}

	@Override
	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getTaste() + " hamy";
	}

	@Override
	public String getAroma() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getAroma() + " salty";
	}
	
	@Override
	public String toString() {
		return this.decoratedPizza.toString() + " ham";
	}
}
