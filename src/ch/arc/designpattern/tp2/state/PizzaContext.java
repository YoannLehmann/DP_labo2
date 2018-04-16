package ch.arc.designpattern.tp2.state;

public class PizzaContext {
	private PizzaState state;
	
	public PizzaContext() {
		this.state = new CommandedState();
	}
	
	public void setPizzaState(PizzaState state) {
		this.state = state;
	}
	
	
}
