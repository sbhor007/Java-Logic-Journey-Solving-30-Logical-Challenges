// check given number is Palindromic or not

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A number : ");
		int no = scan.nextInt();
		int temp = no;

		int reveseNo = 0;
		while (temp != 0) {
			reveseNo = (reveseNo * 10) + (temp % 10);
			temp = (int) temp / 10;
		}

		if (no == reveseNo) {
			System.out.println(no + " is a palindrome number");
		}else {
			System.out.println(no + " is a not a palindrome number");
		}

	}

}
