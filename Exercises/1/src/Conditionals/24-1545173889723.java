//2.4 Extreme-Number

import java.util.Scanner;
public class ExtremeNumber {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number, firstDigit, secondDigit, thirdDigit;
		final int DIVIDER=10;

		System.out.println("Please enter 3 digits number: ");
		number = scan.nextInt();

		//check if the number has exactly 3 digits
		if(number < 100 || number > 999 ){
			System.out.println("Invalid input.");
			return;
		}

		//if we are here, the numbers is legal.
		//now check if the number is an extreme number:

		int tempNumber=number;	//all operations will be made on tempNumber, in order not to change the original number

		thirdDigit=tempNumber%DIVIDER;	//this will give us the last digit in the tempNumber
		tempNumber/=DIVIDER;	//now tempNumber will have 2 digits

		secondDigit=tempNumber%DIVIDER;
		tempNumber/=DIVIDER;

		firstDigit=tempNumber%DIVIDER;


		//check if the secondDigit is bigger than the first and third digits
		if(secondDigit > firstDigit && secondDigit > thirdDigit)
			System.out.println(number + " is an extreme number.");
		
		//check if the secondDigit is smaller than the first and third digits
		else if(secondDigit < firstDigit && secondDigit < thirdDigit)
			System.out.println(number + " is an extreme number.");
		
		// if we are here, the number is not an extreme number
		else 
			System.out.println(number + " is not an extreme number.");

	}
}
