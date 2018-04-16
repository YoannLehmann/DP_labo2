package ch.arc.designpattern.tp2.decorator;

import ch.arc.designpattern.tp2.state.PizzaState;

public abstract class PizzaDecorator implements Pizza {
	
	protected final Pizza decoratedPizza;
	
	public PizzaDecorator(Pizza p) {
		// TODO Auto-generated constructor stub
		this.decoratedPizza = p;
	}
	
	public void setPizzaState(PizzaState state) {
		
	}
	
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getPrice();
	}

	@Override
	public boolean isSpicy() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.isSpicy();
	}

	@Override
	public float getLactose() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getLactose();
	}

	@Override
	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.isVegetarian();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getSize();
	}
	
	@Override
	public void setSize(int size) {
		this.decoratedPizza.setSize(size);
	}

	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getTaste();
	}

	@Override
	public String getAroma() {
		// TODO Auto-generated method stub
		return this.decoratedPizza.getAroma();
	}
	
	@Override
	public String toString() {
		return this.decoratedPizza.toString();
	}

}
