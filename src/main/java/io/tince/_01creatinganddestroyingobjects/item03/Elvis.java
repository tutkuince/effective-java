package io.tince._01creatinganddestroyingobjects.item03;

// Singleton with public final field
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {}

    public void leaveTheBuilding() {
        System.out.println("Leave");
    }
}
