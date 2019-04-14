package chain_of_responsibility;

public class LowerDivisionClerk extends Authority {

    @Override
    public void recordFile(String fileName) {
        System.out.println("LDC records: " + fileName);
    }
}
