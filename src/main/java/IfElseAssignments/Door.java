package IfElseAssignments;
public class Door {
    double width, height;
    boolean open;
    public Door(double width, double height, boolean open){
        this.width = width;
        this.height = height;
        this.open = open;
    }
    public void openDoor(){
        this.open = true;
    }
    public void closeDoor(){
        this.open = false;
    }
    public void printOpen() {
        if (this.open)
            System.out.println("The door is open");
        else
            System.out.println("The door is closed");
    }
    public double calculateSurface(){
        return this.width * this.height;
    }

}
