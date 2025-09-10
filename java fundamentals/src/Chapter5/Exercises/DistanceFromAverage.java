package Chapter5.Exercises;

import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;
        int input;

        System.out.println("Enter up to 10 integers (0 to quit):");
        while (count < 10) {
            input = sc.nextInt();
            if (input == 0) break;
            numbers[count] = input;
            count++;
        }

        if (count == 0) {
            System.out.println("Error: No numbers entered!");
            return;
        }

        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        double average = sum / count;

        System.out.println("Average = " + average);
        for (int i = 0; i < count; i++) {
            double distance = Math.abs(numbers[i] - average);
            System.out.println("Value: " + numbers[i] + " | Distance from average: " + distance);
        }
    }
}
