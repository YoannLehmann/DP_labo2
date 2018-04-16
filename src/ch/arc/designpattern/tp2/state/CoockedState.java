package ch.arc.designpattern.tp2.state;

import ch.arc.designpattern.tp2.decorator.Pizza;

public class CoockedState implements PizzaState {

	@Override
	public float getLactose(PizzaContext context) {
		return context.getPizza().getLactose() / 2;
	}

	@Override
	public String getTaste(PizzaContext context) {
		return context.getPizza().getTaste();
	}

	@Override
	public String getAroma(PizzaContext context) {
		return context.getPizza().getAroma();
	}
	
	@Override
	public String toString() {
		return "cuite";
	}

	@Override
	public void prepare(PizzaContext context) throws Exception{
		throw new Exception("Pizza is already cooked");
		// exception -> la pizza est déjà cuite.
	}

	@Override
	public void cook(PizzaContext context) {
		context.setPizzaState(new FailedState());
	}

}
