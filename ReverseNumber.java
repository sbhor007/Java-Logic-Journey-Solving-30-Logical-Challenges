//Display Reverse Number

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A number : ");
		int no = scan.nextInt();
		
		int reveseNo = 0;
		while(no != 0) {
			reveseNo = (reveseNo * 10)+(no % 10);
			no = (int)no/10;
		}
		
		System.out.println("reverse number is : " + reveseNo);
	}

}
