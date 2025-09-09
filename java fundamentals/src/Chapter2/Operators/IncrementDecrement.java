package Chapter2.Operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int number = 25;

        System.out.println("===========POST===========\n");
        //post inrement / decrement
        System.out.println("Original value of number: " + number);
        System.out.println("Increment the value of number by 1, but only updates after being used : " + number++);
        System.out.println("New Value number is: " + number);
        System.out.println("Increment the value of number by 1, but only updates after being used: " + number--);
        System.out.println("New Value number is: " + number);

        number = 25;

        System.out.println("===========PRE===========\n");
        //pre inrement / decrement
        System.out.println("Original value of number: " + number);
        System.out.println("Increment the value of number by 1, and update the value before being accessed: " + ++number);
        System.out.println("New Value number is: " + number);
        System.out.println("Increment the value of number by 1, update the value before being accessed: " + --number);
        System.out.println("New Value number is: " + number);
    }
}
