package Chapter5;

import java.util.Scanner;

public class GetUserInput {
    public static void main(String[] args) {
        String[] arNames = new String[3];
        Scanner sc = new Scanner(System.in);
        String name;
        int count = 0;
        while(count<3){
            System.out.print("Enter your name with at least 4 characters: ");
            name = sc.next();

            if(name.length()>=4){
                arNames[count]=name;
                count++;
            }
        }

//        for(int i = 0; i < arNames.length; i++){
//            do{
//                System.out.print("Enter your name with at least 4 characters: ");
//                name = sc.next();
//            }while(name.length() < 4);
//            arNames[i] = name;
//        }

        System.out.println("--------------------");
        for(String n : arNames){
            System.out.println(n);
        }

    }
}
