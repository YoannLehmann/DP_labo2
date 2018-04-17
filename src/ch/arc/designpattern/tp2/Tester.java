package ch.arc.designpattern.tp2;

import ch.arc.designpattern.tp2.builder.PizzaBuilder;
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
import ch.arc.designpattern.tp2.state.OrderedState;
import ch.arc.designpattern.tp2.state.CoockedState;
import ch.arc.designpattern.tp2.state.PizzaContext;
import ch.arc.designpattern.tp2.state.PizzaState;
import ch.arc.designpattern.tp2.state.PreparedState;

public class Tester {

	public static void main(String[] args) {
		
		// Part 1) Decorator pattern.
		Pizza pizza = new WithHam(new WithMozzarella(new WithTomatoSauce(new ThickPizza())));
		Pizza pizza2 = new WithMushrooms(new WithSmokedSalmon(new WithMozzarella(new WithTomatoSauce(new ThinPizza()))));
		Pizza pizza3 = new WithMushrooms(new WithChiliPepper(new WithMozzarella(new WithFreshCreamSauce(new ThickPizza()))));
		
		System.out.println(pizza.toString());
		System.out.println(pizza.getTaste());
		System.out.println(pizza.getAroma());
		System.out.println("Vegetarian pizza ? " + pizza.isVegetarian());
		System.out.println("Price: " + pizza.getPrice());
		System.out.println("Size: " + pizza.getSize() + "cm");
		System.out.println("Lactose: " + pizza.getLactose() + "mg");
		
		System.out.println(pizza2.toString());
		System.out.println(pizza2.getTaste());
		System.out.println(pizza2.getAroma());
		System.out.println("Vegetarian pizza ? " + pizza2.isVegetarian());
		System.out.println("Price: " + pizza2.getPrice());
		System.out.println("Size: " + pizza2.getSize() + "cm");
		System.out.println("Lactose: " + pizza2.getLactose() + "mg");
		
		System.out.println(pizza3.toString());
		System.out.println(pizza3.getTaste());
		System.out.println(pizza3.getAroma());
		System.out.println("Vegetarian pizza ? " + pizza3.isVegetarian());
		System.out.println("Price: " + pizza3.getPrice());
		System.out.println("Size: " + pizza3.getSize() + "cm");
		System.out.println("Lactose: " + pizza3.getLactose() + "mg");
		
		
		// Part 2) Builder pattern.
		Pizza pizza4 = new PizzaBuilder().setThickness("thin").setSize(10).sauce("tomato").addIngredient("ham").getPizza();
		System.out.println(pizza4.toString());
		
		Pizza margherita = new PizzaBuilder().setThickness("thin").setSize(30).sauce("tomato").addIngredient("mozzarella").getPizza();
		Pizza profunghi  = new PizzaBuilder().setThickness("thin").setSize(30).sauce("tomato").addIngredient("mozzarella").addIngredient("ham").addIngredient("mushrooms").getPizza();
		Pizza diavola    = new PizzaBuilder().setThickness("thin").setSize(30).sauce("tomato").addIngredient("mozzarella").addIngredient("chilli pepper").getPizza();
		
		
		// Part 3) State pattern.
		PizzaContext 	margheritaContext = new PizzaContext(margherita);
		PizzaState 		commandedState = new OrderedState();
		PizzaState 		preparedState = new PreparedState();
		CoockedState 	coockedState = new CoockedState();
		
		try {
			System.out.println(margheritaContext.toString());
			System.out.println(commandedState.getLactose(margheritaContext));
			commandedState.prepare(margheritaContext);
			System.out.println(margheritaContext.toString());
			System.out.println(preparedState.getLactose(margheritaContext));
			preparedState.cook(margheritaContext);
			System.out.println(margheritaContext.toString());
			System.out.println(coockedState.getLactose(margheritaContext));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
