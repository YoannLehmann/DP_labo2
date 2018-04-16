package ch.arc.designpattern.tp2.state;

import ch.arc.designpattern.tp2.decorator.Pizza;

public class FailedState implements PizzaState {

	@Override
	public float getLactose(Pizza context) {		
		// Exception -> la pizza est ratée.
		return 0;
	}

	@Override
	public String getTaste(Pizza context) {
		// Exception -> la pizza est ratée.
		return null;
	}

	@Override
	public String getAroma(Pizza context) {
		// Exception -> la pizza est ratée.
		return null;
	}

	@Override
	public String toString() {
		return "ratée";
	}
	
	@Override
	public void prepare(Pizza context) {
		// Exception -> la pizza est ratée.
	}

	@Override
	public void cook(Pizza context) {
		// Exception -> la pizza est ratée.
	}

}
