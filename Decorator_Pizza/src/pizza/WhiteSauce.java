package pizza;

public class WhiteSauce extends Decorator{
    public WhiteSauce(PizzaMenu p) {
        super(p);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with white sauce";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 0.5;
    }
}
