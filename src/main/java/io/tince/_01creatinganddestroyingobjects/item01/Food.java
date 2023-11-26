package io.tince._01creatinganddestroyingobjects.item01;

public class Food {
    protected String name;

    public static Food frozenFood(String name) {
        return new IceCream(name);
    }

    public static Food warmFood(String name) {
        return new Soup(name);
    }
}
