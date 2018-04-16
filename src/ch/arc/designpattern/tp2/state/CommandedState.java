package ch.arc.designpattern.tp2.state;

import ch.arc.designpattern.tp2.decorator.Pizza;

public class CommandedState implements PizzaState {

	@Override
	public float getLactose(Pizza context) {
		return context.getLactose();	
	}

	@Override
	public String getTaste(Pizza context) {
		return "Pas de goût";
	}

	@Override
	public String getAroma(Pizza context) {
		return "Pas d'arôme";
	}
	
	@Override
	public String toString() {
		return "commandée";
	}

	@Override
	public void prepare(Pizza context) {
		context.setPizzaState(new PreparedState());
	}

	@Override
	public void cook(Pizza context) {
		// Exception : la pizza n'est pas préparée.
	}

}
