package Chapter3.Exercise;

import java.util.Scanner;

public class RetirementGoal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfYears;
        double annualSavings;


        while (true) {
            System.out.print("Enter the number of years until retirement: ");
            noOfYears = sc.nextInt();
            if (noOfYears > 0) {
                break;
            }
            System.out.println("Invalid input. Please enter a positive number.");
        }


        while (true) {
            System.out.print("Enter the amount of money you can save annually: ");
            annualSavings = sc.nextDouble();
            if (annualSavings > 0) {
                break;
            }
            System.out.println("Invalid input. Please enter a positive number.");
        }

        //double totalSavings = noOfYears * annualSavings;
        //System.out.println("You will have saved " + totalSavings + " by retirement" );

        //double totalSavings=0;
        double savings = annualSavings;

        for(int i = 1; i <= noOfYears; i++){
            System.out.print("Year " + i + " = " +  savings + "\n");
            //totalSavings += annualSavings;
            if(i !=5){
                savings = savings + (savings * 0.10);
            }


        }

        //System.out.println("Total savings : " + totalSavings);
        System.out.println("\n\nRetirement Calculations:\n===============================\n" +
                String.format("""
                          Years: %d
                          Amount you want to save per annual: R%.2f

                          Total Retirement Money: R%.2f
                          """, noOfYears, annualSavings, savings));
    }
}
