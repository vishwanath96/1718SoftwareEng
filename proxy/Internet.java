package proxy;

public class Internet implements Network {

    private String credentials;

    public Internet(String credentials) {
        this.credentials = credentials;
        connectToInternet(credentials);
    }

    @Override
    public void ping(String ip) {
        System.out.println("pinging: " + ip);
    }

    private void connectToInternet(String credentials) {
        System.out.println("connecting to internet using credentials: " + credentials);
    }
}
