package ch.arc.designpattern.tp2.state;

public class FailedState implements PizzaState {

	@Override
	public float getLactose(PizzaContext context) throws Exception{		
		// Exception -> la pizza est ratée.
		throw new Exception("The pizza is burned.");
	}

	@Override
	public String getTaste(PizzaContext context) throws Exception{
		// Exception -> la pizza est ratée.
		throw new Exception("The pizza is burned");
	}

	@Override
	public String getAroma(PizzaContext context) throws Exception{
		// Exception -> la pizza est ratée.
		throw new Exception("The pizza is burned");
	}

	@Override
	public String toString() {
		return "burned";
	}
	
	@Override
	public void prepare(PizzaContext context) throws Exception{
		// Exception -> la pizza est ratée.
		throw new Exception("The pizza is burned");
	}

	@Override
	public void cook(PizzaContext context) throws Exception {
		// Exception -> la pizza est ratée.
		throw new Exception("The pizza is burned");
	}

}
