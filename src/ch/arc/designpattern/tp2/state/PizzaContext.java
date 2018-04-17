package ch.arc.designpattern.tp2.state;

import ch.arc.designpattern.tp2.decorator.Pizza;

public class PizzaContext {
	private PizzaState state;
	private Pizza pizza;
	
	public PizzaContext(Pizza pizza) {
		this.pizza = pizza;
		this.state = new OrderedState();
	}
	
	public PizzaState getState() {
		return state;
	}

	public void setPizzaState(PizzaState state) {
		this.state = state;
	}
	
	public Pizza getPizza() {
		return pizza;
	}
	@Override
	public String toString() {
		return "The pizza is " + state.toString();
	}
	
}
