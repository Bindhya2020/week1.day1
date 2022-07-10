package week1.day1.homeassignments;

public class IsPrime {

	public static void main(String[] args) {
		int num = 13;
		boolean isPrime = false;
		for (int i = 2; i < num/2; i++) {
			if (num %i ==0) {
				isPrime = true;
				break;
			}
			
		}
		if (!isPrime)
			System.out.println("Prime Number");
		else
			System.out.println("Not a prime");

	}

}
