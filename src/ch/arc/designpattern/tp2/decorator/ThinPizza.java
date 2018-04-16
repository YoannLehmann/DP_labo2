package ch.arc.designpattern.tp2.decorator;

public class ThinPizza implements Pizza {

	public int size = 0;
	
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 3 + (getSize() * 0.1f);
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
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 20;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return "The pizza is";
	}

	@Override
	public String getAroma() {
		// TODO Auto-generated method stub
		return "The aroma is";
	}
	
	@Override
	public String toString() {
		return "I'm a thin pizza with";
	}

}
