package Chapter5.Exercises;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 25, 30, 5, 18, 40, 10};

        displayAll(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, 20);
        displayGreaterThanAverage(numbers);
    }

    public static void displayAll(int[] arr) {
        System.out.println("All numbers:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

    public static void displayReverse(int[] arr) {
        System.out.println("Numbers in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void displaySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum + "\n");
    }

    public static void displayLessThan(int[] arr, int limit) {
        System.out.println("Numbers less than " + limit + ":");
        for (int num : arr) {
            if (num < limit) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
    }

    public static void displayGreaterThanAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = sum / arr.length;

        System.out.println("Average = " + average);
        System.out.println("Numbers greater than average:");
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
    }
}
