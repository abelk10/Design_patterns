import java.util.ArrayList;
import java.util.Arrays;

public class ProxyServer {
    ArrayList<String> rules;

    public ProxyServer(ArrayList<String> rules) {
        if(rules == null){
            this.rules = new ArrayList<>();
        }
        else{
            this.rules = rules;
        }
    }

    public ProxyServer clone(){
        ProxyServer newProxy = new ProxyServer((ArrayList)this.rules.clone());
        return newProxy;
    }
    public void accessUrl(String name, String url){
        if(!rules.contains(url)){
            InternetAccess.getPage(url);
        }
        else{
            System.out.println("[403 Forbidden] Dear " + name + ", you are not allowed to access " + url);
        }
    }
    public void addRestriction(String url){
        rules.add(url);
    }

}
