package pizza;

public class Medium extends Decorator{
    public Medium(PizzaMenu p) {
        super(p);
    }

    @Override
    public String getDescription() {
        return "Medium " + pizza.getDescription();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1;
    }
}
