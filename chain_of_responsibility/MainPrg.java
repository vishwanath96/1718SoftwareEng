package chain_of_responsibility;

public class MainPrg {
    public static void main(String []args) {
        Authority poc1 = new LowerDivisionClerk();
        Authority poc2 = new AssistantRegistrar();
        Authority poc3 = new Registrar();

        poc1.setImmediateSupervisor(poc2);
        poc2.setImmediateSupervisor(poc3);

        poc1.processFile("Birth Certificate");
    }
}
