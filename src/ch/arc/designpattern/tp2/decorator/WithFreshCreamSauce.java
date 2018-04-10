package ch.arc.designpattern.tp2.decorator;

public class WithFreshCreamSauce extends PizzaDecorator {

	public WithFreshCreamSauce(Pizza p) {
		super(p);
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getPrice() + 1;
	}

	@Override
	public float getLactose() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getLactose() + 75;
	}

	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getTaste() + " creamy";
	}

	@Override
	public String getAroma() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getAroma();
	}
	
	@Override
	public String toString() {
		return this.decoratedPizza.toString() + " with cream sauce";
	}
}
