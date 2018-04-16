package ch.arc.designpattern.tp2.state;

public class CommandedState implements PizzaState {

	@Override
	public int getLactose() {
		return 0;	// Pas de lactose, la pizza n'est pas encore préparée.
	}

	@Override
	public String getTaste() {
		return "Pas de goût";
	}

	@Override
	public String getAroma() {
		return "Pas d'arôme";
	}

	@Override
	public void prepare(PizzaContext context) {
		context.setPizzaState(new PreparedState());
	}

	@Override
	public void cook(PizzaContext context) {
		// Exception : la pizza n'est pas préparée.
	}

}
