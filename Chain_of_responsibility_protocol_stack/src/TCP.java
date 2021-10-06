public class TCP extends Layer{
    public TCP(Layer prev) {
        super(prev);
        this.header = "[TCP Header]";
    }

    @Override
    public String doTransform(String message) {
        System.out.println("[TCP layer transform]: " + this.header + message);
        return this.header + message;
    }

    @Override
    public String doUnpack(String message) {
        System.out.println("[TCP layer unpacked]: " + message.substring(this.header.length()));
        return message.substring(this.header.length());
    }
}
