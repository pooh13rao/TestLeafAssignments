package assignments.week1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14;
		
        for (int i = 2; i < n; i++) {
//        	int x = n%i;
//        	System.out.println(x);
            if (n % i == 0) {
            	
                System.out.println(n + " is not a prime number.");
            }
        }
        System.out.println(n + " is a prime number.");
    }

}
