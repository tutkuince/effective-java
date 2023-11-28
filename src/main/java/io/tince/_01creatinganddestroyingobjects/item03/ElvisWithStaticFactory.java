package io.tince._01creatinganddestroyingobjects.item03;

public class ElvisWithStaticFactory {
    private static final ElvisWithStaticFactory INSTANCE = new ElvisWithStaticFactory();

    private ElvisWithStaticFactory() {
    }

    public static ElvisWithStaticFactory getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("Leave the building.");
    }
}
