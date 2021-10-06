package pizza;

public class Small extends Decorator{
    public Small(PizzaMenu p) {
        super(p);
    }

    @Override
    public String getDescription() {
        return "Small " + pizza.getDescription();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 0;
    }
}
