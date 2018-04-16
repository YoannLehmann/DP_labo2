package ch.arc.designpattern.tp2.state;

import ch.arc.designpattern.tp2.decorator.Pizza;

public class PreparedState implements PizzaState {

	@Override
	public float getLactose(Pizza context) {
		// TODO Auto-generated method stub
		return context.getLactose();
	}

	@Override
	public String getTaste(Pizza context) {
		return "Goût pizza crue";
	}

	@Override
	public String getAroma(Pizza context) {
		return "Arôme pizza crue";
	}

	@Override
	public String toString() {
		return "préparée";
	}
	
	@Override
	public void prepare(Pizza context) {
		// ne fait rien (la pizza est déjà préparée).
	}

	@Override
	public void cook(Pizza context) {
		context.setPizzaState(new CoockedState());
	}
}
