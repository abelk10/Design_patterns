public class EthernetLayer extends Layer{
    public EthernetLayer(Layer prev) {
        super(prev);
        this.header = "[Ethernet Header]";
    }

    @Override
    public String doTransform(String message) {
        System.out.println("[Ethernet layer transformed]: " + this.header + message);
        return this.header + message;
    }

    @Override
    public String doUnpack(String message) {
        System.out.println("[Ethernet layer unpacked]: " + message.substring(this.header.length()));
        return message.substring(this.header.length());
    }
}
