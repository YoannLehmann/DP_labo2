package ch.arc.designpattern.tp2.state;

public class OrderedState implements PizzaState {

	@Override
	public float getLactose(PizzaContext context) {
		return 0;	
	}

	@Override
	public String getTaste(PizzaContext context) {
		return "no taste";
	}

	@Override
	public String getAroma(PizzaContext context) {
		return "no aroma";
	}
	
	@Override
	public String toString() {
		return "ordered";
	}

	@Override
	public void prepare(PizzaContext context) {
		context.setPizzaState(new PreparedState());
	}

	@Override
	public void cook(PizzaContext context) throws Exception {
		throw new Exception("Pizza is not prepared");
	}

}
