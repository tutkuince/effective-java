package io.tince._01creatinganddestroyingobjects.item01;

public class Item01 {
    public static void main(String[] args) {
        // factory methods can have name, unlike constructors
        Food iceCream = Food.frozenFood("Gelato");

        System.out.println(iceCream.name);

        // They can return an object of any subtype of their return type.
        Food soup = Food.warmFood("Lentil");
        System.out.println(soup.name);

        System.out.println("----------------------------");

        // They are not required to create new object each time they're invoked
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(true);
        // Two different identity hash codes imply different objects
        System.out.println(System.identityHashCode(b1));
        System.out.println(System.identityHashCode(b2));

        System.out.println("----------------------------");

        Boolean b3 = Boolean.TRUE;
        Boolean b4 = Boolean.TRUE;
        // Sharing the same object - same hash code
        System.out.println(System.identityHashCode(b3));
        System.out.println(System.identityHashCode(b4));

        System.out.println("----------------------------");

        // Sharing the same object - same hash code
        Car rc1 = Car.getRedCar();
        Car rc2 = Car.getRedCar();
        System.out.println(System.identityHashCode(rc1));
        System.out.println(System.identityHashCode(rc2));

        System.out.println("----------------------------");

        Car bc1 = Car.newInstance("blue");
        Car bc2 = Car.newInstance("blue");
        System.out.println(System.identityHashCode(rc1));
        System.out.println(System.identityHashCode(rc2));

        System.out.println("----------------------------");
        MobilePhone mp1 = new MobilePhone("Apple", false);
        MobilePhone latestApple = MobilePhone.getLatestMobilePhone("Apple");
        MobilePhone latestSamsung = MobilePhone.getLatestMobilePhone("Samsung");
        System.out.println(mp1);
        System.out.println(latestApple);
        System.out.println(latestSamsung);
    }
}
