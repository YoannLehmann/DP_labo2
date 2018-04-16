package ch.arc.designpattern.tp2.state;

public class PreparedState implements PizzaState {

	@Override
	public int getLactose() {
		// TODO Auto-generated method stub
		return 0; // /!\ Doit retourner le pourcentage de lactose.
	}

	@Override
	public String getTaste() {
		return "Goût pizza crue";
	}

	@Override
	public String getAroma() {
		return "Arôme pizza crue";
	}

	@Override
	public String toString() {
		return "préparée";
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
