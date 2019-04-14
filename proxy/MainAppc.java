package proxy;

public class MainAppc {
    public static void main(String[] args) {
        Modem modem = new Modem("jarret");
        modem.ping("127.0.0.1");
        modem.ping("192.168.1.1");
    }
}
