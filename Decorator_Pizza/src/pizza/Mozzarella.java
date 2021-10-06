package pizza;

public class Mozzarella extends Decorator{
    public Mozzarella(PizzaMenu p) {
        super(p);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with mozzarella";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1;
    }
}
