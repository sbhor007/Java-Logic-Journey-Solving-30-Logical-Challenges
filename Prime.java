import java.util.Scanner;

public class Prime {
	static boolean isPrime(int no) {
		if(no == 1 || no == 2)
			return true;
		for(int i = 3; i < no;i++)
		{
			if(no % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A number : ");
		int no = scan.nextInt();
		if(isPrime(no)) {
			System.out.println(no + " is a prime number");
		}else {
			System.out.println(no + " is Not a prime number");
		}

	}

}
