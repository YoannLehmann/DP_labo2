package ch.arc.designpattern.tp2.state;

import ch.arc.designpattern.tp2.decorator.Pizza;

public class PreparedState implements PizzaState {

	@Override
	public float getLactose(PizzaContext context) {
		// TODO Auto-generated method stub
		return context.getPizza().getLactose();
	}

	@Override
	public String getTaste(PizzaContext context) {
		return "Go�t pizza crue";
	}

	@Override
	public String getAroma(PizzaContext context) {
		return "Ar�me pizza crue";
	}

	@Override
	public String toString() {
		return "pr�par�e";
	}
	
	@Override
	public void prepare(PizzaContext context) {
		// ne fait rien (la pizza est déjà préparée).
	}

	@Override
	public void cook(PizzaContext context) {
		context.setPizzaState(new CoockedState());
	}
}
