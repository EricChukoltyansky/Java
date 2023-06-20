//1.2 fix the messy code

//Original Code:
  public class Tester { public static void main(String[] args) {
		int x;long y; x=0;y=0;
		System.out.
		println("Welcome!")
		;
		x    ++;
		y=x+5;x--;System.out
		.println
		("now x=" + x+" And y="+y
		);
		System.out.println("Goodbye")
		;}}


//Solution:
public class Tester { 
	public static void main(String[] args) {

		int x=0;
		long y=0; 
		System.out.println("Welcome!");
		x++;
		y=x+5;
		x--;
		System.out.println("now x=" + x+" And y="+y);
		System.out.println("Goodbye");
	}
}
