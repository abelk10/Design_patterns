public class ApplicationLayer extends Layer{
    public ApplicationLayer(Layer prev) {
        super(prev);
    }

    @Override
    public String doTransform(String message) {
        System.out.println("[Application layer transform]: " + message);
        return message;
    }

    @Override
    public String doUnpack(String message) {
        System.out.println("[Application layer unpacked]: " + message);
        return message;
    }
}
