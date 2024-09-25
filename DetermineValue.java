//Determine the given value are positive, negative or zero

import java.util.Scanner;

public class DetermineValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int no = scan.nextInt();
		
		if(no > 0)
			System.out.println("Given number is Positive");
		else if(no < 0)
			System.out.println("Given number is Negative");
		else
			System.out.println("Given number is Zero");
	}

}
