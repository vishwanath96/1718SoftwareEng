package chain_of_responsibility;

public class AssistantRegistrar extends Authority {

    @Override
    public void recordFile(String fileName) {
        System.out.println("AR records: " + fileName);
    }
}
