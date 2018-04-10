package ch.arc.designpattern.tp2.decorator;

public interface Pizza {
	public float getPrice();
	public boolean isSpicy();
	public float getLactose();
	public boolean isVegetarian();
	public int getSize();
	public String getTaste();
	public String getAroma();
	public String toString();
}
