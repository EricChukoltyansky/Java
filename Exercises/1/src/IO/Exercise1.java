import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            int x;
            System.out.println("Enter a number:");
            x = scan.nextInt();
            System.out.println("You entered" + " " + x + " ," + "Square:" + " " + x*x + " " + "Cube: " + " " + x*x*x);

        }

    }
}
