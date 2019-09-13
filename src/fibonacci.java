public class fibonacci {
	public static void main(String[] args) {
		// Da Fibonacci-serien hurtigt kommer over 31-bit, skal vi bruge long i stedet for int
		long n1 = 0, n2 = 1, antal = 49;

		System.out.print("1");
		for (long i = 1; i <= antal; ++i) {
			long n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
