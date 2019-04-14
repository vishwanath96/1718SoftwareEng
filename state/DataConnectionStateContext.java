package state;

public class DataConnectionStateContext {
    public DataConnectionState getPresentState() {
        return presentState;
    }

    public void setPresentState(DataConnectionState presentState) {
        this.presentState = presentState;
    }

    public void info() {
        presentState.info();
    }
    private DataConnectionState presentState;

    public DataConnectionStateContext() {
        presentState = new DataConnectionOffState();
    }



}
