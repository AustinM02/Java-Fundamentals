package Chapter3;

public class ForLoop {
    public static void main(String[] args) {

        //display Java 10 times
        for(int i = 0; i < 10; i++)
        {
            System.out.println( i + " - Java");
        }

        System.out.println("==========multi condition==========");
        //multiple conditions
        for(int x = 1, y = 5; x < 10 ; x++, y--)
        {
            System.out.println( x + "<------------>" + y);
        }

        System.out.println("==========multi condition2==========");
        //multiple conditions2
        for(int x = 1, y = 5; x < 10 && y >= 0; x++, y--)
        {
            System.out.println( x + "<------------>" + y);
        }


    }
}
