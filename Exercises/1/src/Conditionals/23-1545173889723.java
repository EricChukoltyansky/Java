//2.3 Salary

import java.util.Scanner;

public class Salary { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int age, salary;
		final double TAX=0.05;


		System.out.println("Please enter your age:");
		age = scan.nextInt();
		System.out.println("Please enter your salary:");
		salary = scan.nextInt();

		if(age>=18)	
			salary*=(1-TAX);	//a short way of writing: salary=salary-(salary*TAX);

		System.out.println("Your salary is: " + salary);
	}
}