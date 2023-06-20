import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1,x2,x3, exam, finalGrade;
        final double EX_PART=0.05, EXAM_PART=0.85;

        System.out.println("Enter the first exam grade: ");
        x1 = scan.nextInt();
        System.out.println("Enter the second exam grade: ");
        x2 = scan.nextInt();
        System.out.println("Enter the third exam grade: ");
        x3 = scan.nextInt();
        System.out.println("Enter the final exam grade: ");
        exam = scan.nextInt();

        finalGrade = (int) (EX_PART*(x1+x2+x3)/3 + EXAM_PART*exam);

        System.out.println("The final grade is: " + finalGrade);

    }
}