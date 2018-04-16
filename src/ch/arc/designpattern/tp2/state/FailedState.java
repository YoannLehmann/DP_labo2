package ch.arc.designpattern.tp2.state;

import ch.arc.designpattern.tp2.decorator.Pizza;

public class FailedState implements PizzaState {

	@Override
	public float getLactose(PizzaContext context) throws Exception{		
		// Exception -> la pizza est ratée.
		throw new Exception("Pizza is burned");
	}

	@Override
	public String getTaste(PizzaContext context) throws Exception{
		// Exception -> la pizza est ratée.
		throw new Exception("Pizza is burned");
	}

	@Override
	public String getAroma(PizzaContext context) throws Exception{
		// Exception -> la pizza est ratée.
		throw new Exception("Pizza is burned");
	}

	@Override
	public String toString() {
		return "rat�e";
	}
	
	@Override
	public void prepare(PizzaContext context) throws Exception{
		// Exception -> la pizza est ratée.
		throw new Exception("Pizza is burned");
	}

	@Override
	public void cook(PizzaContext context) throws Exception {
		// Exception -> la pizza est ratée.
		throw new Exception("Pizza is burned");
	}

}
