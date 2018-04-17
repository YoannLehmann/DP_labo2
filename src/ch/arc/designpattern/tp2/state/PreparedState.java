package ch.arc.designpattern.tp2.state;

public class PreparedState implements PizzaState {

	@Override
	public float getLactose(PizzaContext context) {
		// TODO Auto-generated method stub
		return context.getPizza().getLactose();
	}

	@Override
	public String getTaste(PizzaContext context) {
		return "raw pizza taste";
	}

	@Override
	public String getAroma(PizzaContext context) {
		return "raw pizza aroma";
	}

	@Override
	public String toString() {
		return "prepared";
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
