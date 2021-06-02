package IfElseAssignments;

public class Assignment1 {
    public static void main(String[] args){
        Door door = new Door(0.7,2.0,false);
        door.openDoor();
        door.printOpen();
        door.closeDoor();
        door.printOpen();
        System.out.println(door.calculateSurface() + " m^2");
    }
}
