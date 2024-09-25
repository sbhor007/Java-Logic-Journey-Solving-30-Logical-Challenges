//create a Fibonacci series

import java.util.Scanner;

public class Fibonacci {
	
	static void fiboncciSeries(int no) {
		int no1 = 0,no2 = 1;
		System.out.print(no1 + "\t" + no2);
		for(int i = 3;i <= no;i++)
		{
			int sum = no1 + no2;
			no1 = no2;
			no2 = sum;
			System.out.print("\t" + sum);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no = scan.nextInt();
		fiboncciSeries(no);
	}

}
