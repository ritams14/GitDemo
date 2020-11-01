package program;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, fact = 1;
		for(int i = 2; i<= a; ++i)
		{
			fact = fact * i;
			//System.out.println("Factorial of " + i + " is : " +fact);
		}
		System.out.println("Factorial of " + a + " is : " +fact);
	}

}
