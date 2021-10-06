// Abel Kahsay Gebreslassie
// Neptun ID: PS70N2
public class Demo {
    public static void main(String[] args){
        Layer TCPIP = new ApplicationLayer(null);
        Layer encrypt = new EncryptionLayer(TCPIP);
        Layer tcp = new TCP(encrypt);
        Layer eth = new EthernetLayer(tcp);

        // Setting the last layer so that chain of command can
        // be done both forward and backward from a single object
        TCPIP.setLast(eth);
        String message = "Hello world";
        System.out.println("======================");
        System.out.println("Message to be sent is: " + message);
        System.out.println("======================");
        String sent = TCPIP.send(message);
        System.out.println("======================");
        System.out.println("Received message is: " + sent);
        System.out.println("======================");
        String unpacked = TCPIP.unpackReceived(sent);
        System.out.println("======================");
        System.out.println("Unpacked message is: " + unpacked);
        System.out.println("======================");

    }
}
