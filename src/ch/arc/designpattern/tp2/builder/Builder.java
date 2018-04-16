package ch.arc.designpattern.tp2.builder;

import ch.arc.designpattern.tp2.decorator.Pizza;

public interface Builder {
	
	Builder setThickness(String thickness);
	Builder sauce(String sauce);
	Builder addIngredient(String ingredient);
	Builder setSize(int size);
	Pizza   getPizza();
}
