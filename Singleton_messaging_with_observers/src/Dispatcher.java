import java.util.ArrayList;
import java.util.HashMap;

public class Dispatcher {

    protected HashMap<String, ArrayList<MyObserver>> topics = new HashMap<>();
    private static Dispatcher dispatcher = null;

    private Dispatcher() {

    }

    public static Dispatcher getInstance(){
        if(dispatcher == null){
            dispatcher = new Dispatcher();
        }
        return dispatcher;
    }
    public void subscribe(String topic, MyObserver o){
        if(this.topics.get(topic) != null)
            this.topics.get(topic).add(o);
        else
            throw(new RuntimeException("Topic " + topic + " not found"));
    }
    public void unsubscribe(String topic, MyObserver o){
        if(this.topics.get(topic) != null)
            this.topics.get(topic).remove(o);
        else
            throw(new RuntimeException("Topic " + topic + " not found"));
    }
    private void notifyObservers(String topic,String message){
        for(MyObserver o: this.topics.get(topic)){
            o.update(message);
        }
    }
    public void sendMessage(String topic,String message){
        if(this.topics.get(topic) != null)
            this.notifyObservers(topic, message);
        else
            throw(new RuntimeException("Topic " + topic + " not found"));
    }
    public void addTopic(String topic){
        this.topics.put(topic, new ArrayList<MyObserver>());
    }
}
