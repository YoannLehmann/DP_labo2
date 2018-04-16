package ch.arc.designpattern.tp2.state;

public class CoockedState implements PizzaState {

	@Override
	public int getLactose() {
		return 0; // /!\ Doit rendre la moitié du pourcentage en lactose.
	}

	@Override
	public String getTaste() {
		return null; // /!\ Doit retourner le goût final.
	}

	@Override
	public String getAroma() {
		return null; // /!\ Doit retourner l'arôme final.
	}

	@Override
	public void prepare(PizzaContext context) {
		// exception -> la pizza est déjà cuite.
	}

	@Override
	public void cook(PizzaContext context) {
		context.setPizzaState(new FailedState());
	}

}
