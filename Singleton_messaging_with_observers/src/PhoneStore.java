public class PhoneStore implements MyObserver{
    private String message;
    public PhoneStore() {
    }

    @Override
    public void update(String message) {
        this.message = message;
        System.out.println("[PhoneStore] Update: " + this.message + ", and the instance is: "+this + "\n");
    }
}
