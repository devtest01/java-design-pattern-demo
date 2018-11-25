package com.test.demo;

public class FoodEnumTest {
    public static void main(String[] args) {
        for (Food.Dessert dessert : Food.Dessert.values()) {
            System.out.print(dessert + "\t");
        }
        System.out.println();

        for (Food.Coffe coffe : Food.Coffe.values()) {
            System.out.print(coffe + "\t");
        }
        System.out.println();

        Food food = Food.Coffe.BLACK_COFFE;
        System.out.println(food);

        food = Food.Dessert.CAKE;
        System.out.println(food);
    }
}
