package week1.day1.homeassignments;


public class Fibbinocci {

	public static void main(String[] args) {

		int firstNum=0, secNum=1, sum=0;
		int count=10;
		//System.out.println(firstNum);
		for (int i = 0; i <count; i++) {
			System.out.println(sum);
			sum=firstNum + secNum;
			firstNum=secNum;
			secNum=sum;
			
		}
		
	}

}

