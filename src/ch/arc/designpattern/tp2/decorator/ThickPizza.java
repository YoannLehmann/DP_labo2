package ch.arc.designpattern.tp2.decorator;

public class ThickPizza implements Pizza {

	
	public ThickPizza() {
		
	}
	
	@Override
	public float getPrice() {
		return 10;
	}

	@Override
	public boolean isSpicy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getLactose() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return "The pizza is ";
	}

	@Override
	public String getAroma() {
		// TODO Auto-generated method stub
		return "The is aromatized with ";
	}
	
	@Override
	public String toString() {
		return "I'm a thick pizza";
	}

}
