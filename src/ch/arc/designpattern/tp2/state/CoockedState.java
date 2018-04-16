package ch.arc.designpattern.tp2.state;

import ch.arc.designpattern.tp2.decorator.Pizza;

public class CoockedState implements PizzaState {

	@Override
	public float getLactose(Pizza context) {
		return context.getLactose() / 2;
	}

	@Override
	public String getTaste(Pizza context) {
		return context.getTaste();
	}

	@Override
	public String getAroma(Pizza context) {
		return context.getAroma();
	}
	
	@Override
	public String toString() {
		return "cuite";
	}

	@Override
	public void prepare(Pizza context) {
		// exception -> la pizza est déjà cuite.
	}

	@Override
	public void cook(Pizza context) {
		context.setPizzaState(new FailedState());
	}

}
