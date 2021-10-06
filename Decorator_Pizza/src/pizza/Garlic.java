package pizza;

public class Garlic extends Decorator{
    public Garlic(PizzaMenu p) {
        super(p);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with white garlic";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 0.75;
    }
}
