package ch.arc.designpattern.tp2.state;

import ch.arc.designpattern.tp2.decorator.Pizza;

public interface PizzaState {

    public float getLactose(PizzaContext context) throws Exception;
    public String getTaste(PizzaContext context) throws Exception;
    public String getAroma(PizzaContext context) throws Exception;
    public String toString();
    public void prepare(PizzaContext context) throws Exception;
    public void cook(PizzaContext context) throws Exception;
}
