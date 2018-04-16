package ch.arc.designpattern.tp2.builder;


public interface Builder {
	
	Builder setThickness(String thickness);
	Builder sauce(String sauce);
	Builder addIngredient(String ingredient);
	Builder setSize(int size);
}
