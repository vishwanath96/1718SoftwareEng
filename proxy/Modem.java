package proxy;

public class Modem implements Network {
    private String credentials;
    private Internet internet = null;

    public Modem(String credentials) {
        this.credentials = credentials;
    }

    @Override
    public void ping(String ip) {
        if(internet == null) {
            internet = new Internet(credentials);
        }
        internet.ping(ip);
    }
}
