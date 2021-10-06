public class EncryptionLayer extends Layer{
    public EncryptionLayer(Layer prev) {
        super(prev);
    }

    @Override
    public String doTransform(String message) {
        String trans = this.encrypt(message);
        System.out.println("[Encryption layer transform]: " + trans);
        return trans;
    }

    @Override
    public String doUnpack(String message) {
        String trans = this.encrypt(message);
        System.out.println("[Encryption layer unpacked]: " + trans);
        return trans;
    }

    public String encrypt(String message){
        String key = "secret";
        StringBuilder sb= new StringBuilder();
        for(int i= 0; i< message.length(); i++)
            sb.append((char)(message.charAt(i) ^ key.charAt(i% key.length())));
        return sb.toString();
    }
}
