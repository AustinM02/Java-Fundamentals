package Chapter2.SelectionStructures;

public class SwtchStatement {
    public static void main(String[] args) {
        int dayOfWeek = 3;

        if(dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3){
            System.out.println("Weekdays");
        }else if(dayOfWeek == 4){
            System.out.println("Thursday");
        }else if(dayOfWeek == 5){
            System.out.println("Friday");
        }else if(dayOfWeek == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }


        //switch

        switch(dayOfWeek){
            case 1:
            case 2:
            case 3:
                System.out.println("Weekdays");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            default: System.out.println("Sunday");
        }
    }
}
