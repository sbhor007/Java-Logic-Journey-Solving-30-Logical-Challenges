import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no = scan.nextInt();
		if(no % 2 == 0)
			System.out.println(no + " is a Even number");
		else
			System.out.println(no + " is a Odd number");
	}

}
