package ch.arc.designpattern.tp2.decorator;

public class WithMushrooms extends PizzaDecorator {

	public WithMushrooms(Pizza p) {
		super(p);
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getPrice() + 2;
	}

	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getTaste() + " mushroomly";
	}

	@Override
	public String getAroma() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getAroma() + " ";
	}
	
	@Override
	public String toString() {
		return this.decoratedPizza.toString() + " with mushrooms";
	}
}
