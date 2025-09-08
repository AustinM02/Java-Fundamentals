package Chapter1.Excercise;

import java.util.Scanner;

public class Fundraiser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double ADULT_PRICE = 50.00;
        final double CHILD_PRICE = 37.50;

        System.out.print("Enter number of adult meals: ");
        int adultMeals = input.nextInt();

        System.out.print("Enter number of child meals: ");
        int childMeals = input.nextInt();

        double adultTotal = adultMeals * ADULT_PRICE;
        double childTotal = childMeals * CHILD_PRICE;
        double allMealsTotal = adultTotal + childTotal;

        System.out.println("Total for adult meals: R" + adultTotal);
        System.out.println("Total for child meals: R" + childTotal);
        System.out.println("Grand total for all meals: R" + allMealsTotal);
    }
}
