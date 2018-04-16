package ch.arc.designpattern.tp2.decorator;

public class WithSmokedSalmon extends PizzaDecorator {

	public WithSmokedSalmon(Pizza p) {
		super(p);
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getPrice() + 4;
	}

	@Override
	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getTaste() + " salmony";
	}

	@Override
	public String getAroma() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getAroma() + " a good taste of salmon";
	}
	
	@Override
	public String toString() {
		return this.decoratedPizza.toString() + " salmon";
	}
}
