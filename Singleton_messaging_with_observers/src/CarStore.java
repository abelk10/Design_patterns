public class CarStore implements MyObserver{
    private String message;
    public CarStore() {
    }

    @Override
    public void update(String message) {
        this.message = message;
        System.out.println("[CarStore] Update: " + this.message + ", and the instance is: "+this + "\n");
    }
}
