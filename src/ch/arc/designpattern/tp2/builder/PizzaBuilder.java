package ch.arc.designpattern.tp2.builder;

import ch.arc.designpattern.tp2.decorator.Pizza;
import ch.arc.designpattern.tp2.decorator.ThickPizza;
import ch.arc.designpattern.tp2.decorator.ThinPizza;
import ch.arc.designpattern.tp2.decorator.WithChiliPepper;
import ch.arc.designpattern.tp2.decorator.WithFreshCreamSauce;
import ch.arc.designpattern.tp2.decorator.WithHam;
import ch.arc.designpattern.tp2.decorator.WithMozzarella;
import ch.arc.designpattern.tp2.decorator.WithMushrooms;
import ch.arc.designpattern.tp2.decorator.WithSmokedSalmon;
import ch.arc.designpattern.tp2.decorator.WithTomatoSauce;

public class PizzaBuilder implements Builder {

	private Pizza pizza;
	
	public PizzaBuilder() {
		
	}
	
	@Override
	public Builder setThickness(String thickness) {
		switch(thickness.toLowerCase()) {
		case "thin" :
			pizza = new ThinPizza();
			break;
		case "thick" :
			pizza = new ThickPizza();
			break;
		}
		
		return this;
	}

	@Override
	public Builder sauce(String sauce) {
		
		switch(sauce.toLowerCase()) {
		case "tomato":
			pizza = new WithTomatoSauce(pizza);
			break;
		case "cream" :
			pizza = new WithFreshCreamSauce(pizza);
			break;
		}
		
		return this;
	}

	@Override
	public Builder addIngredient(String ingredient) {
		
		switch(ingredient.toLowerCase()) {
		case "ham":
			pizza = new WithHam(pizza);
			break;
		case "chilli pepper":
			pizza = new WithChiliPepper(pizza);
			break;
		case "mozzarella":
			pizza = new WithMozzarella(pizza);
			break;
		case "mushrooms" :
			pizza = new WithMushrooms(pizza);
			break;
		case "smoked salmon" : 
			pizza = new WithSmokedSalmon(pizza);
			break;
		}
		
		return this;
	}

	@Override
	public Builder setSize(int size) {
		
		pizza.setSize(size);
		
		return this;
	}
	
	public Pizza getPizza() {
		return this.pizza;
	}

}
