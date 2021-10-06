// Abel Kahsay Gebreslassie
// Neptun ID: PS70N2
import pizza.*;

public class PizzaDemo {
    public static void main(String[] args){
        PizzaMenu bobsPizza = new TomatoSauce(new Small(new DeepDish()));
        PizzaMenu samsPizza = new WhiteSauce(new Garlic(new Large(new NewYork())));

        System.out.println("Bob's order is");
        System.out.println("===================");
        System.out.println("pizza details: " + bobsPizza.getDescription());
        System.out.println("total cost: " + bobsPizza.getPrice());

        System.out.println("Sam's order is");
        System.out.println("===================");
        System.out.println("pizza details: " + samsPizza.getDescription());
        System.out.println("total cost: " + samsPizza.getPrice());
    }
}
