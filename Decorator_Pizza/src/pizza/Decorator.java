package pizza;

public abstract class Decorator implements PizzaMenu {
    PizzaMenu pizza;
    public Decorator(PizzaMenu p){ pizza = p; }
}
