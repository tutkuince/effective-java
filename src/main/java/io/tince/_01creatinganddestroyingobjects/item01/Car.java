package io.tince._01creatinganddestroyingobjects.item01;

import java.util.HashMap;
import java.util.Map;

public class Car {
    private String color;
    private Boolean spoiler;
    private static final Car RED_CAR = new Car("red");

    private static final Map<String, Car> CARS = new HashMap<>();

    public Car(String color) {
        this.color = color;
    }

    public static Car getRedCar() {
        return RED_CAR;
    }

    public static Car newInstance(String color) {
        return CARS.computeIfAbsent(color, Car::new);
    }


}
