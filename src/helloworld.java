
public class helloworld {
	public static void main(String[] args) {
		spids();
		hull();
		reklame();
		hull();
		spids();
	}
	
	public static void spids() {
		minPrintln("   /\\    ");
		minPrintln("  /  \\   ");
		minPrintln(" /    \\  ");
	}
			
	

	public static void hull() {
		minPrintln("+------+ ");
		minPrintln("I      I ");
		minPrintln("I      I ");
		minPrintln("+------+ ");

	}
	public static void reklame() {
		minPrintln("I D T UI ");
		minPrintln("ILyngbyI ");

	}
	private static void minPrintln(String b) {
			System.out.print(b);
			System.out.print(b);
			System.out.println(b);
	
}
}
