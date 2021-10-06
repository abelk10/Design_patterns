public class Person {
    private String name;
    private ProxyServer proxy;

    public Person(String name, ProxyServer proxy) {
        this.name = name;
        this.proxy = proxy;
    }
    public void getPage(String url){
        proxy.accessUrl(this.name, url);
    }
}
