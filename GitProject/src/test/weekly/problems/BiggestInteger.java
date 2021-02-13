package test.weekly.problems;

public class BiggestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNUM1 = 10;
		int myNUM2 = 62;
		int myNUM3 = 61;
		
		if((myNUM1 > myNUM2) && (myNUM1 > myNUM3))
		{
			System.out.println(myNUM1 + " is the biggest");
		}
		else if((myNUM2 > myNUM3) && (myNUM2 > myNUM1))
		{
			System.out.println(myNUM2 + " is the biggest");
		}else 
		{
			System.out.println(myNUM3 + " is the biggest");
		}
	}

}
