package chain_of_responsibility;

public class Registrar extends Authority {

    @Override
    public void recordFile(String fileName) {
        System.out.println("Registrar records: " + fileName);
    }
}
