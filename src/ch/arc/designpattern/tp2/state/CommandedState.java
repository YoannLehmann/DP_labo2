package ch.arc.designpattern.tp2.state;

import ch.arc.designpattern.tp2.decorator.Pizza;

public class CommandedState implements PizzaState {

	@Override
	public float getLactose(PizzaContext context) {
		return 0;	
	}

	@Override
	public String getTaste(PizzaContext context) {
		return "Pas de goût";
	}

	@Override
	public String getAroma(PizzaContext context) {
		return "Pas d'arôme";
	}
	
	@Override
	public String toString() {
		return "commandée";
	}

	@Override
	public void prepare(PizzaContext context) {
		context.setPizzaState(new PreparedState());
	}

	@Override
	public void cook(PizzaContext context) throws Exception {
		throw new Exception("Pizza is not prepared");
		// Exception : la pizza n'est pas prÃ©parÃ©e.
	}

}
