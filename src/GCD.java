
public class GCD {
	public static void main(String[] args) {

		System.out.print(gcd(497,322));
	}
	public static int gcd(int a, int b) {
		int h;
		while (b != 0) {
			h = b;
			b = a % b;
			a = h;
		}

		return a;


	}
}
