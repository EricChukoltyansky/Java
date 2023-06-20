//1.4 Calculations1

import java.util.Scanner;

public class Calculations1 {

	public static void main(String[] args) {
		double x, y, sum, sub, multiply, division; //defining our variables
		Scanner scan= new Scanner(System.in);

		System.out.println("Please Enter Two Numbers:");
		x=scan.nextDouble();
		y=scan.nextDouble();	// cannot be 0!

		sum=x+y;
		sub=x-y;
		multiply=x*y;
		division=x/y;

		System.out.println(x +" + "+ y  + " = " + sum);	    //the result of x+y
		System.out.println(x +" - "+ y  + " = " + sub);	    //the result of x-y
		System.out.println(x +" * "+ y  + " = " + multiply);   //the result of x*y
		System.out.println(x +" / "+ y  + " = " + division);    //the result of x/y

	}
}
