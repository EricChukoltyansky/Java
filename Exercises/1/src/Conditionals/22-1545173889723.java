//2.2 Absolute value

//Original Code:
import java.util.Scanner;
public class Tester{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y, res = 0;
        x = scan.nextInt();
        y = scan.nextInt();
        
        if(x > y)
            res = x - y;
        else
            res = y - x;
        System.out.println("Result is: " + res);
    }
}

//This program calculates the absolute value of the subtraction between x and y
