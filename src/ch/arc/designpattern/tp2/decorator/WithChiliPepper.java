package ch.arc.designpattern.tp2.decorator;

public class WithChiliPepper extends PizzaDecorator {

	public WithChiliPepper(Pizza p) {
		super(p);
	}
	
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getPrice() + 0.5f;
	}

	@Override
	public boolean isSpicy() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getTaste() + " spicy";
	}

	@Override
	public String getAroma() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getAroma() + " spicy";
	}
	
	@Override
	public String toString() {
		return this.decoratedPizza.toString() + " chili pepper";
	}
}
