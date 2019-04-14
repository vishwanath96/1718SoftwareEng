package state;

public class DataConnectionOffState implements DataConnectionState {

    @Override
    public void info() {
        System.out.println("Data connection switched off");
    }
}
