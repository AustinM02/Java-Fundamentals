package Chapter2.SelectionStructures;

public class TernaryOperator {
    public static void main(String[] args) {
        //condition ? resultWhenTrue : resultWhenFalse
        int numOne = 5, numTwo = 7;
        int smallNumber;

        if(numOne < numTwo){
            smallNumber = numOne;
        }else{
            smallNumber = numTwo;
        }


        //variable =condition ? resultWhenTrue : resultWhenFalse
        smallNumber = numOne < numTwo ? numOne : numTwo;

        int number = 5;
        String results = "";

        if(number % 2 == 0){
            System.out.println("Even");
        }else if(number % 5 == 0){
            System.out.println("Multiple of 5");
        }else{
            System.out.println("Odd");
        }

        results = number % 2 == 0 ? "Even" :
                number % 5 == 0 ? "Multiple of 5" : "Odd";
        System.out.println(results);
    }
}
