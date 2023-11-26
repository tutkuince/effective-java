package io.tince._01creatinganddestroyingobjects.item01;

public class MobilePhone {
    private String brand;
    private Boolean latest;

    public MobilePhone(String brand, Boolean latest) {
        this.brand = brand;
        this.latest = latest;
    }

    public static MobilePhone getLatestMobilePhone(String brand) {
        return new MobilePhone(brand, true);
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", latest=" + latest +
                '}';
    }
}
