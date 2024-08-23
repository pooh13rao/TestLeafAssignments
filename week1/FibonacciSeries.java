package assignments.week1;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range = 8, num1 = 0, num2 = 1;
		System.out.println("Fibonacci Series with the range of " + range + " is:");

		for (int i = 1; i <= range; i++) {
			System.out.print(num1 + ",");
			int nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
		//	System.out.print(nextNum +",");
		}

	}

}
