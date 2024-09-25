// Sum of digit

import java.util.Scanner;

public class SumOfDigt {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no = scan.nextInt();
		
		int sum = 0;
		while(no != 0) {
			sum += no % 10;
			no = (int) no/10;
		}
		System.out.println("Sum of Ditis is : " + sum);
	}
}
