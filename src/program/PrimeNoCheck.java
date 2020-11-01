package program;

import java.util.Scanner;

public class PrimeNoCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scr=new Scanner(System.in);
		System.out.println("Enter a no : ");
		int no = scr.nextInt();*/
		int no = 77;
		boolean flag = false;
		
		for(int i =2; i<no/2; ++i)
		{
			if(no % i == 0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(no + " is a prime no");
		}
		else
		{
			System.out.println(no + " is a not prime no");
		}
	}

}
