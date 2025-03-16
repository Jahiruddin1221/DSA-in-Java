package Array;

public class averageMarks {
    public static void main(String[] args) {
        System.out.println("Find the average of student marks\n");

        int[] marks = {50, 90, 85, 48, 75, 68};
        float sum = 0;
        for (int elements: marks) {
            sum += elements;
//            int mar = sum / marks.length;
//            System.out.println(mar);

        }
        System.out.println("The total marks is " + sum);
        float mar = sum / marks.length;
        System.out.println("And average marks is " + mar);

    }
}
