package Chapter3;

public class LoopTermination {
    public static void main(String[] args) {

        //Break: end loop/exit loop
        for (int i = 1; i < 20; i++) {
            System.out.println("i = " + i);
            if (i == 5) break;
        }

        //Continue: will skip the current iteration and start next iteration
        for (int i = 1; i < 20; i++) {
            if (i % 5 == 0) continue;
            System.out.println("i = " + i);

        }
    }
}
