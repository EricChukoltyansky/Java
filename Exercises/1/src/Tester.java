
public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        double salary;
        age = scan.nextInt();
        salary = scan.nextDouble();
        if (age >= 18 && age <= 64) {
            salary *= 0.95;
            System.out.println("Your salary is: " + salary);
        }
    }
}
