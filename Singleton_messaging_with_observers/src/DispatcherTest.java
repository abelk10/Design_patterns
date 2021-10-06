public class DispatcherTest {
    public static void main(String[] args){
        // Create new topics
        Dispatcher.getInstance().addTopic("cars");
        Dispatcher.getInstance().addTopic("phones");
        Dispatcher.getInstance().addTopic("watches");


        MixedStore mixedStore = new MixedStore();

        //subscribing to topics
        Dispatcher.getInstance().subscribe("phones", new PhoneStore());
        Dispatcher.getInstance().subscribe("phones", new PhoneStore());
        Dispatcher.getInstance().subscribe("cars", new CarStore());
        Dispatcher.getInstance().subscribe("phones", mixedStore);
        Dispatcher.getInstance().subscribe("cars", mixedStore);

        //Sending new messages to different topics
        Dispatcher.getInstance().sendMessage("phones", "The new iPhone 12 is here!");
        Dispatcher.getInstance().sendMessage("cars", "New Ferrari models available!");
        Dispatcher.getInstance().sendMessage("cars", "New Lamborghini Aventador S available now!");

        //Sending message to topics with no subscribers
        Dispatcher.getInstance().sendMessage("watches", "Rolex 2020 available!");

    }
}
