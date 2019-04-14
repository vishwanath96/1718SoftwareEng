package state;

public class MainClient {
    public static void main(String []args) {
        DataConnectionStateContext context = new DataConnectionStateContext();
//        context.info();
        context.setPresentState(new DataConnectionOnState());
//        System.out.println(context.getPresentState().getClass());
        context.setPresentState(new DataConnectionOffState());
//        System.out.println(context.getPresentState().getClass());
//        context.info();
        //        context.setPresentState(new);
    }

}
