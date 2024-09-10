// Swap two numbers using third variable
package Solution_1;

import java.util.Scanner;

public class Swapping {
	

	public static void main(String[] args) {
		int no1,no2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers : ");
		no1 = scan.nextInt();
		no2 = scan.nextInt();
		
		System.out.println("Before Swaping\n no1 = " + no1 + "\tno2 = " + no2);
//		no1 = no1 + no2;
//		no2 = no1 - no2;
//		no1 = no1 - no2;
		
		// using XOR operator
		no1 = no1 ^ no2;
		no2 = no1 ^ no2;
		no1 = no1 ^ no2;
		System.out.println("After Swaping\n no1 = " + no1 + "\tno2 = " + no2);
	}

}














