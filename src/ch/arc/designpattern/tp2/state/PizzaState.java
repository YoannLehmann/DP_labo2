package ch.arc.designpattern.tp2.state;

import ch.arc.designpattern.tp2.decorator.Pizza;

public interface PizzaState {

    public float getLactose(Pizza context);
    public String getTaste(Pizza context);
    public String getAroma(Pizza context);
    public String toString();
    public void prepare(Pizza context);
    public void cook(Pizza context);
}
