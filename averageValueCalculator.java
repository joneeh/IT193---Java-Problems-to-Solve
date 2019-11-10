import java.util.Scanner;

public class averageValueCalculator {
	
	public static void main(String[] args) {
		
		System.out.printf("Insert Array Length: ");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int array[] = new int[x];
		int total = 0;
		double average = total / array.length;
		
		for(int i=0; i <= array.length-1; i++) {
			array[i] = in.nextInt();
		}
		
		for(int i=0; i< array.length; i++) {
			total = total + array[i];
		}
		
		System.out.format("Average: %.2f", average);
	}
}
