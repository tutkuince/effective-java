package io.tince._01creatinganddestroyingobjects.item02;

public class Item02 {
    public static void main(String[] args) {
        NutritionFacts1 nutritionFacts1 = new NutritionFacts1(240, 8, 100, 0, 35, 27);
        System.out.println("Telescoping Constructor Pattern");
        System.out.println(nutritionFacts1);
        System.out.println("--------------------");

        NutritionFacts2 nutritionFacts2 = new NutritionFacts2();
        nutritionFacts2.setServingSize(240);
        nutritionFacts2.setServings(8);
        nutritionFacts2.setCalories(100);
        nutritionFacts2.setFat(0);
        nutritionFacts2.setSodium(35);
        nutritionFacts2.setCarbohydrate(27);
        System.out.println("JavaBeans Pattern");
        System.out.println(nutritionFacts2);
        System.out.println("--------------------");

        NutritionFacts3 nutritionFacts3 = new NutritionFacts3.Builder(240, 8)
                .calories(100)
                .fat(0)
                .sodium(35)
                .carbohydrate(27).build();
        System.out.println("Builder Pattern");
        System.out.println(nutritionFacts3);
        System.out.println("--------------------");

        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();
    }
}
