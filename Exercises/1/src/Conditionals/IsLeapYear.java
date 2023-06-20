package Conditionals;

public class IsLeapYear {
    public static void main(String[] args) {
        int year = 2020;
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeapYear = true;
            } else if (year % 400 == 0) {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + " is not a leap year");
        }
    }
}
