package ch.arc.designpattern.tp2.decorator;

public class WithMozzarella extends PizzaDecorator {

	public WithMozzarella(Pizza p) {
		super(p);
	}
	
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getPrice() + 1.5f;
	}

	@Override
	public float getLactose() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getLactose() + 100;
	}
	
	@Override
	public String toString() {
		return this.decoratedPizza.toString() + " with mozzarella";
	}
}
