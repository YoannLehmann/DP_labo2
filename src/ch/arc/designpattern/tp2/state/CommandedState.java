package ch.arc.designpattern.tp2.state;

import ch.arc.designpattern.tp2.decorator.Pizza;

public class CommandedState implements PizzaState {

	@Override
	public float getLactose(PizzaContext context) {
		return 0;	
	}

	@Override
	public String getTaste(PizzaContext context) {
		return "Pas de go�t";
	}

	@Override
	public String getAroma(PizzaContext context) {
		return "Pas d'ar�me";
	}
	
	@Override
	public String toString() {
		return "command�e";
	}

	@Override
	public void prepare(PizzaContext context) {
		context.setPizzaState(new PreparedState());
	}

	@Override
	public void cook(PizzaContext context) throws Exception {
		throw new Exception("Pizza is not prepared");
		// Exception : la pizza n'est pas préparée.
	}

}
