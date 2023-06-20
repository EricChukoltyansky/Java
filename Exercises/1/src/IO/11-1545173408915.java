
//1.1 Is the variable setting legal?
public class Main {
	public static void main(String[] args) {

		int carNumber;	//Legal
		int 2lines;		//Illegal - can only use a number after the variable name, like so: lines2
		int distanceToCenter; 	//Legal


		double int; 	//Illegal - 'int' cannot be defined as a variable name.
		double Int;	 //Legal but not recommended, variables should start with a low-case letter
		double int2;	//Legal but not recommended, you should use meaningful variable names


		long card#1; 	//Illegal - can't use signs other than letters and figures
		long age;		//Legal


		float age;		//Illegal - 'age' already exists
		float void; 	//Illegal - 'void' cannot be defined as a variable name.
	}
}

