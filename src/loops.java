
public class loops {
	public static void main(String[] args) {
		
		printSomething();
	}

	private static void printSomething() {
		for (int i=0; i<10; i++) { //vi lader vores løkke tælle op til 10, selvom det ikke er nødvendigt, dette vil gøre det nemmere at udvide og modifisere programmet
			  if (i < 4) {
			    System.out.println("999999999888888887777777666666555554444333221");
			  }
			}
	}
}
