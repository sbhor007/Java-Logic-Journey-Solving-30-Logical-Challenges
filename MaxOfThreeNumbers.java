// find maximum number of three numbers

import java.util.Scanner;

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a tree numbers : ");
		int no1 = scan.nextInt();
		int no2 = scan.nextInt();
		int no3 = scan.nextInt();
		
		if(no1 > no2 && no1 > no3)
			System.out.println("Max is :" + no1);
		else if(no2 > no3)
			System.out.println("Max is :" + no2);
		else
			System.out.println("Max is :" + no3);
		

	}

}
