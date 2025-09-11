package Chapter5;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[] arStudents = new String[]{"John", "Kate", "Jessica", "Carol"};
        int[][] atTestMarks = new int[][]{{75,74,36},
                {85,69,74}, {74,52,46}, {69,74,52}};

        System.out.println("Student\tTest1\tTest2\tTest");
        for(int i = 0; i < atTestMarks.length; i++){
            System.out.print(arStudents[i] + "\t");
            for(int j = 0; j < atTestMarks[0].length; j++){
                System.out.print(atTestMarks[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
