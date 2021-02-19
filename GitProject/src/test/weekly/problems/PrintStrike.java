package test.weekly.problems;

public class PrintStrike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 18;
		//int divisibel1 = 3, divisible2 = 5, divisible3 = 10;
		boolean isDivivisiblebyAll = (myNum % 3==0) && (myNum % 5==0) && (myNum%10==0);
		boolean isDivivisiblebyanyOne = (myNum % 3==0) || (myNum % 5==0) || (myNum%10==0);
//		if ((myNum % 3 == 0) && (myNum % 5 == 0) && (myNum % 10 == 0)) {
//			System.out.println("1 Strike");
//		} else if(myNum % 2 == 0) {
//			System.out.println("2 Strike");
//		}else if((myNum % 3 == 0) || (myNum % 5 == 0) || (myNum % 10 == 0)) {
//			System.out.println("3 Strike");
//		}else {
//			System.out.println("0 Strike");
//		}

	if (isDivivisiblebyAll) {
		System.out.println("3 ");
	}else if(myNum % 2 == 0) {
		System.out.println("2 Strike");
	}else if (isDivivisiblebyanyOne) {
		System.out.println("1 Strike");
	}else {
		System.out.println("0 Strike");
	}
	
	}

}
