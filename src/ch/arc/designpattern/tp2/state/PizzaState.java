package ch.arc.designpattern.tp2.state;

public interface PizzaState {

    public int getLactose();
    public String getTaste();
    public String getAroma();
    public String toString();
    public void prepare(PizzaContext context);
    public void cook(PizzaContext context);
}
