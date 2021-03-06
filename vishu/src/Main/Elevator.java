package Main;

public class Elevator {
    public Integer getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Integer currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    Integer currentFloor,no;

    public Elevator(){
        currentFloor=0;
    }
    public Elevator(int no){
        System.out.println(no);
    }

    public void goTo(int Floor){
        if(currentFloor==Floor) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Elevator already on floor " + Floor);
            System.out.println("--------------------------------------------------------------");
        }else
            if(currentFloor<Floor){
                for(int i=currentFloor;i<=Floor;i++){
                    System.out.println("Elevator on " + i + " Floor");
                    currentFloor=i;
                }
                System.out.println("--------------------------------------------------------------");
                System.out.println("Elevator Reached on " + currentFloor + " Floor");
                System.out.println("--------------------------------------------------------------");
        }else
            if(currentFloor>Floor) {
                for (int i = currentFloor; i >= Floor; i--) {
                    System.out.println("Elevator on " + i + " Floor");
                    currentFloor = i;
                }
                System.out.println("--------------------------------------------------------------");
                System.out.println("Elevator Reached on " + currentFloor + " Floor");
                System.out.println("--------------------------------------------------------------");
            }
        }

}
