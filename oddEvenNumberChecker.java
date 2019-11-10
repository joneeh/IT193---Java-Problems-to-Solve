import java.util.Scanner;

public class oddEvenNumberChecker {
	
	public static void main(String[] args) {
		
		System.out.print("Enter number: ");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		if(x%2 == 0)
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");
	}
}
