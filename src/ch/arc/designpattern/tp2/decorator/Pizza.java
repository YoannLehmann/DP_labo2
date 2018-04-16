package ch.arc.designpattern.tp2.decorator;

public interface Pizza {
		
	public int size = 0;
	public float getPrice();
	public boolean isSpicy();
	public float getLactose();
	public boolean isVegetarian();
	public int getSize();
	public void setSize(int size);
	public String getTaste();
	public String getAroma();
	public String toString();
	
}
