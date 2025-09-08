package Chapter1;

public class UsingConstants {
    public static void main(String[] args)
    {
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME = "iLAB";

        String welcomeMessage;

        welcomeMessage = "Welcome to " + COMPANY_NAME + "'s " + CURRENT_YEAR + " internship program";

        System.out.println(welcomeMessage);
    }
}
