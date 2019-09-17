import java.util.Scanner;

public class FullName {
	public static void main(String[] args) {
		

		skrivNavn();
	}
	public static void skrivNavn() {
		System.out.println("Please enter your full name:");
		
		Scanner navn = new Scanner(System.in);
		
		String fornavn = navn.next();
		String efternavn = navn.next();
		
		String a = fornavn;
		String b = efternavn;
		System.out.println("Your name in reverse order is" + " " + b + "," + " " + a);
	}
	
}
