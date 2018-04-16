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
		return "Goût pizza crue";
	}

	@Override
	public String getAroma(PizzaContext context) {
		return "Arôme pizza crue";
	}

	@Override
	public String toString() {
		return "préparée";
	}
	
	@Override
	public void prepare(PizzaContext context) {
		// ne fait rien (la pizza est dÃ©jÃ  prÃ©parÃ©e).
	}

	@Override
	public void cook(PizzaContext context) {
		context.setPizzaState(new CoockedState());
	}
}
