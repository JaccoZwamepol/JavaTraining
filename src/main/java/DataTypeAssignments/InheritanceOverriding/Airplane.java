package DataTypeAssignments.InheritanceOverriding;
public class Airplane {

    String planeId;
    boolean isFlying;
    int currentAmount;

    public Airplane(String planeId) {
        this.planeId = planeId;
    }

    public void printStatus() {
        if (isFlying) {
            System.out.println("Passenger plane" + planeId +
                    " requested. Is flying, still room for " + currentAmount + "passengers.");
        }
        else {
            System.out.println("Passenger plane" + planeId +
                    " requested. Is not flying, still room for " + currentAmount + "passengers.");
        }
    }

    public void takeOff() {
        if (!isFlying) {
            isFlying = true;
            System.out.println(planeId + " is taking off!");
        }
        else {
            System.out.println(planeId + " cannot take off, already in the air.");
        }
    }

    public void land() {
        if(isFlying) {
            isFlying = false;
            System.out.println(planeId + " is landing!");
        }
        else {
            System.out.println(planeId + " cannot land, we are already there.");
        }
    }
}
class CargoPlane extends Airplane{
    int maxCargo = 20;

    public CargoPlane(final String planeId) {
        super(planeId);
    }

    public void load(int amountToLoad) {

        if ((currentAmount + amountToLoad) <= maxCargo) {
            System.out.println(planeId + " is loading " + amountToLoad + " cargo.");
            currentAmount += amountToLoad;
        }
        else {
            System.out.println(planeId + " could not load all cargo!");
            int roomLeft = maxCargo - currentAmount;
            System.out.println(planeId + " loads only " + roomLeft + " cargo... The rest has to wait...");
            currentAmount += roomLeft;
        }
    }

    public void unload() {
        System.out.println(planeId + " is unloading " + currentAmount + " cargo...");
        currentAmount = 0;
    }
}
class PeoplePlane extends Airplane{
    int maxPassengers = 100;

    public PeoplePlane(final String planeId) {
        super(planeId);
    }

    public void load(int amountToLoad) {

        if ((currentAmount + amountToLoad) <= maxPassengers) {
            System.out.println(planeId + " is loading " + amountToLoad + " passengers.");
            currentAmount += amountToLoad;
        }
        else {
            System.out.println(planeId + " could not load all passengers!");
            int roomLeft = maxPassengers - currentAmount;
            System.out.println(planeId + " loads only " + roomLeft + " passengers... The rest has to wait...");
            currentAmount += roomLeft;
        }
    }

    public void unload() {
        System.out.println(planeId + " is unloading " + currentAmount + " passengers...");
        currentAmount = 0;
    }
}
