
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input start value");
		int start = input.nextInt();
		System.out.println("Input end value");
		int end = input.nextInt();
		int sum = computeSum(start,end);
		System.out.println("Sum is of integers from "+start+" to "+end+" is "+sum);
		input.close();
	}
	private static int computeSum(int start, int end) {
		int sum = 0;
		for(int i= start; i <= end; i++) {
			sum += i ;
		}
		return (sum);
	}
}