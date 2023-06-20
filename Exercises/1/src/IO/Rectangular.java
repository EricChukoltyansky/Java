import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int width, height, area, perimeter;
            
            System.out.println("Enter width");
            width = scan.nextInt();
            System.out.println("Enter height");
            height = scan.nextInt();

            area = width * height;
            perimeter = 2 * (width + height);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        }
    }
}
