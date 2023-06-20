import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 7: ");
        try (Scanner scan = new Scanner(System.in)) {
            int day = scan.nextInt();



            if (1 <= day && day <= 5) {
                System.out.println("It's a regular day ");
            } else {
                System.out.println("It's the weekend!");
            }
        }

        
    }
}
