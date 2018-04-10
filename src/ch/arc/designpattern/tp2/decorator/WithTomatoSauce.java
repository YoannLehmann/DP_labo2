package ch.arc.designpattern.tp2.decorator;

public class WithTomatoSauce extends PizzaDecorator {

	public WithTomatoSauce(Pizza p) {
		super(p);
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getPrice() + 1;
	}

	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getTaste() + " tomatoly";
	}

	@Override
	public String getAroma() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getAroma() + " ";
	}
	
	@Override
	public String toString() {
		return this.decoratedPizza.toString() + " with tomato";
	}
}
