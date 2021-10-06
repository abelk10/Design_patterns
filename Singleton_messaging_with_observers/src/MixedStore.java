public class MixedStore implements MyObserver{
    private String message;
    public MixedStore() {
    }

    @Override
    public void update(String message) {
        this.message = message;
        System.out.println("[MixedStore] Update: " + this.message + ", and the instance is: "+this + "\n");
    }
}
