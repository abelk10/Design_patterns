package pizza;

public class TomatoSauce extends Decorator{
    public TomatoSauce(PizzaMenu p) {
        super(p);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with tomato sauce";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 0.5;
    }
}
