package chain_of_responsibility;

public abstract class Authority {


    protected Authority immediateSupervisor = null;

    public void processFile(String fileName) {
        recordFile(fileName);
        if(immediateSupervisor != null) {
            immediateSupervisor.processFile(fileName);
        }
    }

    public abstract void recordFile(String fileName);

    public Authority getImmediateSupervisor() {
        return immediateSupervisor;
    }

    public void setImmediateSupervisor(Authority immediateSupervisor) {
        this.immediateSupervisor = immediateSupervisor;
    }


}
