package pizza;

public abstract class Pizza implements PizzaMenu{
    protected String type;
    protected double price;

    @Override
    public String getDescription() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
