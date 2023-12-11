package pk1;


public class MountainBike extends Bike {
    private int suspensionLevel;

    public MountainBike(int id, String name, int suspensionLevel) {
        super(id, name);
        this.suspensionLevel = suspensionLevel;
    }
}