package pizza;

public class Large extends Decorator{
    public Large(PizzaMenu p) {
        super(p);
    }

    @Override
    public String getDescription() {
        return "Large " + pizza.getDescription();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3;
    }
}
