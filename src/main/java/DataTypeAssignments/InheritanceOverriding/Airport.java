package DataTypeAssignments.InheritanceOverriding;
public class Airport {
    String name;
    PeoplePlane[] peoplePlanes;
    CargoPlane[] cargoPlanes;

    public Airport(String name) {
        this.name = name;
        peoplePlanes = new PeoplePlane[3];
        peoplePlanes[0] = new PeoplePlane("ABC123");
        peoplePlanes[1] = new PeoplePlane("DDD888");
        peoplePlanes[2] = new PeoplePlane("ODL345");
        cargoPlanes = new CargoPlane[2];
        cargoPlanes[0] = new CargoPlane("FF2134");
        cargoPlanes[1] = new CargoPlane("PLA166");
    }

    public void printAircraft() {
        System.out.println("Passenger planes from " + name);
        for (Airplane temp : peoplePlanes) {
            temp.printStatus();
        }
        System.out.println("Cargo aircraft from " + name);
        for (Airplane temp : cargoPlanes) {
            temp.printStatus();
        }
    }

    public void requestStatus(String plane){
        for (Airplane temp : peoplePlanes){
            if (temp.planeId.equals(plane)){
            }
        }
    }
}
