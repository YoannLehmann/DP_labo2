package ch.arc.designpattern.tp2.state;

public class FailedState implements PizzaState {

	@Override
	public int getLactose() {		
		// Exception -> la pizza est ratée.
		return 0;
	}

	@Override
	public String getTaste() {
		// Exception -> la pizza est ratée.
		return null;
	}

	@Override
	public String getAroma() {
		// Exception -> la pizza est ratée.
		return null;
	}

	@Override
	public void prepare(PizzaContext context) {
		// Exception -> la pizza est ratée.
	}

	@Override
	public void cook(PizzaContext context) {
		// Exception -> la pizza est ratée.
	}

}
