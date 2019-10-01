
public class GCD {
	public static void main(String[] args) {

		System.out.print(gcd(-36,60));
	}
	public static int gcd(int a, int b) {
		int h;
		while (b != 0) {
			h = b;
			b = a % b;
			a = h;
		}
		if(a<0)
			a = a * -1;
		return a;


	}
}
