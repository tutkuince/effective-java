package io.tince._01creatinganddestroyingobjects.item06;

public class Item06 {
    public static void main(String[] args) {
        //String s = new String("String"); // DON'T DO THIS
        String s = "String";

    }

    // Poor performance
    static boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }
}
