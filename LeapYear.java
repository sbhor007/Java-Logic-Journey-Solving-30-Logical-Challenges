//check given year is Leap year or not

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Year : ");
		int year = scan.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			System.out.println(year + " is a leep year");
		else
			System.out.println(year + " is not a leep year");
	}
	

}
